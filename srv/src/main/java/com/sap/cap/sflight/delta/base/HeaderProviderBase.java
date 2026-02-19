// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place your customizations in the HeaderProvider class in the parent folder.

package com.sap.cap.sflight.delta.base;

import com.sap.cloud.server.odata.*;
import com.sap.cloud.server.odata.http.*;

public abstract class HeaderProviderBase {
    public com.sap.cap.sflight.delta.MainServlet servlet;
    public com.sap.cap.sflight.delta.proxy.ProxyService service;

    private static final StringSet PROPAGATE_HEADERS = com.sap.cap.sflight.delta.HeaderProvider.initPropagate();

    public static StringSet initPropagate() {
        return new StringSet().addThis("accept-language");
    }

    public void onTenantOpen(HttpDestination destination, HttpRequest request) {
    }

    public final void addHttpHeaders(HttpDestination destination, org.apache.hc.core5.http.HttpRequest request) {
        HttpHeaders headers = new HttpHeaders();
        addHttpHeaders(destination, request, headers);
        CopyHttpHeaders5.toRequest(headers, request);
    }

    public void addHttpHeaders(HttpDestination destination, org.apache.hc.core5.http.HttpRequest request, HttpHeaders headers) {
        HttpRequest currentRequest = DataServlet.getCurrentRequest();
        if (currentRequest != null) {
            HttpRequest batchRequest = DataServlet.getCurrentBatchRequest();
            propagateHeaders(destination, batchRequest, headers);
            propagateHeaders(destination, currentRequest, headers);
        }
        addAuthorization(destination, request, headers);
        addConnectivity(destination, request, headers);
    }

    public void onHttpResponse(HttpDestination destination, org.apache.hc.core5.http.HttpResponse response, HttpHeaders headers) {
    }

    public void addAuthorization(HttpDestination destination, org.apache.hc.core5.http.HttpRequest request, HttpHeaders headers) {
        destination.addAuthorization(servlet, request, headers);
    }

    public void addConnectivity(HttpDestination destination, org.apache.hc.core5.http.HttpRequest request, HttpHeaders headers) {
        destination.addConnectivity(servlet, request, headers);
    }

    public void propagateHeaders(HttpDestination destination, HttpRequest fromRequest, HttpHeaders toHeaders) {
        if (fromRequest == null) return;
        HttpHeaders fromHeaders = fromRequest.getRequestHeaders();
        for (String header : fromHeaders.keys()) {
            header = header.toLowerCase();
            String value = fromHeaders.get(header);
            boolean override = toHeaders.has(header);
            if (shouldPropagate(destination, header, override)) toHeaders.set(header, value);
        }
    }

    public boolean shouldPropagate(HttpDestination destination, String header, boolean override) {
        if (override) return false;
        if (PROPAGATE_HEADERS.has(header)) return true;
        for (;;) {
            int lastDash = header.lastIndexOf('-');
            if (lastDash == -1) break;
            header = header.substring(0, lastDash);
            String withStar = header + "-*";
            if (PROPAGATE_HEADERS.has(withStar)) return true;
        }
        return false;
    }
}
