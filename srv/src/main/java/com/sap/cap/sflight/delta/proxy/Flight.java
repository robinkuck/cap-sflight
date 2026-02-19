package com.sap.cap.sflight.delta.proxy;

public class Flight
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property airlineID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flight.getProperty("AirlineID");

    public static final com.sap.cloud.server.odata.Property flightDate = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flight.getProperty("FlightDate");

    public static final com.sap.cloud.server.odata.Property connectionID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flight.getProperty("ConnectionID");

    public static final com.sap.cloud.server.odata.Property currencyCodeCode = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flight.getProperty("CurrencyCode_code");

    public static final com.sap.cloud.server.odata.Property maximumSeats = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flight.getProperty("MaximumSeats");

    public static final com.sap.cloud.server.odata.Property occupiedSeats = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flight.getProperty("OccupiedSeats");

    public static final com.sap.cloud.server.odata.Property planeType = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flight.getProperty("PlaneType");

    public static final com.sap.cloud.server.odata.Property price = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flight.getProperty("Price");

    public static final com.sap.cloud.server.odata.Property currencyCode = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flight.getProperty("CurrencyCode");

    public static final com.sap.cloud.server.odata.Property toAirline = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flight.getProperty("to_Airline");

    public static final com.sap.cloud.server.odata.Property toConnection = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flight.getProperty("to_Connection");

    public Flight()
    {
        this(true, null);
    }

    public Flight(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public Flight(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flight, withIndexMap);
    }

    public com.sap.cap.sflight.delta.proxy.Flight copy()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Flight.cast(this.copyEntity());
    }

    public String getAirlineID()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.Flight.airlineID));
    }

    public String getConnectionID()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.Flight.connectionID));
    }

    public com.sap.cap.sflight.delta.proxy.Currencies getCurrencyCode()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_Currencies.cast(this.getDataValue(com.sap.cap.sflight.delta.proxy.Flight.currencyCode));
    }

    public String getCurrencyCodeCode()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Flight.currencyCodeCode));
    }

    public com.sap.cloud.server.odata.LocalDate getFlightDate()
    {
        return com.sap.cloud.server.odata.LocalDate.castRequired(this.getDataValue(com.sap.cap.sflight.delta.proxy.Flight.flightDate));
    }

    public Integer getMaximumSeats()
    {
        return com.sap.cloud.server.odata.IntValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Flight.maximumSeats));
    }

    public Integer getOccupiedSeats()
    {
        return com.sap.cloud.server.odata.IntValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Flight.occupiedSeats));
    }

    public com.sap.cap.sflight.delta.proxy.Flight getOld()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Flight.cast(this.getOldEntity());
    }

    public String getPlaneType()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Flight.planeType));
    }

    public java.math.BigDecimal getPrice()
    {
        return com.sap.cloud.server.odata.DecimalValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Flight.price));
    }

    public com.sap.cap.sflight.delta.proxy.Airline getToAirline()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_Airline.cast(this.getDataValue(com.sap.cap.sflight.delta.proxy.Flight.toAirline));
    }

    public com.sap.cap.sflight.delta.proxy.FlightConnection getToConnection()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_FlightConnection.cast(this.getDataValue(com.sap.cap.sflight.delta.proxy.Flight.toConnection));
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final String airlineID, final com.sap.cloud.server.odata.LocalDate flightDate, final String connectionID)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("AirlineID", com.sap.cloud.server.odata.StringValue.of(airlineID)).with("FlightDate", flightDate).with("ConnectionID", com.sap.cloud.server.odata.StringValue.of(connectionID));
    }

    public static com.sap.cap.sflight.delta.proxy.FlightList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.cap.sflight.delta.proxy.FlightList.share(from);
    }

    public void setAirlineID(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Flight.airlineID, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setConnectionID(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Flight.connectionID, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setCurrencyCode(final com.sap.cap.sflight.delta.proxy.Currencies value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Flight.currencyCode, value);
    }

    public void setCurrencyCodeCode(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Flight.currencyCodeCode, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setFlightDate(final com.sap.cloud.server.odata.LocalDate value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Flight.flightDate, value);
    }

    public void setMaximumSeats(final Integer value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Flight.maximumSeats, com.sap.cloud.server.odata.IntValue.ofNullable(value));
    }

    public void setOccupiedSeats(final Integer value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Flight.occupiedSeats, com.sap.cloud.server.odata.IntValue.ofNullable(value));
    }

    public void setPlaneType(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Flight.planeType, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setPrice(final java.math.BigDecimal value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Flight.price, com.sap.cloud.server.odata.DecimalValue.ofNullable(value));
    }

    public void setToAirline(final com.sap.cap.sflight.delta.proxy.Airline value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Flight.toAirline, value);
    }

    public void setToConnection(final com.sap.cap.sflight.delta.proxy.FlightConnection value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Flight.toConnection, value);
    }
}
