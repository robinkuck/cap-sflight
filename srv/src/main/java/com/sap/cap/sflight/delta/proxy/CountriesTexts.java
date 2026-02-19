package com.sap.cap.sflight.delta.proxy;

public class CountriesTexts
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property locale = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.countriesTexts.getProperty("locale");

    public static final com.sap.cloud.server.odata.Property code = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.countriesTexts.getProperty("code");

    public static final com.sap.cloud.server.odata.Property descr = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.countriesTexts.getProperty("descr");

    public static final com.sap.cloud.server.odata.Property name = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.countriesTexts.getProperty("name");

    public CountriesTexts()
    {
        this(true, null);
    }

    public CountriesTexts(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public CountriesTexts(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.countriesTexts, withIndexMap);
    }

    public com.sap.cap.sflight.delta.proxy.CountriesTexts copy()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_CountriesTexts.cast(this.copyEntity());
    }

    public String getCode()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.CountriesTexts.code));
    }

    public String getDescr()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.CountriesTexts.descr));
    }

    public String getLocale()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.CountriesTexts.locale));
    }

    public String getName()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.CountriesTexts.name));
    }

    public com.sap.cap.sflight.delta.proxy.CountriesTexts getOld()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_CountriesTexts.cast(this.getOldEntity());
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final String locale, final String code)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("locale", com.sap.cloud.server.odata.StringValue.of(locale)).with("code", com.sap.cloud.server.odata.StringValue.of(code));
    }

    public static com.sap.cap.sflight.delta.proxy.CountriesTextsList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.cap.sflight.delta.proxy.CountriesTextsList.share(from);
    }

    public void setCode(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.CountriesTexts.code, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setDescr(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.CountriesTexts.descr, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setLocale(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.CountriesTexts.locale, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setName(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.CountriesTexts.name, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }
}
