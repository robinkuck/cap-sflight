package com.sap.cap.sflight.delta.proxy.internal;

public abstract class Any_as_com_sap_cap_sflight_delta_proxy_TravelStatusTexts
{
    public static com.sap.cap.sflight.delta.proxy.TravelStatusTexts cast(final Object value)
    {
        if (value instanceof com.sap.cap.sflight.delta.proxy.TravelStatusTexts)
        {
            final com.sap.cap.sflight.delta.proxy.TravelStatusTexts var_value = ((com.sap.cap.sflight.delta.proxy.TravelStatusTexts)value);
            return var_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "com.sap.cap.sflight.delta.proxy.TravelStatusTexts");
        }
    }
}
