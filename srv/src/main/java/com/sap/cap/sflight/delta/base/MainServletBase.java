// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place your customizations in the MainServlet class in the parent folder.

package com.sap.cap.sflight.delta.base;

import com.sap.cloud.server.odata.*;

public abstract class MainServletBase extends DataServlet {
    public static final String CONTEXT_PATH = "/delta/TravelService/*";

    public static final int LOAD_ON_STARTUP = 110;

    private static final long serialVersionUID = 1L;

    { this.startShutdownCheck(); }

    public com.sap.cloud.server.odata.core.ThreadShutdown shutdown = new com.sap.cloud.server.odata.core.ThreadShutdown();

    @jakarta.annotation.Resource(name = "ds-sflight-db")
    public javax.sql.DataSource dataSource;

    public SQLDatabaseProvider provider;

    public com.sap.cap.sflight.delta.proxy.ProxyService service;

    public com.sap.cap.sflight.delta.proxy.ProxyService backend;

    public OnlineODataProvider backendProvider;

    public com.sap.cloud.server.odata.http.HttpClientHandler5 backendHandler;

    public com.sap.cap.sflight.delta.HeaderProvider headerProvider;

    // logger for client interactions
    public org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger("odata.server");

    // logger for cache database interactions
    public org.slf4j.Logger serviceLogger = org.slf4j.LoggerFactory.getLogger("odata.sql.sflight-db");

    // logger for backend system interactions
    public org.slf4j.Logger backendLogger = org.slf4j.LoggerFactory.getLogger("odata.http.sflight_srv");

    public com.sap.cloud.server.odata.http.HttpDestination HTTP_DESTINATION_SFLIGHT_SRV;

