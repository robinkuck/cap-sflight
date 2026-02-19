package com.sap.cap.sflight.delta.proxy;

public class TravelStatusTexts
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property locale = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelStatusTexts.getProperty("locale");

    public static final com.sap.cloud.server.odata.Property code = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelStatusTexts.getProperty("code");

    public static final com.sap.cloud.server.odata.Property descr = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelStatusTexts.getProperty("descr");

    public static final com.sap.cloud.server.odata.Property name = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelStatusTexts.getProperty("name");

    public TravelStatusTexts()
    {
        this(true, null);
    }

    public TravelStatusTexts(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public TravelStatusTexts(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelStatusTexts, withIndexMap);
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatusTexts copy()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_TravelStatusTexts.cast(this.copyEntity());
    }

    public String getCode()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.TravelStatusTexts.code));
    }

    public String getDescr()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.TravelStatusTexts.descr));
    }

    public String getLocale()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.TravelStatusTexts.locale));
    }

    public String getName()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.TravelStatusTexts.name));
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatusTexts getOld()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_TravelStatusTexts.cast(this.getOldEntity());
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final String locale, final String code)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("locale", com.sap.cloud.server.odata.StringValue.of(locale)).with("code", com.sap.cloud.server.odata.StringValue.of(code));
    }

    public static com.sap.cap.sflight.delta.proxy.TravelStatusTextsList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.cap.sflight.delta.proxy.TravelStatusTextsList.share(from);
    }

    public void setCode(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.TravelStatusTexts.code, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setDescr(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.TravelStatusTexts.descr, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setLocale(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.TravelStatusTexts.locale, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setName(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.TravelStatusTexts.name, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }
}
