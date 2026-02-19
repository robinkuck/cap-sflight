package com.sap.cap.sflight.delta.proxy;

public class SupplementType
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property code = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplementType.getProperty("code");

    public static final com.sap.cloud.server.odata.Property descr = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplementType.getProperty("descr");

    public static final com.sap.cloud.server.odata.Property name = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplementType.getProperty("name");

    public static final com.sap.cloud.server.odata.Property texts = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplementType.getProperty("texts");

    public SupplementType()
    {
        this(true, null);
    }

    public SupplementType(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public SupplementType(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplementType, withIndexMap);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementType copy()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_SupplementType.cast(this.copyEntity());
    }

    public String getCode()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.SupplementType.code));
    }

    public String getDescr()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.SupplementType.descr));
    }

    public String getName()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.SupplementType.name));
    }

    public com.sap.cap.sflight.delta.proxy.SupplementType getOld()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_SupplementType.cast(this.getOldEntity());
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList getTexts()
    {
        return com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList.share(com.sap.cloud.server.odata.EntityValueList.castRequired(this.getDataValue(com.sap.cap.sflight.delta.proxy.SupplementType.texts)));
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final String code)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("code", com.sap.cloud.server.odata.StringValue.of(code));
    }

    public static com.sap.cap.sflight.delta.proxy.SupplementTypeList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.cap.sflight.delta.proxy.SupplementTypeList.share(from);
    }

    public void setCode(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.SupplementType.code, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setDescr(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.SupplementType.descr, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setName(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.SupplementType.name, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setTexts(final com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList value)
    {
        com.sap.cap.sflight.delta.proxy.SupplementType.texts.setEntityList(this, com.sap.cloud.server.odata.EntityValueList.share(value));
    }
}
