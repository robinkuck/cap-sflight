package com.sap.cap.sflight.delta.proxy.internal;

public abstract class Any_asNullable_com_sap_cap_sflight_delta_proxy_TravelAgency
{
    public static com.sap.cap.sflight.delta.proxy.TravelAgency cast(final Object value)
    {
        if (value == null)
        {
            return null;
        }
        else if (value instanceof com.sap.cap.sflight.delta.proxy.TravelAgency)
        {
            final com.sap.cap.sflight.delta.proxy.TravelAgency var2_value = ((com.sap.cap.sflight.delta.proxy.TravelAgency)value);
            return var2_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "com.sap.cap.sflight.delta.proxy.TravelAgency");
        }
    }
}
