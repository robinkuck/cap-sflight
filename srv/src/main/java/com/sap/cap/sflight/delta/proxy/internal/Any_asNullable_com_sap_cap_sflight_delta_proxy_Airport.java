package com.sap.cap.sflight.delta.proxy.internal;

public abstract class Any_asNullable_com_sap_cap_sflight_delta_proxy_Airport
{
    public static com.sap.cap.sflight.delta.proxy.Airport cast(final Object value)
    {
        if (value == null)
        {
            return null;
        }
        else if (value instanceof com.sap.cap.sflight.delta.proxy.Airport)
        {
            final com.sap.cap.sflight.delta.proxy.Airport var2_value = ((com.sap.cap.sflight.delta.proxy.Airport)value);
            return var2_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "com.sap.cap.sflight.delta.proxy.Airport");
        }
    }
}
