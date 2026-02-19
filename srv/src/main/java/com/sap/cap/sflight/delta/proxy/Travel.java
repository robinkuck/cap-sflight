package com.sap.cap.sflight.delta.proxy;

public class Travel
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property travelUUID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel.getProperty("TravelUUID");

    public static final com.sap.cloud.server.odata.Property beginDate = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel.getProperty("BeginDate");

    public static final com.sap.cloud.server.odata.Property bookingFee = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel.getProperty("BookingFee");

    public static final com.sap.cloud.server.odata.Property currencyCodeCode = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel.getProperty("CurrencyCode_code");

    public static final com.sap.cloud.server.odata.Property description = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel.getProperty("Description");

    public static final com.sap.cloud.server.odata.Property endDate = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel.getProperty("EndDate");

    public static final com.sap.cloud.server.odata.Property goGreen = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel.getProperty("GoGreen");

    public static final com.sap.cloud.server.odata.Property greenFee = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel.getProperty("GreenFee");

    public static final com.sap.cloud.server.odata.Property lastChangedAt = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel.getProperty("LastChangedAt");

    public static final com.sap.cloud.server.odata.Property lastChangedBy = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel.getProperty("LastChangedBy");

    public static final com.sap.cloud.server.odata.Property totalPrice = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel.getProperty("TotalPrice");

    public static final com.sap.cloud.server.odata.Property travelID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel.getProperty("TravelID");

    public static final com.sap.cloud.server.odata.Property travelStatusCode = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel.getProperty("TravelStatus_code");

    public static final com.sap.cloud.server.odata.Property treesPlanted = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel.getProperty("TreesPlanted");

    public static final com.sap.cloud.server.odata.Property createdAt = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel.getProperty("createdAt");

    public static final com.sap.cloud.server.odata.Property createdBy = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel.getProperty("createdBy");

    public static final com.sap.cloud.server.odata.Property toAgencyAgencyID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel.getProperty("to_Agency_AgencyID");

    public static final com.sap.cloud.server.odata.Property toCustomerCustomerID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel.getProperty("to_Customer_CustomerID");

    public static final com.sap.cloud.server.odata.Property currencyCode = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel.getProperty("CurrencyCode");

    public static final com.sap.cloud.server.odata.Property travelStatus = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel.getProperty("TravelStatus");

    public static final com.sap.cloud.server.odata.Property toAgency = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel.getProperty("to_Agency");

    public static final com.sap.cloud.server.odata.Property toBooking = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel.getProperty("to_Booking");

    public static final com.sap.cloud.server.odata.Property toCustomer = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel.getProperty("to_Customer");

    public Travel()
    {
        this(true, null);
    }

    public Travel(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public Travel(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel, withIndexMap);
    }

    public com.sap.cap.sflight.delta.proxy.Travel copy()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Travel.cast(this.copyEntity());
    }

    public com.sap.cloud.server.odata.LocalDate getBeginDate()
    {
        return com.sap.cloud.server.odata.LocalDate.castOptional(this.getDataValue(com.sap.cap.sflight.delta.proxy.Travel.beginDate));
    }

    public java.math.BigDecimal getBookingFee()
    {
        return com.sap.cloud.server.odata.DecimalValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Travel.bookingFee));
    }

    public com.sap.cloud.server.odata.GlobalDateTime getCreatedAt()
    {
        return com.sap.cloud.server.odata.GlobalDateTime.castOptional(this.getDataValue(com.sap.cap.sflight.delta.proxy.Travel.createdAt));
    }

    public String getCreatedBy()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Travel.createdBy));
    }

    public com.sap.cap.sflight.delta.proxy.Currencies getCurrencyCode()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_Currencies.cast(this.getDataValue(com.sap.cap.sflight.delta.proxy.Travel.currencyCode));
    }

    public String getCurrencyCodeCode()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Travel.currencyCodeCode));
    }

    public String getDescription()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Travel.description));
    }

    public com.sap.cloud.server.odata.LocalDate getEndDate()
    {
        return com.sap.cloud.server.odata.LocalDate.castOptional(this.getDataValue(com.sap.cap.sflight.delta.proxy.Travel.endDate));
    }

    public Boolean getGoGreen()
    {
        return com.sap.cloud.server.odata.BooleanValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Travel.goGreen));
    }

    public java.math.BigDecimal getGreenFee()
    {
        return com.sap.cloud.server.odata.DecimalValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Travel.greenFee));
    }

    public com.sap.cloud.server.odata.GlobalDateTime getLastChangedAt()
    {
        return com.sap.cloud.server.odata.GlobalDateTime.castOptional(this.getDataValue(com.sap.cap.sflight.delta.proxy.Travel.lastChangedAt));
    }

    public String getLastChangedBy()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Travel.lastChangedBy));
    }

    public com.sap.cap.sflight.delta.proxy.Travel getOld()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Travel.cast(this.getOldEntity());
    }

    public com.sap.cap.sflight.delta.proxy.TravelAgency getToAgency()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_TravelAgency.cast(this.getDataValue(com.sap.cap.sflight.delta.proxy.Travel.toAgency));
    }

    public String getToAgencyAgencyID()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Travel.toAgencyAgencyID));
    }

    public com.sap.cap.sflight.delta.proxy.BookingList getToBooking()
    {
        return com.sap.cap.sflight.delta.proxy.BookingList.share(com.sap.cloud.server.odata.EntityValueList.castRequired(this.getDataValue(com.sap.cap.sflight.delta.proxy.Travel.toBooking)));
    }

    public com.sap.cap.sflight.delta.proxy.Passenger getToCustomer()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_Passenger.cast(this.getDataValue(com.sap.cap.sflight.delta.proxy.Travel.toCustomer));
    }

    public String getToCustomerCustomerID()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Travel.toCustomerCustomerID));
    }

    public java.math.BigDecimal getTotalPrice()
    {
        return com.sap.cloud.server.odata.DecimalValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Travel.totalPrice));
    }

    public Integer getTravelID()
    {
        return com.sap.cloud.server.odata.IntValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Travel.travelID));
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatus getTravelStatus()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_TravelStatus.cast(this.getDataValue(com.sap.cap.sflight.delta.proxy.Travel.travelStatus));
    }

    public String getTravelStatusCode()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Travel.travelStatusCode));
    }

    public com.sap.cloud.server.odata.GuidValue getTravelUUID()
    {
        return com.sap.cloud.server.odata.GuidValue.castRequired(this.getDataValue(com.sap.cap.sflight.delta.proxy.Travel.travelUUID));
    }

    public Integer getTreesPlanted()
    {
        return com.sap.cloud.server.odata.IntValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Travel.treesPlanted));
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final com.sap.cloud.server.odata.GuidValue travelUUID)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("TravelUUID", travelUUID);
    }

    public static com.sap.cap.sflight.delta.proxy.TravelList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.cap.sflight.delta.proxy.TravelList.share(from);
    }

    public void setBeginDate(final com.sap.cloud.server.odata.LocalDate value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Travel.beginDate, value);
    }

    public void setBookingFee(final java.math.BigDecimal value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Travel.bookingFee, com.sap.cloud.server.odata.DecimalValue.ofNullable(value));
    }

    public void setCreatedAt(final com.sap.cloud.server.odata.GlobalDateTime value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Travel.createdAt, value);
    }

    public void setCreatedBy(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Travel.createdBy, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setCurrencyCode(final com.sap.cap.sflight.delta.proxy.Currencies value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Travel.currencyCode, value);
    }

    public void setCurrencyCodeCode(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Travel.currencyCodeCode, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setDescription(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Travel.description, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setEndDate(final com.sap.cloud.server.odata.LocalDate value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Travel.endDate, value);
    }

    public void setGoGreen(final Boolean value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Travel.goGreen, com.sap.cloud.server.odata.BooleanValue.ofNullable(value));
    }

    public void setGreenFee(final java.math.BigDecimal value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Travel.greenFee, com.sap.cloud.server.odata.DecimalValue.ofNullable(value));
    }

    public void setLastChangedAt(final com.sap.cloud.server.odata.GlobalDateTime value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Travel.lastChangedAt, value);
    }

    public void setLastChangedBy(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Travel.lastChangedBy, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setToAgency(final com.sap.cap.sflight.delta.proxy.TravelAgency value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Travel.toAgency, value);
    }

    public void setToAgencyAgencyID(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Travel.toAgencyAgencyID, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setToBooking(final com.sap.cap.sflight.delta.proxy.BookingList value)
    {
        com.sap.cap.sflight.delta.proxy.Travel.toBooking.setEntityList(this, com.sap.cloud.server.odata.EntityValueList.share(value));
    }

    public void setToCustomer(final com.sap.cap.sflight.delta.proxy.Passenger value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Travel.toCustomer, value);
    }

    public void setToCustomerCustomerID(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Travel.toCustomerCustomerID, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setTotalPrice(final java.math.BigDecimal value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Travel.totalPrice, com.sap.cloud.server.odata.DecimalValue.ofNullable(value));
    }

    public void setTravelID(final Integer value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Travel.travelID, com.sap.cloud.server.odata.IntValue.ofNullable(value));
    }

    public void setTravelStatus(final com.sap.cap.sflight.delta.proxy.TravelStatus value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Travel.travelStatus, value);
    }

    public void setTravelStatusCode(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Travel.travelStatusCode, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setTravelUUID(final com.sap.cloud.server.odata.GuidValue value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Travel.travelUUID, value);
    }

    public void setTreesPlanted(final Integer value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Travel.treesPlanted, com.sap.cloud.server.odata.IntValue.ofNullable(value));
    }
}
