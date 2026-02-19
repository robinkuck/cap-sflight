package com.sap.cap.sflight.delta.proxy;

public class Airport
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property airportID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.airport.getProperty("AirportID");

    public static final com.sap.cloud.server.odata.Property city = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.airport.getProperty("City");

    public static final com.sap.cloud.server.odata.Property countryCodeCode = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.airport.getProperty("CountryCode_code");

    public static final com.sap.cloud.server.odata.Property name = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.airport.getProperty("Name");

    public static final com.sap.cloud.server.odata.Property countryCode = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.airport.getProperty("CountryCode");

    public Airport()
    {
        this(true, null);
    }

    public Airport(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public Airport(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.airport, withIndexMap);
    }

    public com.sap.cap.sflight.delta.proxy.Airport copy()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Airport.cast(this.copyEntity());
    }

    public String getAirportID()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.Airport.airportID));
    }

    public String getCity()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Airport.city));
    }

    public com.sap.cap.sflight.delta.proxy.Countries getCountryCode()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_Countries.cast(this.getDataValue(com.sap.cap.sflight.delta.proxy.Airport.countryCode));
    }

    public String getCountryCodeCode()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Airport.countryCodeCode));
    }

    public String getName()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Airport.name));
    }

    public com.sap.cap.sflight.delta.proxy.Airport getOld()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Airport.cast(this.getOldEntity());
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final String airportID)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("AirportID", com.sap.cloud.server.odata.StringValue.of(airportID));
    }

    public static com.sap.cap.sflight.delta.proxy.AirportList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.cap.sflight.delta.proxy.AirportList.share(from);
    }

    public void setAirportID(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Airport.airportID, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setCity(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Airport.city, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setCountryCode(final com.sap.cap.sflight.delta.proxy.Countries value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Airport.countryCode, value);
    }

    public void setCountryCodeCode(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Airport.countryCodeCode, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setName(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Airport.name, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }
}
