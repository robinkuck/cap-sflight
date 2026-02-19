// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place your customizations in the MetricServlet class in the parent folder.

package com.sap.cap.sflight.delta.base;

import com.sap.cloud.server.odata.*;

public abstract class MetricServletBase extends com.sap.cloud.server.odata.metrics.MetricServlet {
    public static final String CONTEXT_PATH = "/delta/TravelService/admin/metrics/*";

    public static final int LOAD_ON_STARTUP = 120;

    private static final long serialVersionUID = 1L;

    public com.sap.cloud.server.odata.metrics.MetricService service;

    @jakarta.annotation.Resource(name = "ds-sflight-db")
    public javax.sql.DataSource dataSource;

    public SQLDatabaseProvider provider;

    public void init(jakarta.servlet.ServletConfig config) throws jakarta.servlet.ServletException {
        this.setServiceName("sflight.metrics");
        this.setStreamBatchResponses(true);
        this.setStreamPlainResponses(true);
        this.setRequiresAuthentication(false);
        provider = new SQLDatabaseProvider("sflight.metrics").withDataSource(dataSource);
        provider.setCacheDatabase(true);
        provider.setMetricProvider(true);
        provider.setCanModifySchema(false);
        boolean trace = getBooleanSetting(com.sap.cap.sflight.delta.MetricServlet.class, "TRACE_METRIC_SERVLET", false);
        boolean debug = trace || getBooleanSetting(com.sap.cap.sflight.delta.MetricServlet.class, "DEBUG_METRIC_SERVLET", false);
        this.setTraceRequests(debug);
        this.setTraceWithData(trace);
        this.setPrettyTracing(trace);
        trace = getBooleanSetting(com.sap.cap.sflight.delta.MetricServlet.class, "TRACE_METRIC_SERVICE", false);
        debug = trace || getBooleanSetting(com.sap.cap.sflight.delta.MetricServlet.class, "DEBUG_METRIC_SERVICE", false);
        provider.setTraceRequests(debug);
        provider.setTraceWithData(trace);
        StorageOptions options = provider.getStorageOptions();
        options.setQuotedIdentifiers(false);
        options.setSchemaVersion("1.0");
        options.setTablePrefix("TravelService_");
        options.setTableSuffix("");
        com.sap.cap.sflight.delta.ProviderSettings.init(provider);
        service = new com.sap.cloud.server.odata.metrics.MetricService(provider);
        com.sap.cloud.server.odata.csdl.CsdlDocument metadata = service.getMetadata();
        metadata.applyAnnotations();
        metadata.removeReferences("Security,SQL");
        super.init(config, provider);
    }
}
