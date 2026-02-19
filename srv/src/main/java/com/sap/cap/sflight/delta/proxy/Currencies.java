package com.sap.cap.sflight.delta.proxy;

public class Currencies
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property code = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.currencies.getProperty("code");

    public static final com.sap.cloud.server.odata.Property descr = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.currencies.getProperty("descr");

    public static final com.sap.cloud.server.odata.Property exponent = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.currencies.getProperty("exponent");

    public static final com.sap.cloud.server.odata.Property minor = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.currencies.getProperty("minor");

    public static final com.sap.cloud.server.odata.Property minorUnit = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.currencies.getProperty("minorUnit");

    public static final com.sap.cloud.server.odata.Property name = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.currencies.getProperty("name");

    public static final com.sap.cloud.server.odata.Property numcode = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.currencies.getProperty("numcode");

    public static final com.sap.cloud.server.odata.Property symbol = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.currencies.getProperty("symbol");

    public static final com.sap.cloud.server.odata.Property texts = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.currencies.getProperty("texts");

    public Currencies()
    {
        this(true, null);
    }

    public Currencies(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public Currencies(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.currencies, withIndexMap);
    }

    public com.sap.cap.sflight.delta.proxy.Currencies copy()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Currencies.cast(this.copyEntity());
    }

    public String getCode()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.Currencies.code));
    }

    public String getDescr()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Currencies.descr));
    }

    public Integer getExponent()
    {
        return com.sap.cloud.server.odata.IntValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Currencies.exponent));
    }

    public String getMinor()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Currencies.minor));
    }

    public Short getMinorUnit()
    {
        return com.sap.cloud.server.odata.ShortValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Currencies.minorUnit));
    }

    public String getName()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Currencies.name));
    }

    public Integer getNumcode()
    {
        return com.sap.cloud.server.odata.IntValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Currencies.numcode));
    }

    public com.sap.cap.sflight.delta.proxy.Currencies getOld()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Currencies.cast(this.getOldEntity());
    }

    public String getSymbol()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Currencies.symbol));
    }

    public com.sap.cap.sflight.delta.proxy.CurrenciesTextsList getTexts()
    {
        return com.sap.cap.sflight.delta.proxy.CurrenciesTextsList.share(com.sap.cloud.server.odata.EntityValueList.castRequired(this.getDataValue(com.sap.cap.sflight.delta.proxy.Currencies.texts)));
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final String code)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("code", com.sap.cloud.server.odata.StringValue.of(code));
    }

    public static com.sap.cap.sflight.delta.proxy.CurrenciesList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.cap.sflight.delta.proxy.CurrenciesList.share(from);
    }

    public void setCode(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Currencies.code, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setDescr(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Currencies.descr, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setExponent(final Integer value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Currencies.exponent, com.sap.cloud.server.odata.IntValue.ofNullable(value));
    }

    public void setMinor(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Currencies.minor, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setMinorUnit(final Short value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Currencies.minorUnit, com.sap.cloud.server.odata.ShortValue.ofNullable(value));
    }

    public void setName(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Currencies.name, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setNumcode(final Integer value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Currencies.numcode, com.sap.cloud.server.odata.IntValue.ofNullable(value));
    }

    public void setSymbol(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Currencies.symbol, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setTexts(final com.sap.cap.sflight.delta.proxy.CurrenciesTextsList value)
    {
        com.sap.cap.sflight.delta.proxy.Currencies.texts.setEntityList(this, com.sap.cloud.server.odata.EntityValueList.share(value));
    }
}
