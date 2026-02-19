package com.sap.cap.sflight.delta.proxy;

public class Countries
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property code = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.countries.getProperty("code");

    public static final com.sap.cloud.server.odata.Property descr = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.countries.getProperty("descr");

    public static final com.sap.cloud.server.odata.Property name = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.countries.getProperty("name");

    public static final com.sap.cloud.server.odata.Property texts = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.countries.getProperty("texts");

    public Countries()
    {
        this(true, null);
    }

    public Countries(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public Countries(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.countries, withIndexMap);
    }

    public com.sap.cap.sflight.delta.proxy.Countries copy()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Countries.cast(this.copyEntity());
    }

    public String getCode()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.Countries.code));
    }

    public String getDescr()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Countries.descr));
    }

    public String getName()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Countries.name));
    }

    public com.sap.cap.sflight.delta.proxy.Countries getOld()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Countries.cast(this.getOldEntity());
    }

    public com.sap.cap.sflight.delta.proxy.CountriesTextsList getTexts()
    {
        return com.sap.cap.sflight.delta.proxy.CountriesTextsList.share(com.sap.cloud.server.odata.EntityValueList.castRequired(this.getDataValue(com.sap.cap.sflight.delta.proxy.Countries.texts)));
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final String code)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("code", com.sap.cloud.server.odata.StringValue.of(code));
    }

    public static com.sap.cap.sflight.delta.proxy.CountriesList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.cap.sflight.delta.proxy.CountriesList.share(from);
    }

    public void setCode(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Countries.code, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setDescr(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Countries.descr, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setName(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Countries.name, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setTexts(final com.sap.cap.sflight.delta.proxy.CountriesTextsList value)
    {
        com.sap.cap.sflight.delta.proxy.Countries.texts.setEntityList(this, com.sap.cloud.server.odata.EntityValueList.share(value));
    }
}
