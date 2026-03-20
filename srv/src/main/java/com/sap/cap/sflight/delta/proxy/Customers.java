package com.sap.cap.sflight.delta.proxy;

public class Customers
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property customerID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.customers.getProperty("CustomerID");

    public static final com.sap.cloud.server.odata.Property address = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.customers.getProperty("Address");

    public static final com.sap.cloud.server.odata.Property city = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.customers.getProperty("City");

    public static final com.sap.cloud.server.odata.Property companyName = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.customers.getProperty("CompanyName");

    public static final com.sap.cloud.server.odata.Property contactName = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.customers.getProperty("ContactName");

    public static final com.sap.cloud.server.odata.Property contactTitle = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.customers.getProperty("ContactTitle");

    public static final com.sap.cloud.server.odata.Property country = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.customers.getProperty("Country");

    public static final com.sap.cloud.server.odata.Property fax = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.customers.getProperty("Fax");

    public static final com.sap.cloud.server.odata.Property phone = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.customers.getProperty("Phone");

    public static final com.sap.cloud.server.odata.Property postalCode = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.customers.getProperty("PostalCode");

    public static final com.sap.cloud.server.odata.Property region = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.customers.getProperty("Region");

    public Customers()
    {
        this(true, null);
    }

    public Customers(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public Customers(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.customers, withIndexMap);
    }

    public com.sap.cap.sflight.delta.proxy.Customers copy()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Customers.cast(this.copyEntity());
    }

    public String getAddress()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Customers.address));
    }

    public String getCity()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Customers.city));
    }

    public String getCompanyName()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Customers.companyName));
    }

    public String getContactName()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Customers.contactName));
    }

    public String getContactTitle()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Customers.contactTitle));
    }

    public String getCountry()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Customers.country));
    }

    public String getCustomerID()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.Customers.customerID));
    }

    public String getFax()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Customers.fax));
    }

    public com.sap.cap.sflight.delta.proxy.Customers getOld()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Customers.cast(this.getOldEntity());
    }

    public String getPhone()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Customers.phone));
    }

    public String getPostalCode()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Customers.postalCode));
    }

    public String getRegion()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Customers.region));
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final String customerID)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("CustomerID", com.sap.cloud.server.odata.StringValue.of(customerID));
    }

    public static com.sap.cap.sflight.delta.proxy.CustomersList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.cap.sflight.delta.proxy.CustomersList.share(from);
    }

    public void setAddress(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Customers.address, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setCity(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Customers.city, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setCompanyName(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Customers.companyName, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setContactName(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Customers.contactName, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setContactTitle(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Customers.contactTitle, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setCountry(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Customers.country, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setCustomerID(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Customers.customerID, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setFax(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Customers.fax, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setPhone(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Customers.phone, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setPostalCode(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Customers.postalCode, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setRegion(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Customers.region, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }
}
