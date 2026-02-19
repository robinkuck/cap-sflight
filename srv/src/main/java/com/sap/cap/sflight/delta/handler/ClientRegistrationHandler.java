// Note: This handler will be overwritten if the service is regenerated.
// To allow customization and avoid overwriting upon service regeneration,
// please delete this comment.

package com.sap.cap.sflight.delta.handler;

import com.sap.cloud.server.odata.*;

public class ClientRegistrationHandler extends com.sap.cloud.server.odata.DefaultEntityHandler {
    private com.sap.cap.sflight.delta.MainServlet servlet;
    private com.sap.cap.sflight.delta.proxy.ProxyService service;
    private com.sap.cap.sflight.delta.proxy.ProxyService backend;

    public ClientRegistrationHandler(com.sap.cap.sflight.delta.MainServlet servlet, com.sap.cap.sflight.delta.proxy.ProxyService service) {
        super(servlet, service);
        this.servlet = servlet;
        this.service = service;
        this.backend = servlet.backend;
        allowUnused(this.servlet);
        allowUnused(this.service);
        allowUnused(this.backend);
    }

    @Override public DataValue executeQuery(DataQuery query) {
        query.filter(com.sap.cap.sflight.delta.proxy.ClientRegistration.clientGUID.equal(servlet.getClientGUID()));
        EntityValueList result = service.executeQuery(query).getEntityList();
        EntityValue entity = result.isEmpty() ? null : result.single();
        if (entity != null) servlet.provider.updateClientExpiry(entity);
        return result;
    }

    @Override public void createEntity(EntityValue entityValue) {
        var entity = (com.sap.cap.sflight.delta.proxy.ClientRegistration)entityValue;
        GuidValue guid = servlet.getClientGUID();
        ListBase existing = service.getClientRegistrationSet(new DataQuery().filter(com.sap.cap.sflight.delta.proxy.ClientRegistration.clientGUID.equal(guid)));
        if (existing.length() > 0) throw DataServiceException.withStatus(409, "Duplicate client registration for Client-Instance-ID: " + guid).safe();
        entity.setClientGUID(guid);
        entity.setAuthorizedUser(servlet.currentUserIfAuthenticated());
        service.createEntity(entity);
        servlet.provider.createClientExpiry(entity);
    }

    @Override public void updateEntity(EntityValue entityValue) {
        var entity = (com.sap.cap.sflight.delta.proxy.ClientRegistration)entityValue;
        entity.setMustBeModified(true);
        service.updateEntity(entity);
    }

    @Override public void deleteEntity(EntityValue entityValue) {
        var entity = (com.sap.cap.sflight.delta.proxy.ClientRegistration)entityValue;
        service.deleteEntity(entity);
    }
}
