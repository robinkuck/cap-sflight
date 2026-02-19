package com.sap.cap.sflight.delta.proxy.internal;

public abstract class Any_asNullable_com_sap_cap_sflight_delta_proxy_Passenger
{
    public static com.sap.cap.sflight.delta.proxy.Passenger cast(final Object value)
    {
        if (value == null)
        {
            return null;
        }
        else if (value instanceof com.sap.cap.sflight.delta.proxy.Passenger)
        {
            final com.sap.cap.sflight.delta.proxy.Passenger var2_value = ((com.sap.cap.sflight.delta.proxy.Passenger)value);
            return var2_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "com.sap.cap.sflight.delta.proxy.Passenger");
        }
    }
}
