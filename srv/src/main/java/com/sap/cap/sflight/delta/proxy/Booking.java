package com.sap.cap.sflight.delta.proxy;

public class Booking
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property bookingUUID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.booking.getProperty("BookingUUID");

    public static final com.sap.cloud.server.odata.Property bookingDate = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.booking.getProperty("BookingDate");

    public static final com.sap.cloud.server.odata.Property bookingID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.booking.getProperty("BookingID");

    public static final com.sap.cloud.server.odata.Property bookingStatusCode = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.booking.getProperty("BookingStatus_code");

    public static final com.sap.cloud.server.odata.Property connectionID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.booking.getProperty("ConnectionID");

    public static final com.sap.cloud.server.odata.Property currencyCodeCode = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.booking.getProperty("CurrencyCode_code");

    public static final com.sap.cloud.server.odata.Property flightDate = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.booking.getProperty("FlightDate");

    public static final com.sap.cloud.server.odata.Property flightPrice = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.booking.getProperty("FlightPrice");

    public static final com.sap.cloud.server.odata.Property lastChangedAt = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.booking.getProperty("LastChangedAt");

    public static final com.sap.cloud.server.odata.Property lastChangedBy = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.booking.getProperty("LastChangedBy");

    public static final com.sap.cloud.server.odata.Property createdAt = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.booking.getProperty("createdAt");

    public static final com.sap.cloud.server.odata.Property createdBy = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.booking.getProperty("createdBy");

    public static final com.sap.cloud.server.odata.Property toCarrierAirlineID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.booking.getProperty("to_Carrier_AirlineID");

    public static final com.sap.cloud.server.odata.Property toCustomerCustomerID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.booking.getProperty("to_Customer_CustomerID");

    public static final com.sap.cloud.server.odata.Property toTravelTravelUUID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.booking.getProperty("to_Travel_TravelUUID");

    public static final com.sap.cloud.server.odata.Property bookingStatus = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.booking.getProperty("BookingStatus");

    public static final com.sap.cloud.server.odata.Property currencyCode = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.booking.getProperty("CurrencyCode");

    public static final com.sap.cloud.server.odata.Property toBookSupplement = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.booking.getProperty("to_BookSupplement");

    public static final com.sap.cloud.server.odata.Property toCarrier = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.booking.getProperty("to_Carrier");

    public static final com.sap.cloud.server.odata.Property toCustomer = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.booking.getProperty("to_Customer");

    public static final com.sap.cloud.server.odata.Property toFlight = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.booking.getProperty("to_Flight");

    public static final com.sap.cloud.server.odata.Property toTravel = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.booking.getProperty("to_Travel");

    public Booking()
    {
        this(true, null);
    }

    public Booking(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public Booking(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.booking, withIndexMap);
    }

    public com.sap.cap.sflight.delta.proxy.Booking copy()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Booking.cast(this.copyEntity());
    }

    public com.sap.cloud.server.odata.LocalDate getBookingDate()
    {
        return com.sap.cloud.server.odata.LocalDate.castOptional(this.getDataValue(com.sap.cap.sflight.delta.proxy.Booking.bookingDate));
    }

    public Integer getBookingID()
    {
        return com.sap.cloud.server.odata.IntValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Booking.bookingID));
    }

    public com.sap.cap.sflight.delta.proxy.BookingStatus getBookingStatus()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_BookingStatus.cast(this.getDataValue(com.sap.cap.sflight.delta.proxy.Booking.bookingStatus));
    }

    public String getBookingStatusCode()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Booking.bookingStatusCode));
    }

    public com.sap.cloud.server.odata.GuidValue getBookingUUID()
    {
        return com.sap.cloud.server.odata.GuidValue.castRequired(this.getDataValue(com.sap.cap.sflight.delta.proxy.Booking.bookingUUID));
    }

    public String getConnectionID()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Booking.connectionID));
    }

    public com.sap.cloud.server.odata.GlobalDateTime getCreatedAt()
    {
        return com.sap.cloud.server.odata.GlobalDateTime.castOptional(this.getDataValue(com.sap.cap.sflight.delta.proxy.Booking.createdAt));
    }

    public String getCreatedBy()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Booking.createdBy));
    }

    public com.sap.cap.sflight.delta.proxy.Currencies getCurrencyCode()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_Currencies.cast(this.getDataValue(com.sap.cap.sflight.delta.proxy.Booking.currencyCode));
    }

    public String getCurrencyCodeCode()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Booking.currencyCodeCode));
    }

    public com.sap.cloud.server.odata.LocalDate getFlightDate()
    {
        return com.sap.cloud.server.odata.LocalDate.castOptional(this.getDataValue(com.sap.cap.sflight.delta.proxy.Booking.flightDate));
    }

    public java.math.BigDecimal getFlightPrice()
    {
        return com.sap.cloud.server.odata.DecimalValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Booking.flightPrice));
    }

    public com.sap.cloud.server.odata.GlobalDateTime getLastChangedAt()
    {
        return com.sap.cloud.server.odata.GlobalDateTime.castOptional(this.getDataValue(com.sap.cap.sflight.delta.proxy.Booking.lastChangedAt));
    }

    public String getLastChangedBy()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Booking.lastChangedBy));
    }

    public com.sap.cap.sflight.delta.proxy.Booking getOld()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Booking.cast(this.getOldEntity());
    }

    public com.sap.cap.sflight.delta.proxy.BookingSupplementList getToBookSupplement()
    {
        return com.sap.cap.sflight.delta.proxy.BookingSupplementList.share(com.sap.cloud.server.odata.EntityValueList.castRequired(this.getDataValue(com.sap.cap.sflight.delta.proxy.Booking.toBookSupplement)));
    }

    public com.sap.cap.sflight.delta.proxy.Airline getToCarrier()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_Airline.cast(this.getDataValue(com.sap.cap.sflight.delta.proxy.Booking.toCarrier));
    }

    public String getToCarrierAirlineID()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Booking.toCarrierAirlineID));
    }

    public com.sap.cap.sflight.delta.proxy.Passenger getToCustomer()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_Passenger.cast(this.getDataValue(com.sap.cap.sflight.delta.proxy.Booking.toCustomer));
    }

    public String getToCustomerCustomerID()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Booking.toCustomerCustomerID));
    }

    public com.sap.cap.sflight.delta.proxy.Flight getToFlight()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_Flight.cast(this.getDataValue(com.sap.cap.sflight.delta.proxy.Booking.toFlight));
    }

    public com.sap.cap.sflight.delta.proxy.Travel getToTravel()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_Travel.cast(this.getDataValue(com.sap.cap.sflight.delta.proxy.Booking.toTravel));
    }

    public com.sap.cloud.server.odata.GuidValue getToTravelTravelUUID()
    {
        return com.sap.cloud.server.odata.GuidValue.castOptional(this.getDataValue(com.sap.cap.sflight.delta.proxy.Booking.toTravelTravelUUID));
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final com.sap.cloud.server.odata.GuidValue bookingUUID)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("BookingUUID", bookingUUID);
    }

    public static com.sap.cap.sflight.delta.proxy.BookingList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.cap.sflight.delta.proxy.BookingList.share(from);
    }

    public void setBookingDate(final com.sap.cloud.server.odata.LocalDate value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Booking.bookingDate, value);
    }

    public void setBookingID(final Integer value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Booking.bookingID, com.sap.cloud.server.odata.IntValue.ofNullable(value));
    }

    public void setBookingStatus(final com.sap.cap.sflight.delta.proxy.BookingStatus value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Booking.bookingStatus, value);
    }

    public void setBookingStatusCode(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Booking.bookingStatusCode, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setBookingUUID(final com.sap.cloud.server.odata.GuidValue value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Booking.bookingUUID, value);
    }

    public void setConnectionID(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Booking.connectionID, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setCreatedAt(final com.sap.cloud.server.odata.GlobalDateTime value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Booking.createdAt, value);
    }

    public void setCreatedBy(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Booking.createdBy, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setCurrencyCode(final com.sap.cap.sflight.delta.proxy.Currencies value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Booking.currencyCode, value);
    }

    public void setCurrencyCodeCode(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Booking.currencyCodeCode, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setFlightDate(final com.sap.cloud.server.odata.LocalDate value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Booking.flightDate, value);
    }

    public void setFlightPrice(final java.math.BigDecimal value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Booking.flightPrice, com.sap.cloud.server.odata.DecimalValue.ofNullable(value));
    }

    public void setLastChangedAt(final com.sap.cloud.server.odata.GlobalDateTime value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Booking.lastChangedAt, value);
    }

    public void setLastChangedBy(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Booking.lastChangedBy, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setToBookSupplement(final com.sap.cap.sflight.delta.proxy.BookingSupplementList value)
    {
        com.sap.cap.sflight.delta.proxy.Booking.toBookSupplement.setEntityList(this, com.sap.cloud.server.odata.EntityValueList.share(value));
    }

    public void setToCarrier(final com.sap.cap.sflight.delta.proxy.Airline value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Booking.toCarrier, value);
    }

    public void setToCarrierAirlineID(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Booking.toCarrierAirlineID, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setToCustomer(final com.sap.cap.sflight.delta.proxy.Passenger value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Booking.toCustomer, value);
    }

    public void setToCustomerCustomerID(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Booking.toCustomerCustomerID, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setToFlight(final com.sap.cap.sflight.delta.proxy.Flight value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Booking.toFlight, value);
    }

    public void setToTravel(final com.sap.cap.sflight.delta.proxy.Travel value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Booking.toTravel, value);
    }

    public void setToTravelTravelUUID(final com.sap.cloud.server.odata.GuidValue value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Booking.toTravelTravelUUID, value);
    }
}
