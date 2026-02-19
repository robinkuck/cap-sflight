package com.sap.cap.sflight.delta.proxy;

public class SupplementTypeTexts
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property locale = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplementTypeTexts.getProperty("locale");

    public static final com.sap.cloud.server.odata.Property code = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplementTypeTexts.getProperty("code");

    public static final com.sap.cloud.server.odata.Property descr = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplementTypeTexts.getProperty("descr");

    public static final com.sap.cloud.server.odata.Property name = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplementTypeTexts.getProperty("name");

    public SupplementTypeTexts()
    {
        this(true, null);
    }

    public SupplementTypeTexts(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public SupplementTypeTexts(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplementTypeTexts, withIndexMap);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTypeTexts copy()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_SupplementTypeTexts.cast(this.copyEntity());
    }

    public String getCode()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.SupplementTypeTexts.code));
    }

    public String getDescr()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.SupplementTypeTexts.descr));
    }

    public String getLocale()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.SupplementTypeTexts.locale));
    }

    public String getName()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.SupplementTypeTexts.name));
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTypeTexts getOld()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_SupplementTypeTexts.cast(this.getOldEntity());
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final String locale, final String code)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("locale", com.sap.cloud.server.odata.StringValue.of(locale)).with("code", com.sap.cloud.server.odata.StringValue.of(code));
    }

    public static com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList.share(from);
    }

    public void setCode(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.SupplementTypeTexts.code, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setDescr(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.SupplementTypeTexts.descr, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setLocale(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.SupplementTypeTexts.locale, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setName(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.SupplementTypeTexts.name, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }
}
