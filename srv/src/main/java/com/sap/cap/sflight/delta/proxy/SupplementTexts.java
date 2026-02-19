package com.sap.cap.sflight.delta.proxy;

public class SupplementTexts
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property locale = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplementTexts.getProperty("locale");

    public static final com.sap.cloud.server.odata.Property supplementID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplementTexts.getProperty("SupplementID");

    public static final com.sap.cloud.server.odata.Property description = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplementTexts.getProperty("Description");

    public SupplementTexts()
    {
        this(true, null);
    }

    public SupplementTexts(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public SupplementTexts(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplementTexts, withIndexMap);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTexts copy()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_SupplementTexts.cast(this.copyEntity());
    }

    public String getDescription()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.SupplementTexts.description));
    }

    public String getLocale()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.SupplementTexts.locale));
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTexts getOld()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_SupplementTexts.cast(this.getOldEntity());
    }

    public String getSupplementID()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.SupplementTexts.supplementID));
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final String locale, final String supplementID)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("locale", com.sap.cloud.server.odata.StringValue.of(locale)).with("SupplementID", com.sap.cloud.server.odata.StringValue.of(supplementID));
    }

    public static com.sap.cap.sflight.delta.proxy.SupplementTextsList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.cap.sflight.delta.proxy.SupplementTextsList.share(from);
    }

    public void setDescription(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.SupplementTexts.description, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setLocale(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.SupplementTexts.locale, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setSupplementID(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.SupplementTexts.supplementID, com.sap.cloud.server.odata.StringValue.of(value));
    }
}
