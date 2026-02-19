package com.sap.cap.sflight.delta.proxy;

public class TravelAgency
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property agencyID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelAgency.getProperty("AgencyID");

    public static final com.sap.cloud.server.odata.Property city = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelAgency.getProperty("City");

    public static final com.sap.cloud.server.odata.Property countryCodeCode = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelAgency.getProperty("CountryCode_code");

    public static final com.sap.cloud.server.odata.Property eMailAddress = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelAgency.getProperty("EMailAddress");

    public static final com.sap.cloud.server.odata.Property name = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelAgency.getProperty("Name");

    public static final com.sap.cloud.server.odata.Property phoneNumber = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelAgency.getProperty("PhoneNumber");

    public static final com.sap.cloud.server.odata.Property postalCode = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelAgency.getProperty("PostalCode");

    public static final com.sap.cloud.server.odata.Property street = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelAgency.getProperty("Street");

    public static final com.sap.cloud.server.odata.Property webAddress = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelAgency.getProperty("WebAddress");

    public static final com.sap.cloud.server.odata.Property countryCode = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelAgency.getProperty("CountryCode");

    public TravelAgency()
    {
        this(true, null);
    }

    public TravelAgency(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public TravelAgency(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelAgency, withIndexMap);
    }

    public com.sap.cap.sflight.delta.proxy.TravelAgency copy()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_TravelAgency.cast(this.copyEntity());
    }

    public String getAgencyID()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.TravelAgency.agencyID));
    }

    public String getCity()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.TravelAgency.city));
    }

    public com.sap.cap.sflight.delta.proxy.Countries getCountryCode()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_Countries.cast(this.getDataValue(com.sap.cap.sflight.delta.proxy.TravelAgency.countryCode));
    }

    public String getCountryCodeCode()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.TravelAgency.countryCodeCode));
    }

    public String getEMailAddress()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.TravelAgency.eMailAddress));
    }

    public String getName()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.TravelAgency.name));
    }

    public com.sap.cap.sflight.delta.proxy.TravelAgency getOld()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_TravelAgency.cast(this.getOldEntity());
    }

    public String getPhoneNumber()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.TravelAgency.phoneNumber));
    }

    public String getPostalCode()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.TravelAgency.postalCode));
    }

    public String getStreet()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.TravelAgency.street));
    }

    public String getWebAddress()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.TravelAgency.webAddress));
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final String agencyID)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("AgencyID", com.sap.cloud.server.odata.StringValue.of(agencyID));
    }

    public static com.sap.cap.sflight.delta.proxy.TravelAgencyList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.cap.sflight.delta.proxy.TravelAgencyList.share(from);
    }

    public void setAgencyID(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.TravelAgency.agencyID, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setCity(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.TravelAgency.city, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setCountryCode(final com.sap.cap.sflight.delta.proxy.Countries value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.TravelAgency.countryCode, value);
    }

    public void setCountryCodeCode(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.TravelAgency.countryCodeCode, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setEMailAddress(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.TravelAgency.eMailAddress, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setName(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.TravelAgency.name, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setPhoneNumber(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.TravelAgency.phoneNumber, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setPostalCode(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.TravelAgency.postalCode, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setStreet(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.TravelAgency.street, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setWebAddress(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.TravelAgency.webAddress, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }
}
