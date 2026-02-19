// Note: This handler will be overwritten if the service is regenerated.
// To allow customization and avoid overwriting upon service regeneration,
// please delete this comment.

package com.sap.cap.sflight.delta.handler;

import com.sap.cloud.server.odata.*;

public class CreateTravelByTemplateHandler extends com.sap.cloud.server.odata.DefaultMethodHandler {
    private com.sap.cap.sflight.delta.MainServlet servlet;
    private com.sap.cap.sflight.delta.proxy.ProxyService service;

    private com.sap.cap.sflight.delta.proxy.ProxyService backend;
    public CreateTravelByTemplateHandler(com.sap.cap.sflight.delta.MainServlet servlet, com.sap.cap.sflight.delta.proxy.ProxyService service) {
        super(servlet, service);
        this.servlet = servlet;
        this.service = service;
        this.backend = servlet.backend;
        allowUnused(this.servlet);
        allowUnused(this.service);
    }

    @Override public DataValue executeMethod(DataMethod method, ParameterList parameters) {
        return backend.executeMethod(method, parameters);
    }
}
