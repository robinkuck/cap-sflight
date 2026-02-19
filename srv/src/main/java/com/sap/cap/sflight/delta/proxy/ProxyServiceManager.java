package com.sap.cap.sflight.delta.proxy;

public abstract class ProxyServiceManager
{
    private static com.sap.cap.sflight.delta.proxy.ProxyService service_;

    public static com.sap.cap.sflight.delta.proxy.ProxyService getService()
    {
        synchronized (ProxyServiceManager.class)
        {
            return ((com.sap.cap.sflight.delta.proxy.ProxyService)com.sap.cloud.server.odata.core.CheckProperty.isDefined(com.sap.cap.sflight.delta.proxy.ProxyServiceManager.class, "service (static)", com.sap.cap.sflight.delta.proxy.ProxyServiceManager.service_));
        }
    }

    public static void setService(final com.sap.cap.sflight.delta.proxy.ProxyService value)
    {
        synchronized (ProxyServiceManager.class)
        {
            com.sap.cap.sflight.delta.proxy.ProxyServiceManager.service_ = value;
        }
    }
}
