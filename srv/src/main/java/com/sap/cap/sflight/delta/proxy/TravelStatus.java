package com.sap.cap.sflight.delta.proxy;

public class TravelStatus
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property code = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelStatus.getProperty("code");

    public static final com.sap.cloud.server.odata.Property descr = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelStatus.getProperty("descr");

    public static final com.sap.cloud.server.odata.Property name = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelStatus.getProperty("name");

    public static final com.sap.cloud.server.odata.Property texts = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelStatus.getProperty("texts");

    public TravelStatus()
    {
        this(true, null);
    }

    public TravelStatus(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public TravelStatus(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelStatus, withIndexMap);
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatus copy()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_TravelStatus.cast(this.copyEntity());
    }

    public String getCode()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.TravelStatus.code));
    }

    public String getDescr()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.TravelStatus.descr));
    }

    public String getName()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.TravelStatus.name));
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatus getOld()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_TravelStatus.cast(this.getOldEntity());
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatusTextsList getTexts()
    {
        return com.sap.cap.sflight.delta.proxy.TravelStatusTextsList.share(com.sap.cloud.server.odata.EntityValueList.castRequired(this.getDataValue(com.sap.cap.sflight.delta.proxy.TravelStatus.texts)));
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final String code)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("code", com.sap.cloud.server.odata.StringValue.of(code));
    }

    public static com.sap.cap.sflight.delta.proxy.TravelStatusList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.cap.sflight.delta.proxy.TravelStatusList.share(from);
    }

    public void setCode(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.TravelStatus.code, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setDescr(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.TravelStatus.descr, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setName(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.TravelStatus.name, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setTexts(final com.sap.cap.sflight.delta.proxy.TravelStatusTextsList value)
    {
        com.sap.cap.sflight.delta.proxy.TravelStatus.texts.setEntityList(this, com.sap.cloud.server.odata.EntityValueList.share(value));
    }
}
