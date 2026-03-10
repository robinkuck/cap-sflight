package com.sap.cap.sflight.delta.proxy;

public class Employees
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property employeeID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.employees.getProperty("EmployeeID");

    public static final com.sap.cloud.server.odata.Property address = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.employees.getProperty("Address");

    public static final com.sap.cloud.server.odata.Property birthDate = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.employees.getProperty("BirthDate");

    public static final com.sap.cloud.server.odata.Property city = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.employees.getProperty("City");

    public static final com.sap.cloud.server.odata.Property country = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.employees.getProperty("Country");

    public static final com.sap.cloud.server.odata.Property extension = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.employees.getProperty("Extension");

    public static final com.sap.cloud.server.odata.Property firstName = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.employees.getProperty("FirstName");

    public static final com.sap.cloud.server.odata.Property hireDate = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.employees.getProperty("HireDate");

    public static final com.sap.cloud.server.odata.Property homePhone = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.employees.getProperty("HomePhone");

    public static final com.sap.cloud.server.odata.Property lastName = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.employees.getProperty("LastName");

    public static final com.sap.cloud.server.odata.Property notes = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.employees.getProperty("Notes");

    public static final com.sap.cloud.server.odata.Property photo = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.employees.getProperty("Photo");

    public static final com.sap.cloud.server.odata.Property photoPath = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.employees.getProperty("PhotoPath");

    public static final com.sap.cloud.server.odata.Property postalCode = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.employees.getProperty("PostalCode");

    public static final com.sap.cloud.server.odata.Property region = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.employees.getProperty("Region");

    public static final com.sap.cloud.server.odata.Property reportsTo = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.employees.getProperty("ReportsTo");

    public static final com.sap.cloud.server.odata.Property title = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.employees.getProperty("Title");

    public static final com.sap.cloud.server.odata.Property titleOfCourtesy = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.employees.getProperty("TitleOfCourtesy");

    public Employees()
    {
        this(true, null);
    }

    public Employees(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public Employees(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.employees, withIndexMap);
    }

    public com.sap.cap.sflight.delta.proxy.Employees copy()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Employees.cast(this.copyEntity());
    }

    public String getAddress()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Employees.address));
    }

    public com.sap.cloud.server.odata.GlobalDateTime getBirthDate()
    {
        return com.sap.cloud.server.odata.GlobalDateTime.castOptional(this.getDataValue(com.sap.cap.sflight.delta.proxy.Employees.birthDate));
    }

    public String getCity()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Employees.city));
    }

    public String getCountry()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Employees.country));
    }

    public int getEmployeeID()
    {
        return com.sap.cloud.server.odata.IntValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.Employees.employeeID));
    }

    public String getExtension()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Employees.extension));
    }

    public String getFirstName()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.Employees.firstName));
    }

    public com.sap.cloud.server.odata.GlobalDateTime getHireDate()
    {
        return com.sap.cloud.server.odata.GlobalDateTime.castOptional(this.getDataValue(com.sap.cap.sflight.delta.proxy.Employees.hireDate));
    }

    public String getHomePhone()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Employees.homePhone));
    }

    public String getLastName()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.Employees.lastName));
    }

    public String getNotes()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Employees.notes));
    }

    public com.sap.cap.sflight.delta.proxy.Employees getOld()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Employees.cast(this.getOldEntity());
    }

    public byte[] getPhoto()
    {
        return com.sap.cloud.server.odata.BinaryValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Employees.photo));
    }

    public String getPhotoPath()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Employees.photoPath));
    }

    public String getPostalCode()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Employees.postalCode));
    }

    public String getRegion()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Employees.region));
    }

    public Integer getReportsTo()
    {
        return com.sap.cloud.server.odata.IntValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Employees.reportsTo));
    }

    public String getTitle()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Employees.title));
    }

    public String getTitleOfCourtesy()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Employees.titleOfCourtesy));
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final int employeeID)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("EmployeeID", com.sap.cloud.server.odata.IntValue.of(employeeID));
    }

    public static com.sap.cap.sflight.delta.proxy.EmployeesList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.cap.sflight.delta.proxy.EmployeesList.share(from);
    }

    public void setAddress(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Employees.address, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setBirthDate(final com.sap.cloud.server.odata.GlobalDateTime value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Employees.birthDate, value);
    }

    public void setCity(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Employees.city, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setCountry(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Employees.country, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setEmployeeID(final int value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Employees.employeeID, com.sap.cloud.server.odata.IntValue.of(value));
    }

    public void setExtension(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Employees.extension, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setFirstName(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Employees.firstName, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setHireDate(final com.sap.cloud.server.odata.GlobalDateTime value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Employees.hireDate, value);
    }

    public void setHomePhone(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Employees.homePhone, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setLastName(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Employees.lastName, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setNotes(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Employees.notes, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setPhoto(final byte[] value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Employees.photo, com.sap.cloud.server.odata.BinaryValue.ofNullable(value));
    }

    public void setPhotoPath(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Employees.photoPath, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setPostalCode(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Employees.postalCode, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setRegion(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Employees.region, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setReportsTo(final Integer value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Employees.reportsTo, com.sap.cloud.server.odata.IntValue.ofNullable(value));
    }

    public void setTitle(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Employees.title, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setTitleOfCourtesy(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Employees.titleOfCourtesy, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }
}
