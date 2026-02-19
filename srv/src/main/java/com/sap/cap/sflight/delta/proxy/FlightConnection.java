package com.sap.cap.sflight.delta.proxy;

public class FlightConnection
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property connectionID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flightConnection.getProperty("ConnectionID");

    public static final com.sap.cloud.server.odata.Property airlineID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flightConnection.getProperty("AirlineID");

    public static final com.sap.cloud.server.odata.Property arrivalTime = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flightConnection.getProperty("ArrivalTime");

    public static final com.sap.cloud.server.odata.Property departureAirportAirportID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flightConnection.getProperty("DepartureAirport_AirportID");

    public static final com.sap.cloud.server.odata.Property departureTime = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flightConnection.getProperty("DepartureTime");

    public static final com.sap.cloud.server.odata.Property destinationAirportAirportID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flightConnection.getProperty("DestinationAirport_AirportID");

    public static final com.sap.cloud.server.odata.Property distance = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flightConnection.getProperty("Distance");

    public static final com.sap.cloud.server.odata.Property distanceUnit = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flightConnection.getProperty("DistanceUnit");

    public static final com.sap.cloud.server.odata.Property departureAirport = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flightConnection.getProperty("DepartureAirport");

    public static final com.sap.cloud.server.odata.Property destinationAirport = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flightConnection.getProperty("DestinationAirport");

    public static final com.sap.cloud.server.odata.Property toAirline = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flightConnection.getProperty("to_Airline");

    public FlightConnection()
    {
        this(true, null);
    }

    public FlightConnection(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public FlightConnection(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flightConnection, withIndexMap);
    }

    public com.sap.cap.sflight.delta.proxy.FlightConnection copy()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_FlightConnection.cast(this.copyEntity());
    }

    public String getAirlineID()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.FlightConnection.airlineID));
    }

    public com.sap.cloud.server.odata.LocalTime getArrivalTime()
    {
        return com.sap.cloud.server.odata.LocalTime.castOptional(this.getDataValue(com.sap.cap.sflight.delta.proxy.FlightConnection.arrivalTime));
    }

    public String getConnectionID()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.FlightConnection.connectionID));
    }

    public com.sap.cap.sflight.delta.proxy.Airport getDepartureAirport()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_Airport.cast(this.getDataValue(com.sap.cap.sflight.delta.proxy.FlightConnection.departureAirport));
    }

    public String getDepartureAirportAirportID()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.FlightConnection.departureAirportAirportID));
    }

    public com.sap.cloud.server.odata.LocalTime getDepartureTime()
    {
        return com.sap.cloud.server.odata.LocalTime.castOptional(this.getDataValue(com.sap.cap.sflight.delta.proxy.FlightConnection.departureTime));
    }

    public com.sap.cap.sflight.delta.proxy.Airport getDestinationAirport()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_Airport.cast(this.getDataValue(com.sap.cap.sflight.delta.proxy.FlightConnection.destinationAirport));
    }

    public String getDestinationAirportAirportID()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.FlightConnection.destinationAirportAirportID));
    }

    public Integer getDistance()
    {
        return com.sap.cloud.server.odata.IntValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.FlightConnection.distance));
    }

    public String getDistanceUnit()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.FlightConnection.distanceUnit));
    }

    public com.sap.cap.sflight.delta.proxy.FlightConnection getOld()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_FlightConnection.cast(this.getOldEntity());
    }

    public com.sap.cap.sflight.delta.proxy.Airline getToAirline()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_Airline.cast(this.getDataValue(com.sap.cap.sflight.delta.proxy.FlightConnection.toAirline));
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final String connectionID, final String airlineID)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("ConnectionID", com.sap.cloud.server.odata.StringValue.of(connectionID)).with("AirlineID", com.sap.cloud.server.odata.StringValue.of(airlineID));
    }

    public static com.sap.cap.sflight.delta.proxy.FlightConnectionList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.cap.sflight.delta.proxy.FlightConnectionList.share(from);
    }

    public void setAirlineID(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.FlightConnection.airlineID, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setArrivalTime(final com.sap.cloud.server.odata.LocalTime value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.FlightConnection.arrivalTime, value);
    }

    public void setConnectionID(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.FlightConnection.connectionID, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setDepartureAirport(final com.sap.cap.sflight.delta.proxy.Airport value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.FlightConnection.departureAirport, value);
    }

    public void setDepartureAirportAirportID(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.FlightConnection.departureAirportAirportID, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setDepartureTime(final com.sap.cloud.server.odata.LocalTime value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.FlightConnection.departureTime, value);
    }

    public void setDestinationAirport(final com.sap.cap.sflight.delta.proxy.Airport value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.FlightConnection.destinationAirport, value);
    }

    public void setDestinationAirportAirportID(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.FlightConnection.destinationAirportAirportID, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setDistance(final Integer value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.FlightConnection.distance, com.sap.cloud.server.odata.IntValue.ofNullable(value));
    }

    public void setDistanceUnit(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.FlightConnection.distanceUnit, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setToAirline(final com.sap.cap.sflight.delta.proxy.Airline value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.FlightConnection.toAirline, value);
    }
}
