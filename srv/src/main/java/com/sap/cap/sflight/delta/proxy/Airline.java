package com.sap.cap.sflight.delta.proxy;

public class Airline
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property airlineID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.airline.getProperty("AirlineID");

    public static final com.sap.cloud.server.odata.Property airlinePicURL = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.airline.getProperty("AirlinePicURL");

    public static final com.sap.cloud.server.odata.Property currencyCodeCode = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.airline.getProperty("CurrencyCode_code");

    public static final com.sap.cloud.server.odata.Property name = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.airline.getProperty("Name");

    public static final com.sap.cloud.server.odata.Property currencyCode = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.airline.getProperty("CurrencyCode");

    public Airline()
    {
        this(true, null);
    }

    public Airline(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public Airline(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.airline, withIndexMap);
    }

    public com.sap.cap.sflight.delta.proxy.Airline copy()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Airline.cast(this.copyEntity());
    }

    public String getAirlineID()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.Airline.airlineID));
    }

    public String getAirlinePicURL()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Airline.airlinePicURL));
    }

    public com.sap.cap.sflight.delta.proxy.Currencies getCurrencyCode()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_Currencies.cast(this.getDataValue(com.sap.cap.sflight.delta.proxy.Airline.currencyCode));
    }

    public String getCurrencyCodeCode()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Airline.currencyCodeCode));
    }

    public String getName()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Airline.name));
    }

    public com.sap.cap.sflight.delta.proxy.Airline getOld()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Airline.cast(this.getOldEntity());
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final String airlineID)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("AirlineID", com.sap.cloud.server.odata.StringValue.of(airlineID));
    }

    public static com.sap.cap.sflight.delta.proxy.AirlineList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.cap.sflight.delta.proxy.AirlineList.share(from);
    }

    public void setAirlineID(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Airline.airlineID, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setAirlinePicURL(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Airline.airlinePicURL, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setCurrencyCode(final com.sap.cap.sflight.delta.proxy.Currencies value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Airline.currencyCode, value);
    }

    public void setCurrencyCodeCode(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Airline.currencyCodeCode, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setName(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Airline.name, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }
}
