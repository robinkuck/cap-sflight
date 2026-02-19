// This class can be used to customize query execution in backend OData/OpenAPI systems.

package com.sap.cap.sflight.delta;

import com.sap.cloud.server.odata.*;
import com.sap.cloud.server.odata.http.*;

public class QueryExecutor {
    // The following code can be customized to enable client-managed paging (using $top and $orderby) for backend queries
    // if the backend returns unreliable next-links (i.e. may omit entities due to concurrent changes, such as deletions).

    private static boolean CLIENT_MANAGED_PAGING = false;
    private static int DEFAULT_PAGE_SIZE = 1000;

    // Cache refresh can be optimized by streaming of delta responses, if the backend supports delta links. Even though it
    // is enabled by default, the 'nonDeltaEntitySets' allows auto-discovery of non-delta backends, with fallback to the
    // normal cache merge handling behaviour. If the backend doesn't support delta links, set STREAM_DELTA_RESPONSE to
    // false to disable the auto-discovery step.

    private static boolean STREAM_DELTA_RESPONSE = true;
    private static int DELTA_BATCH_SIZE = 1000;
    private static StringSet nonDeltaEntitySets = StringSet.concurrent();

    public static DataValue executeQuery(DataService service, DataQuery query, HttpHeaders headers, RequestOptions options) {
        headers = HttpHeaders.emptyIfNull(headers);
        options = RequestOptions.noneIfNull(options);
        EntitySet entitySet = query.getRequiredEntitySet();
        String entitySetName = entitySet.getLocalName();
        EntityType entityType = entitySet.getEntityType();
        query.setUrl(null); // Allow service.executeQuery call to reformulate the query URL.
        if (entitySet.getOpenAPICompatibleClient()) {
            // Clear the select items if backend doesn't support $select.
            query.setSelectItems(null);
        }
        if (CLIENT_MANAGED_PAGING
            && query.getEntityKey() == null
            && query.getTopCount() == null
            && query.getSkipCount() == null)
        {
            int pageSize = DEFAULT_PAGE_SIZE; // Some entity types might require a non-default page size.
            // If some entity types have composite keys, the following code will need customization
            // (see https://learn.microsoft.com/th-th/ef/core/querying/pagination#keyset-pagination)
            Property keyProperty = entityType.getKeyProperties().single();
            query.top(pageSize).orderBy(keyProperty);
            EntityValueList result = new EntityValueList().withItemType(entityType);
            for (;;)
            {
                if (result.isNotEmpty())
                {
                    EntityValue last = result.last();
                    DataValue lastKey = last.getDataValue(keyProperty);
                    query.setQueryFilter(keyProperty.greaterThan(lastKey));
                }
                EntityValueList more = service.executeQuery(query, headers, options).withDefaults().getEntityList();
                if (more.isEmpty()) break;
                result.addAll(more);
            }
            return result;
        }
        if (STREAM_DELTA_RESPONSE && options.getForCacheRefresh() && !nonDeltaEntitySets.has(entitySetName)) {
            // Optimize memory utilization by streaming and by avoiding cache merge.
            DataContext context = new DataContext(service.getMetadata());
            EntityValueList batch = new EntityValueList().withItemType(entityType);
            String deltaLink = null;
            query.setStreamResponse(true);
            for (;;) {
                DeltaStream stream = service.executeQuery(query, headers, options).withDefaults().getDeltaStream();
                while (stream.next()) {
                    if (stream.hasEntity()) {
                        EntityValue entity = stream.getEntity();
                        batch.add(entity);
                    }
                    applyChanges(batch, false);
                }
                stream.close();
                String nextLink = context.makeRelative(stream.getNextLink());
                if (nextLink == null) {
                    deltaLink = context.makeRelative(stream.getDeltaLink());
                    break;
                }
                query.setUrl(nextLink);
            }
            applyChanges(batch, true);
            if (deltaLink != null) {
                EntityValueList done = new EntityValueList();
                done.setDeltaLink(deltaLink);
                done.setLoadedByDCN(EntityValueList.DCN_FULL_REFRESH);
                return done;
            }
            nonDeltaEntitySets.add(entitySetName); // Don't bother trying streaming next time.
            query.setStreamResponse(false);
            // Fall through into code below, which re-runs the query without delta streaming.
        }
        return service.executeQuery(query, headers, options).withDefaults().getEntityList();
    }

    private static void applyChanges(EntityValueList batch, boolean last) {
        DataServlet servlet = MainServlet.getInstance();
        int count = batch.length();
        if (count >= (last ? 1 : DELTA_BATCH_SIZE)) {
            servlet.dcnTransaction(batch);
            batch.clear();
        }
    }
}
