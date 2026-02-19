package com.sap.cap.sflight.delta.proxy;

public class CurrenciesTexts
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property locale = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.currenciesTexts.getProperty("locale");

    public static final com.sap.cloud.server.odata.Property code = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.currenciesTexts.getProperty("code");

    public static final com.sap.cloud.server.odata.Property descr = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.currenciesTexts.getProperty("descr");

    public static final com.sap.cloud.server.odata.Property name = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.currenciesTexts.getProperty("name");

    public CurrenciesTexts()
    {
        this(true, null);
    }

    public CurrenciesTexts(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public CurrenciesTexts(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.currenciesTexts, withIndexMap);
    }

    public com.sap.cap.sflight.delta.proxy.CurrenciesTexts copy()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_CurrenciesTexts.cast(this.copyEntity());
    }

    public String getCode()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.CurrenciesTexts.code));
    }

    public String getDescr()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.CurrenciesTexts.descr));
    }

    public String getLocale()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.CurrenciesTexts.locale));
    }

    public String getName()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.CurrenciesTexts.name));
    }

    public com.sap.cap.sflight.delta.proxy.CurrenciesTexts getOld()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_CurrenciesTexts.cast(this.getOldEntity());
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final String locale, final String code)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("locale", com.sap.cloud.server.odata.StringValue.of(locale)).with("code", com.sap.cloud.server.odata.StringValue.of(code));
    }

    public static com.sap.cap.sflight.delta.proxy.CurrenciesTextsList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.cap.sflight.delta.proxy.CurrenciesTextsList.share(from);
    }

    public void setCode(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.CurrenciesTexts.code, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setDescr(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.CurrenciesTexts.descr, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setLocale(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.CurrenciesTexts.locale, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setName(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.CurrenciesTexts.name, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }
}
