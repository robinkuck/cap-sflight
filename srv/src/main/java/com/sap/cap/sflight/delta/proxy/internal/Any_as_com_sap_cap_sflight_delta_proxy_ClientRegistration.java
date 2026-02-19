package com.sap.cap.sflight.delta.proxy.internal;

public abstract class Any_as_com_sap_cap_sflight_delta_proxy_ClientRegistration
{
    public static com.sap.cap.sflight.delta.proxy.ClientRegistration cast(final Object value)
    {
        if (value instanceof com.sap.cap.sflight.delta.proxy.ClientRegistration)
        {
            final com.sap.cap.sflight.delta.proxy.ClientRegistration var_value = ((com.sap.cap.sflight.delta.proxy.ClientRegistration)value);
            return var_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "com.sap.cap.sflight.delta.proxy.ClientRegistration");
        }
    }
}
