package com.sap.cap.sflight.delta.proxy.internal;

public abstract class Any_asNullable_com_sap_cap_sflight_delta_proxy_Countries
{
    public static com.sap.cap.sflight.delta.proxy.Countries cast(final Object value)
    {
        if (value == null)
        {
            return null;
        }
        else if (value instanceof com.sap.cap.sflight.delta.proxy.Countries)
        {
            final com.sap.cap.sflight.delta.proxy.Countries var2_value = ((com.sap.cap.sflight.delta.proxy.Countries)value);
            return var2_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "com.sap.cap.sflight.delta.proxy.Countries");
        }
    }
}
