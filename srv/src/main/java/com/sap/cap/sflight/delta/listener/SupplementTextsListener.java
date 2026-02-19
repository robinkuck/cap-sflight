// Note: This listener will be overwritten if the service is regenerated.
// To allow customization and avoid overwriting upon service regeneration,
// please delete this comment.

package com.sap.cap.sflight.delta.listener;

import com.sap.cloud.server.odata.*;

public class SupplementTextsListener extends com.sap.cloud.server.odata.DefaultEntityListener {
    private com.sap.cap.sflight.delta.MainServlet servlet;
    private com.sap.cap.sflight.delta.proxy.ProxyService service;

    public SupplementTextsListener(com.sap.cap.sflight.delta.MainServlet servlet, com.sap.cap.sflight.delta.proxy.ProxyService service) {
        super();
        this.servlet = servlet;
        this.service = service;
        allowUnused(this.servlet);
        allowUnused(this.service);
    }

    @Override public void beforeQuery(DataQuery query) {
        allowUnused(query);
    }

    public void beforeSave(EntityValue entityValue) {
        // Shared code for beforeCreate / beforeUpdate.
        var entity = (com.sap.cap.sflight.delta.proxy.SupplementTexts)entityValue;
        allowUnused(entity);
    }

    @Override public void beforeCreate(EntityValue entityValue) {
        var entity = (com.sap.cap.sflight.delta.proxy.SupplementTexts)entityValue;
        allowUnused(entity);
        beforeSave(entity);
    }

    @Override public void beforeUpdate(EntityValue entityValue) {
        var entity = (com.sap.cap.sflight.delta.proxy.SupplementTexts)entityValue;
        allowUnused(entity);
        beforeSave(entity);
    }

    @Override public void beforeDelete(EntityValue entityValue) {
        var entity = (com.sap.cap.sflight.delta.proxy.SupplementTexts)entityValue;
        allowUnused(entity);
    }

    public void afterSave(EntityValue entityValue) {
        // Shared code for afterCreate / afterUpdate.
        var entity = (com.sap.cap.sflight.delta.proxy.SupplementTexts)entityValue;
        allowUnused(entity);
    }

    @Override public void afterCreate(EntityValue entityValue) {
        var entity = (com.sap.cap.sflight.delta.proxy.SupplementTexts)entityValue;
        allowUnused(entity);
        afterSave(entity);
    }

    @Override public void afterUpdate(EntityValue entityValue) {
        var entity = (com.sap.cap.sflight.delta.proxy.SupplementTexts)entityValue;
        allowUnused(entity);
        afterSave(entity);
    }

    @Override public void afterDelete(EntityValue entityValue) {
        var entity = (com.sap.cap.sflight.delta.proxy.SupplementTexts)entityValue;
        allowUnused(entity);
    }
}
