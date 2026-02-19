package com.sap.cap.sflight.delta.proxy;

public class ClientRegistration
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property clientID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.clientRegistration.getProperty("ClientID");

    public static final com.sap.cloud.server.odata.Property authorizedUser = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.clientRegistration.getProperty("AuthorizedUser");

    public static final com.sap.cloud.server.odata.Property clientGUID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.clientRegistration.getProperty("ClientGUID");

    public ClientRegistration()
    {
        this(true, null);
    }

    public ClientRegistration(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public ClientRegistration(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.clientRegistration, withIndexMap);
    }

    public com.sap.cap.sflight.delta.proxy.ClientRegistration copy()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_ClientRegistration.cast(this.copyEntity());
    }

    public String getAuthorizedUser()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.ClientRegistration.authorizedUser));
    }

    public com.sap.cloud.server.odata.GuidValue getClientGUID()
    {
        return com.sap.cloud.server.odata.GuidValue.castRequired(this.getDataValue(com.sap.cap.sflight.delta.proxy.ClientRegistration.clientGUID));
    }

    public long getClientID()
    {
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.ClientRegistration.clientID));
    }

    public com.sap.cap.sflight.delta.proxy.ClientRegistration getOld()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_ClientRegistration.cast(this.getOldEntity());
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long clientID)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("ClientID", com.sap.cloud.server.odata.LongValue.of(clientID));
    }

    public static com.sap.cap.sflight.delta.proxy.ClientRegistrationList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.cap.sflight.delta.proxy.ClientRegistrationList.share(from);
    }

    public void setAuthorizedUser(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.ClientRegistration.authorizedUser, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setClientGUID(final com.sap.cloud.server.odata.GuidValue value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.ClientRegistration.clientGUID, value);
    }

    public void setClientID(final long value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.ClientRegistration.clientID, com.sap.cloud.server.odata.LongValue.of(value));
    }
}