    public void init(jakarta.servlet.ServletConfig config) throws jakarta.servlet.ServletException {
        super.init(config);
        DataServlet.setCurrentServlet(this);
        com.sap.cloud.server.odata.http.HttpDestination.useHttpClient5();
        this.setServiceName("sflight");
        this.startMemoryMonitor(getIntegerSetting(com.sap.cap.sflight.delta.ProviderSettings.class, "MEMORY_MONITOR_INTERVAL", 10));
        this.checkServerRuntime("sap.cf");
        this.setTraceRequests(logger.isDebugEnabled());
        this.setTraceWithData(logger.isTraceEnabled());
        this.setPrettyTracing(com.sap.cap.sflight.delta.LogSettings.PRETTY_TRACING);
        this.setDefaultPageSize(1000);
        this.setMaximumGraphSize(10000);
        this.setAllowNestedPaging(false);
        this.setAllowNonPatchUpdates(false);
        this.setUpdateRequiresEntityTag(false);
        this.setDeleteRequiresEntityTag(false);
        this.setStreamBatchResponses(true);
        this.setStreamDeltaResponses(true);
        this.setStreamPlainResponses(true);
        this.setStreamMediaResponses(true);
        this.setTrackChangesByDefault(false);
        this.setRequiresAuthentication(false);
        this.setPropagateChangeSets(true);
        this.setCheckExistingBeforeUpdate(false);
        this.setCheckExistingBeforeDelete(false);
        this.setCheckExistingRelatedParent(false);
        this.setSupportsRepeatability(true);
        this.setSupportsTransaction(true);
        provider = new SQLDatabaseProvider("sflight").withDataSource(dataSource);
        provider.setTraceRequests(serviceLogger.isDebugEnabled());
        provider.setTraceWithData(serviceLogger.isTraceEnabled());
        provider.setCacheDatabase(true);
        provider.setCanModifySchema(false);
        provider.setSelectAfterCreate(false);
        provider.setSelectAfterUpdate(false);
        provider.setEnableRowVersioning(false);
        provider.setMaintainVersionColumns(false);
        provider.setEnableChangeTracking(true);
        provider.setMaintainTrackingColumns(true);
        provider.setEnableKeyTracking(true);
        provider.setFlattenComplexProperties(true);
        provider.setGenerateForeignKeyConstraints(false);
        provider.setGenerateUniqueConstraints(false);
        provider.setDailyTableMetricsAt(LocalTime.of(3, 5, 0));
        StorageOptions options = provider.getStorageOptions();
        options.setQuotedIdentifiers(false);
        options.setSchemaVersion("1.0");
        options.setTablePrefix("");
        options.setTableSuffix("");
        com.sap.cap.sflight.delta.ProviderSettings.init((com.sap.cap.sflight.delta.MainServlet)this);
        com.sap.cap.sflight.delta.ProviderSettings.init(provider);
        service = new com.sap.cap.sflight.delta.proxy.ProxyService(provider);
        headerProvider = com.sap.cap.sflight.delta.HeaderProvider.getInstance();
        headerProvider.servlet = (com.sap.cap.sflight.delta.MainServlet)this;
        headerProvider.service = service;
        HTTP_DESTINATION_SFLIGHT_SRV = com.sap.cloud.server.odata.http.HttpDestination.lookup("sflight_srv");
        backendProvider = new OnlineODataProvider("sflight_srv", HTTP_DESTINATION_SFLIGHT_SRV.getURL());
        backendProvider.setTraceRequests(backendLogger.isDebugEnabled());
        backendProvider.setTraceWithData(backendLogger.isTraceEnabled());
        backendProvider.setPrettyTracing(com.sap.cap.sflight.delta.LogSettings.PRETTY_TRACING);
        backendHandler = new com.sap.cloud.server.odata.http.HttpClientHandler5(HTTP_DESTINATION_SFLIGHT_SRV);
        backendHandler.beforeSend((request, headers) -> headerProvider.addHttpHeaders(HTTP_DESTINATION_SFLIGHT_SRV, request, headers));
        backendHandler.afterSend((response, headers) -> headerProvider.onHttpResponse(HTTP_DESTINATION_SFLIGHT_SRV, response, headers));
        backendProvider.getNetworkOptions().setHttpHandler(backendHandler);
        com.sap.cap.sflight.delta.ProviderSettings.init(backendProvider);
        backend = new com.sap.cap.sflight.delta.proxy.ProxyService(backendProvider);
        com.sap.cloud.server.odata.csdl.CsdlDocument metadata = service.getMetadata();
        metadata.setLogger(this.getLogger());
        metadata.addChangeTracking();
        metadata.addDownloadTracking();
        metadata.addCacheHandling();
        metadata.addDeltaHandling();
        metadata.addRepeatability();
        metadata.inheritAnnotations();
        metadata.applyAnnotations();
        metadata.removeServerOnly("SQL");
        metadata.removeReferences("Cache,Security,SQL");
        String schemaSQL = this.getServletResourceText("hdb-schema.sql");
        metadata.importCapEntities(schemaSQL, true, true);
        this.addMetadataCapabilities();
        this.finalizeMetadata();
        this.finalizeCompactMetadata();
        if (!provider.getCanModifySchema()) {
            provider.openSchemaWithRetryLoop();
        }
        else {
            provider.createSchemaWithRetryLoop(); // if not existing already
        }
        provider.startClientExpiryThread(shutdown);
        provider.startDeltaCleanupThread(shutdown);
        provider.startTableMetricsThread(shutdown);
        String deltaSQL = this.getServletResourceText("delta.sql");
        provider.extendSchema(deltaSQL, true, false);
        RegisterHandlers.withServlet((com.sap.cap.sflight.delta.MainServlet)this);
        RegisterListeners.withServlet((com.sap.cap.sflight.delta.MainServlet)this);
        RegisterHandlers.startRefresh((com.sap.cap.sflight.delta.MainServlet)this);
        this.logInfo("Started OData service");
        DataServlet.setCurrentServlet(null);
    }

    public void destroy() {
        shutdown.signal();
        this.logInfo("Stopped OData service");
    }

    public DataService getDataService() {
        return service;
    }
}
