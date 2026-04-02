package com.sap.cap.sflight.processor;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.sap.cds.CdsData;
import com.sap.cds.ql.CQL;
import com.sap.cds.ql.Insert;
import com.sap.cds.ql.Select;
import com.sap.cds.ql.Upsert;
import com.sap.cds.ql.cqn.CqnPredicate;
import com.sap.cds.ql.cqn.CqnSelect;
import com.sap.cds.services.cds.CdsReadEventContext;
import com.sap.cds.services.cds.CqnService;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.On;
import com.sap.cds.services.persistence.PersistenceService;
import com.sap.cds.services.handler.annotations.ServiceName;
import com.sap.cds.services.messaging.TopicMessageEventContext;

import cds.gen.api_equipment.ApiEquipment_;
import cds.gen.api_equipment.EquipmentChangedContext;
import cds.gen.api_equipment.EquipmentCreatedContext;
import cds.gen.sap.cache.equipment.Equipment;
import cds.gen.travelservice.TravelService_;

@Component
@ServiceName(ApiEquipment_.CDS_NAME)
public class EquipmentsHandler implements EventHandler {

    private static final Logger logger = LoggerFactory.getLogger(EquipmentsHandler.class);

    @Autowired
    private PersistenceService db;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    @Qualifier(ApiEquipment_.CDS_NAME)
    private CqnService apiEquipment;

    @On(event = EquipmentCreatedContext.CDS_NAME) 
    public void onEquipmentCreated(EquipmentCreatedContext context) {
        logger.info("Received Equipment Created Event");
    }

    @On(event = EquipmentChangedContext.CDS_NAME) 
    public void onEquipmentChanged(EquipmentChangedContext context) {
        context.getCdsRuntime().requestContext().privilegedUser().run(newContext -> {
            logger.info("Received Equipment Changed Event");

            // Fetch complete equipment from API_EQUIPMENT based on the key fields in the
            // event and upsert into the cache DB
            final cds.gen.api_equipment.Equipment equipment = apiEquipment
                    .run(Select.from(cds.gen.api_equipment.Equipment_.class)
                            .where(e -> e.Equipment().eq(context.data().equipment())
                                    .and(e.ValidityEndDate().eq(context.data().validityEndDate()))))
                    .single(cds.gen.api_equipment.Equipment.class);
            CdsData data = CdsData.create(equipment);

            db.run(Upsert.into(cds.gen.sap.cache.equipment.Equipment_.class).entry(data));
        });
    }

    // This is an example how the internal filter based on the delta token (timestamp) in the query parameter of the subsequent download requests from the client could be implemented
    /*
    @On(event = CqnService.EVENT_READ, entity = Equipment_.CDS_NAME)
    public Result onReadEquipments(CdsReadEventContext context) {
        final String deltaToken = context.getParameterInfo().getQueryParameter("deltatoken");
        if (deltaToken != null) {
            CqnSelect cqn = CQL.copy(context.getCqn(), new Modifier() {
                @Override
                public CqnPredicate where(Predicate where) {
                    return CQL.and(where, lastModifiedFilter(deltaToken));
                }
            });
            return db.run(cqn);
        } else {
            return db.run(context.getCqn());
        }
    }

    private Predicate lastModifiedFilter(final String deltaToken) {
        return CQL.get(Equipment.LAST_MODIFIED).ge(val(deltaToken));
    }
    */

    // This is an example on how to load data in the Cache DB. 
    @Scheduled(initialDelay = 5000)
    public void initializeCacheDB() {
        logger.info("Initializing Cache Database");
        // final CqnSelect select = Select.from(cds.gen.api_equipment.Equipment_.class);
        // List<ApiEquipment> equipments = apiEquipment.run(select).listOf(ApiEquipment.class);
        // CdsResul<?> result = bupa.run(select);
        // db.run(Insert.into(cds.gen.cacheservice.Equipment_.CDS_NAME).entries(result));
    }
    
    public List<Long> getActiveClientsByDownloadSet(String downloadSet) {
        // For the join and expiry check, you'll need to use native SQL
        // because CQN doesn't support joins on non-CDS entities easily
        String sql = "SELECT kt.ClientID " +
                     "FROM TravelService_xs_key_tracking kt " +
                     "INNER JOIN TravelService_xs_client_expiry ce " +
                     "  ON kt.ClientID = ce.ClientID " +
                     "WHERE kt.DownloadSet = ? " +
                     "  AND ce.ExpiryTime > CURRENT_TIMESTAMP";
        
        return jdbcTemplate.queryForList(sql, Long.class, downloadSet);
    }
}
