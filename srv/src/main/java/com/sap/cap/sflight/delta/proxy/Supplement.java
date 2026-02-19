package com.sap.cap.sflight.delta.proxy;

public class Supplement
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property supplementID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplement.getProperty("SupplementID");

    public static final com.sap.cloud.server.odata.Property currencyCodeCode = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplement.getProperty("CurrencyCode_code");

    public static final com.sap.cloud.server.odata.Property description = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplement.getProperty("Description");

    public static final com.sap.cloud.server.odata.Property lastChangedAt = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplement.getProperty("LastChangedAt");

    public static final com.sap.cloud.server.odata.Property lastChangedBy = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplement.getProperty("LastChangedBy");

    public static final com.sap.cloud.server.odata.Property price = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplement.getProperty("Price");

    public static final com.sap.cloud.server.odata.Property typeCode_ = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplement.getProperty("Type_code");

    public static final com.sap.cloud.server.odata.Property createdAt = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplement.getProperty("createdAt");

    public static final com.sap.cloud.server.odata.Property createdBy = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplement.getProperty("createdBy");

    public static final com.sap.cloud.server.odata.Property currencyCode = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplement.getProperty("CurrencyCode");

    public static final com.sap.cloud.server.odata.Property type_ = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplement.getProperty("Type");

    public static final com.sap.cloud.server.odata.Property texts = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplement.getProperty("texts");

    public Supplement()
    {
        this(true, null);
    }

    public Supplement(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public Supplement(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplement, withIndexMap);
    }

    public com.sap.cap.sflight.delta.proxy.Supplement copy()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Supplement.cast(this.copyEntity());
    }

    public com.sap.cloud.server.odata.GlobalDateTime getCreatedAt()
    {
        return com.sap.cloud.server.odata.GlobalDateTime.castOptional(this.getDataValue(com.sap.cap.sflight.delta.proxy.Supplement.createdAt));
    }

    public String getCreatedBy()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Supplement.createdBy));
    }

    public com.sap.cap.sflight.delta.proxy.Currencies getCurrencyCode()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_Currencies.cast(this.getDataValue(com.sap.cap.sflight.delta.proxy.Supplement.currencyCode));
    }

    public String getCurrencyCodeCode()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Supplement.currencyCodeCode));
    }

    public String getDescription()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Supplement.description));
    }

    public com.sap.cloud.server.odata.GlobalDateTime getLastChangedAt()
    {
        return com.sap.cloud.server.odata.GlobalDateTime.castOptional(this.getDataValue(com.sap.cap.sflight.delta.proxy.Supplement.lastChangedAt));
    }

    public String getLastChangedBy()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Supplement.lastChangedBy));
    }

    public com.sap.cap.sflight.delta.proxy.Supplement getOld()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Supplement.cast(this.getOldEntity());
    }

    public java.math.BigDecimal getPrice()
    {
        return com.sap.cloud.server.odata.DecimalValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Supplement.price));
    }

    public String getSupplementID()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.Supplement.supplementID));
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTextsList getTexts()
    {
        return com.sap.cap.sflight.delta.proxy.SupplementTextsList.share(com.sap.cloud.server.odata.EntityValueList.castRequired(this.getDataValue(com.sap.cap.sflight.delta.proxy.Supplement.texts)));
    }

    public String getTypeCode_()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Supplement.typeCode_));
    }

    public com.sap.cap.sflight.delta.proxy.SupplementType getType_()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_SupplementType.cast(this.getDataValue(com.sap.cap.sflight.delta.proxy.Supplement.type_));
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final String supplementID)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("SupplementID", com.sap.cloud.server.odata.StringValue.of(supplementID));
    }

    public static com.sap.cap.sflight.delta.proxy.SupplementList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.cap.sflight.delta.proxy.SupplementList.share(from);
    }

    public void setCreatedAt(final com.sap.cloud.server.odata.GlobalDateTime value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Supplement.createdAt, value);
    }

    public void setCreatedBy(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Supplement.createdBy, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setCurrencyCode(final com.sap.cap.sflight.delta.proxy.Currencies value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Supplement.currencyCode, value);
    }

    public void setCurrencyCodeCode(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Supplement.currencyCodeCode, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setDescription(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Supplement.description, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setLastChangedAt(final com.sap.cloud.server.odata.GlobalDateTime value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Supplement.lastChangedAt, value);
    }

    public void setLastChangedBy(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Supplement.lastChangedBy, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setPrice(final java.math.BigDecimal value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Supplement.price, com.sap.cloud.server.odata.DecimalValue.ofNullable(value));
    }

    public void setSupplementID(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Supplement.supplementID, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setTexts(final com.sap.cap.sflight.delta.proxy.SupplementTextsList value)
    {
        com.sap.cap.sflight.delta.proxy.Supplement.texts.setEntityList(this, com.sap.cloud.server.odata.EntityValueList.share(value));
    }

    public void setTypeCode_(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Supplement.typeCode_, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setType_(final com.sap.cap.sflight.delta.proxy.SupplementType value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Supplement.type_, value);
    }
}
