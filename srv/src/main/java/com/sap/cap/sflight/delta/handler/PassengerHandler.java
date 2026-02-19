// Note: This handler will be overwritten if the service is regenerated.
// To allow customization and avoid overwriting upon service regeneration,
// please delete this comment.

package com.sap.cap.sflight.delta.handler;

import com.sap.cloud.server.odata.*;

public class PassengerHandler extends com.sap.cloud.server.odata.DefaultEntityHandler {
    private com.sap.cap.sflight.delta.MainServlet servlet;
    private com.sap.cap.sflight.delta.proxy.ProxyService service;
    private com.sap.cap.sflight.delta.proxy.ProxyService backend;
    private ChangePropagator propagator;

    public PassengerHandler(com.sap.cap.sflight.delta.MainServlet servlet, com.sap.cap.sflight.delta.proxy.ProxyService service) {
        super(servlet, service);
        this.servlet = servlet;
        this.service = service;
        this.backend = servlet.backend;
        this.propagator = new ChangePropagator(backend.getProvider());
        allowUnused(this.servlet);
        allowUnused(this.service);
        allowUnused(this.backend);
    }

    @Override public DataValue executeQuery(DataQuery query) {
        if (query.getTrackChanges()) {
            return service.executeQuery(query).getResult();
        }
        else {
            return com.sap.cap.sflight.delta.QueryExecutor.executeQuery(backend, query, headersFromQuery(query), null);
        }
    }

    @Override public void createEntity(EntityValue entityValue) {
        var entity = (com.sap.cap.sflight.delta.proxy.Passenger)entityValue;
        var headers = new com.sap.cloud.server.odata.http.HttpHeaders();
        var options = new RequestOptions().withBackendState();
        propagator.createEntity(entity, headers, options);
    }

    @Override public void updateEntity(EntityValue entityValue) {
        var entity = (com.sap.cap.sflight.delta.proxy.Passenger)entityValue;
        var headers = new com.sap.cloud.server.odata.http.HttpHeaders();
        var options = new RequestOptions().withBackendState();
        if (!(entity.isPatch() || entity.isPatched())) options.update(UpdateMode.REPLACE);
        propagator.updateEntity(entity, headers, options);
    }

    @Override public void deleteEntity(EntityValue entityValue) {
        var entity = (com.sap.cap.sflight.delta.proxy.Passenger)entityValue;
        var headers = new com.sap.cloud.server.odata.http.HttpHeaders();
        var options = new RequestOptions().withBackendState();
        propagator.deleteEntity(entity, headers, options);
    }
}
