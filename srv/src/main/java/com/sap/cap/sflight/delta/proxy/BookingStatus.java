package com.sap.cap.sflight.delta.proxy;

public class BookingStatus
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property code = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingStatus.getProperty("code");

    public static final com.sap.cloud.server.odata.Property descr = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingStatus.getProperty("descr");

    public static final com.sap.cloud.server.odata.Property name = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingStatus.getProperty("name");

    public static final com.sap.cloud.server.odata.Property texts = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingStatus.getProperty("texts");

    public BookingStatus()
    {
        this(true, null);
    }

    public BookingStatus(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public BookingStatus(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingStatus, withIndexMap);
    }

    public com.sap.cap.sflight.delta.proxy.BookingStatus copy()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_BookingStatus.cast(this.copyEntity());
    }

    public String getCode()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.BookingStatus.code));
    }

    public String getDescr()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.BookingStatus.descr));
    }

    public String getName()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.BookingStatus.name));
    }

    public com.sap.cap.sflight.delta.proxy.BookingStatus getOld()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_BookingStatus.cast(this.getOldEntity());
    }

    public com.sap.cap.sflight.delta.proxy.BookingStatusTextsList getTexts()
    {
        return com.sap.cap.sflight.delta.proxy.BookingStatusTextsList.share(com.sap.cloud.server.odata.EntityValueList.castRequired(this.getDataValue(com.sap.cap.sflight.delta.proxy.BookingStatus.texts)));
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final String code)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("code", com.sap.cloud.server.odata.StringValue.of(code));
    }

    public static com.sap.cap.sflight.delta.proxy.BookingStatusList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.cap.sflight.delta.proxy.BookingStatusList.share(from);
    }

    public void setCode(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.BookingStatus.code, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setDescr(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.BookingStatus.descr, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setName(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.BookingStatus.name, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setTexts(final com.sap.cap.sflight.delta.proxy.BookingStatusTextsList value)
    {
        com.sap.cap.sflight.delta.proxy.BookingStatus.texts.setEntityList(this, com.sap.cloud.server.odata.EntityValueList.share(value));
    }
}
