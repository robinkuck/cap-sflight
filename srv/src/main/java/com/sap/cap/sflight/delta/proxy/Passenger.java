package com.sap.cap.sflight.delta.proxy;

public class Passenger
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property customerID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.passenger.getProperty("CustomerID");

    public static final com.sap.cloud.server.odata.Property city = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.passenger.getProperty("City");

    public static final com.sap.cloud.server.odata.Property countryCodeCode = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.passenger.getProperty("CountryCode_code");

    public static final com.sap.cloud.server.odata.Property eMailAddress = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.passenger.getProperty("EMailAddress");

    public static final com.sap.cloud.server.odata.Property firstName = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.passenger.getProperty("FirstName");

    public static final com.sap.cloud.server.odata.Property lastChangedAt = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.passenger.getProperty("LastChangedAt");

    public static final com.sap.cloud.server.odata.Property lastChangedBy = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.passenger.getProperty("LastChangedBy");

    public static final com.sap.cloud.server.odata.Property lastName = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.passenger.getProperty("LastName");

    public static final com.sap.cloud.server.odata.Property phoneNumber = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.passenger.getProperty("PhoneNumber");

    public static final com.sap.cloud.server.odata.Property postalCode = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.passenger.getProperty("PostalCode");

    public static final com.sap.cloud.server.odata.Property street = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.passenger.getProperty("Street");

    public static final com.sap.cloud.server.odata.Property title = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.passenger.getProperty("Title");

    public static final com.sap.cloud.server.odata.Property createdAt = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.passenger.getProperty("createdAt");

    public static final com.sap.cloud.server.odata.Property createdBy = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.passenger.getProperty("createdBy");

    public static final com.sap.cloud.server.odata.Property countryCode = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.passenger.getProperty("CountryCode");

    public Passenger()
    {
        this(true, null);
    }

    public Passenger(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public Passenger(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.passenger, withIndexMap);
    }

    public com.sap.cap.sflight.delta.proxy.Passenger copy()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Passenger.cast(this.copyEntity());
    }

    public String getCity()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Passenger.city));
    }

    public com.sap.cap.sflight.delta.proxy.Countries getCountryCode()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_Countries.cast(this.getDataValue(com.sap.cap.sflight.delta.proxy.Passenger.countryCode));
    }

    public String getCountryCodeCode()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Passenger.countryCodeCode));
    }

    public com.sap.cloud.server.odata.GlobalDateTime getCreatedAt()
    {
        return com.sap.cloud.server.odata.GlobalDateTime.castOptional(this.getDataValue(com.sap.cap.sflight.delta.proxy.Passenger.createdAt));
    }

    public String getCreatedBy()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Passenger.createdBy));
    }

    public String getCustomerID()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.Passenger.customerID));
    }

    public String getEMailAddress()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Passenger.eMailAddress));
    }

    public String getFirstName()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Passenger.firstName));
    }

    public com.sap.cloud.server.odata.GlobalDateTime getLastChangedAt()
    {
        return com.sap.cloud.server.odata.GlobalDateTime.castOptional(this.getDataValue(com.sap.cap.sflight.delta.proxy.Passenger.lastChangedAt));
    }

    public String getLastChangedBy()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Passenger.lastChangedBy));
    }

    public String getLastName()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Passenger.lastName));
    }

    public com.sap.cap.sflight.delta.proxy.Passenger getOld()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Passenger.cast(this.getOldEntity());
    }

    public String getPhoneNumber()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Passenger.phoneNumber));
    }

    public String getPostalCode()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Passenger.postalCode));
    }

    public String getStreet()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Passenger.street));
    }

    public String getTitle()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Passenger.title));
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final String customerID)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("CustomerID", com.sap.cloud.server.odata.StringValue.of(customerID));
    }

    public static com.sap.cap.sflight.delta.proxy.PassengerList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.cap.sflight.delta.proxy.PassengerList.share(from);
    }

    public void setCity(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Passenger.city, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setCountryCode(final com.sap.cap.sflight.delta.proxy.Countries value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Passenger.countryCode, value);
    }

    public void setCountryCodeCode(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Passenger.countryCodeCode, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setCreatedAt(final com.sap.cloud.server.odata.GlobalDateTime value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Passenger.createdAt, value);
    }

    public void setCreatedBy(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Passenger.createdBy, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setCustomerID(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Passenger.customerID, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setEMailAddress(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Passenger.eMailAddress, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setFirstName(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Passenger.firstName, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setLastChangedAt(final com.sap.cloud.server.odata.GlobalDateTime value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Passenger.lastChangedAt, value);
    }

    public void setLastChangedBy(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Passenger.lastChangedBy, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setLastName(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Passenger.lastName, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setPhoneNumber(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Passenger.phoneNumber, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setPostalCode(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Passenger.postalCode, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setStreet(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Passenger.street, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setTitle(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Passenger.title, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }
}
