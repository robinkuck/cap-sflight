package com.sap.cap.sflight.delta.proxy;

public class BookingSupplement
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property bookSupplUUID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingSupplement.getProperty("BookSupplUUID");

    public static final com.sap.cloud.server.odata.Property bookingSupplementID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingSupplement.getProperty("BookingSupplementID");

    public static final com.sap.cloud.server.odata.Property currencyCodeCode = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingSupplement.getProperty("CurrencyCode_code");

    public static final com.sap.cloud.server.odata.Property lastChangedAt = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingSupplement.getProperty("LastChangedAt");

    public static final com.sap.cloud.server.odata.Property lastChangedBy = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingSupplement.getProperty("LastChangedBy");

    public static final com.sap.cloud.server.odata.Property price = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingSupplement.getProperty("Price");

    public static final com.sap.cloud.server.odata.Property createdAt = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingSupplement.getProperty("createdAt");

    public static final com.sap.cloud.server.odata.Property createdBy = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingSupplement.getProperty("createdBy");

    public static final com.sap.cloud.server.odata.Property toBookingBookingUUID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingSupplement.getProperty("to_Booking_BookingUUID");

    public static final com.sap.cloud.server.odata.Property toSupplementSupplementID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingSupplement.getProperty("to_Supplement_SupplementID");

    public static final com.sap.cloud.server.odata.Property toTravelTravelUUID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingSupplement.getProperty("to_Travel_TravelUUID");

    public static final com.sap.cloud.server.odata.Property currencyCode = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingSupplement.getProperty("CurrencyCode");

    public static final com.sap.cloud.server.odata.Property toBooking = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingSupplement.getProperty("to_Booking");

    public static final com.sap.cloud.server.odata.Property toSupplement = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingSupplement.getProperty("to_Supplement");

    public static final com.sap.cloud.server.odata.Property toTravel = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingSupplement.getProperty("to_Travel");

    public BookingSupplement()
    {
        this(true, null);
    }

    public BookingSupplement(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public BookingSupplement(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingSupplement, withIndexMap);
    }

    public com.sap.cap.sflight.delta.proxy.BookingSupplement copy()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_BookingSupplement.cast(this.copyEntity());
    }

    public com.sap.cloud.server.odata.GuidValue getBookSupplUUID()
    {
        return com.sap.cloud.server.odata.GuidValue.castRequired(this.getDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.bookSupplUUID));
    }

    public Integer getBookingSupplementID()
    {
        return com.sap.cloud.server.odata.IntValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.bookingSupplementID));
    }

    public com.sap.cloud.server.odata.GlobalDateTime getCreatedAt()
    {
        return com.sap.cloud.server.odata.GlobalDateTime.castOptional(this.getDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.createdAt));
    }

    public String getCreatedBy()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.createdBy));
    }

    public com.sap.cap.sflight.delta.proxy.Currencies getCurrencyCode()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_Currencies.cast(this.getDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.currencyCode));
    }

    public String getCurrencyCodeCode()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.currencyCodeCode));
    }

    public com.sap.cloud.server.odata.GlobalDateTime getLastChangedAt()
    {
        return com.sap.cloud.server.odata.GlobalDateTime.castOptional(this.getDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.lastChangedAt));
    }

    public String getLastChangedBy()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.lastChangedBy));
    }

    public com.sap.cap.sflight.delta.proxy.BookingSupplement getOld()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_BookingSupplement.cast(this.getOldEntity());
    }

    public java.math.BigDecimal getPrice()
    {
        return com.sap.cloud.server.odata.DecimalValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.price));
    }

    public com.sap.cap.sflight.delta.proxy.Booking getToBooking()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_Booking.cast(this.getDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.toBooking));
    }

    public com.sap.cloud.server.odata.GuidValue getToBookingBookingUUID()
    {
        return com.sap.cloud.server.odata.GuidValue.castOptional(this.getDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.toBookingBookingUUID));
    }

    public com.sap.cap.sflight.delta.proxy.Supplement getToSupplement()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_Supplement.cast(this.getDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.toSupplement));
    }

    public String getToSupplementSupplementID()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.toSupplementSupplementID));
    }

    public com.sap.cap.sflight.delta.proxy.Travel getToTravel()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_Travel.cast(this.getDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.toTravel));
    }

    public com.sap.cloud.server.odata.GuidValue getToTravelTravelUUID()
    {
        return com.sap.cloud.server.odata.GuidValue.castOptional(this.getDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.toTravelTravelUUID));
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final com.sap.cloud.server.odata.GuidValue bookSupplUUID)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("BookSupplUUID", bookSupplUUID);
    }

    public static com.sap.cap.sflight.delta.proxy.BookingSupplementList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.cap.sflight.delta.proxy.BookingSupplementList.share(from);
    }

    public void setBookSupplUUID(final com.sap.cloud.server.odata.GuidValue value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.bookSupplUUID, value);
    }

    public void setBookingSupplementID(final Integer value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.bookingSupplementID, com.sap.cloud.server.odata.IntValue.ofNullable(value));
    }

    public void setCreatedAt(final com.sap.cloud.server.odata.GlobalDateTime value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.createdAt, value);
    }

    public void setCreatedBy(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.createdBy, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setCurrencyCode(final com.sap.cap.sflight.delta.proxy.Currencies value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.currencyCode, value);
    }

    public void setCurrencyCodeCode(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.currencyCodeCode, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setLastChangedAt(final com.sap.cloud.server.odata.GlobalDateTime value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.lastChangedAt, value);
    }

    public void setLastChangedBy(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.lastChangedBy, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setPrice(final java.math.BigDecimal value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.price, com.sap.cloud.server.odata.DecimalValue.ofNullable(value));
    }

    public void setToBooking(final com.sap.cap.sflight.delta.proxy.Booking value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.toBooking, value);
    }

    public void setToBookingBookingUUID(final com.sap.cloud.server.odata.GuidValue value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.toBookingBookingUUID, value);
    }

    public void setToSupplement(final com.sap.cap.sflight.delta.proxy.Supplement value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.toSupplement, value);
    }

    public void setToSupplementSupplementID(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.toSupplementSupplementID, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setToTravel(final com.sap.cap.sflight.delta.proxy.Travel value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.toTravel, value);
    }

    public void setToTravelTravelUUID(final com.sap.cloud.server.odata.GuidValue value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.BookingSupplement.toTravelTravelUUID, value);
    }
}
