package com.sap.cap.sflight.delta.proxy.internal;

public abstract class Any_as_com_sap_cap_sflight_delta_proxy_SupplementTypeTexts
{
    public static com.sap.cap.sflight.delta.proxy.SupplementTypeTexts cast(final Object value)
    {
        if (value instanceof com.sap.cap.sflight.delta.proxy.SupplementTypeTexts)
        {
            final com.sap.cap.sflight.delta.proxy.SupplementTypeTexts var_value = ((com.sap.cap.sflight.delta.proxy.SupplementTypeTexts)value);
            return var_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "com.sap.cap.sflight.delta.proxy.SupplementTypeTexts");
        }
    }
}
