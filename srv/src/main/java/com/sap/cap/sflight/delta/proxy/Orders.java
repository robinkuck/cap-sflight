package com.sap.cap.sflight.delta.proxy;

public class Orders
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property orderID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.orders.getProperty("OrderID");

    public static final com.sap.cloud.server.odata.Property customerID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.orders.getProperty("CustomerID");

    public static final com.sap.cloud.server.odata.Property employeeID = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.orders.getProperty("EmployeeID");

    public static final com.sap.cloud.server.odata.Property freight = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.orders.getProperty("Freight");

    public static final com.sap.cloud.server.odata.Property orderDate = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.orders.getProperty("OrderDate");

    public static final com.sap.cloud.server.odata.Property requiredDate = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.orders.getProperty("RequiredDate");

    public static final com.sap.cloud.server.odata.Property shipAddress = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.orders.getProperty("ShipAddress");

    public static final com.sap.cloud.server.odata.Property shipCity = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.orders.getProperty("ShipCity");

    public static final com.sap.cloud.server.odata.Property shipCountry = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.orders.getProperty("ShipCountry");

    public static final com.sap.cloud.server.odata.Property shipName = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.orders.getProperty("ShipName");

    public static final com.sap.cloud.server.odata.Property shipPostalCode = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.orders.getProperty("ShipPostalCode");

    public static final com.sap.cloud.server.odata.Property shipRegion = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.orders.getProperty("ShipRegion");

    public static final com.sap.cloud.server.odata.Property shipVia = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.orders.getProperty("ShipVia");

    public static final com.sap.cloud.server.odata.Property shippedDate = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.orders.getProperty("ShippedDate");

    public Orders()
    {
        this(true, null);
    }

    public Orders(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public Orders(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.orders, withIndexMap);
    }

    public com.sap.cap.sflight.delta.proxy.Orders copy()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Orders.cast(this.copyEntity());
    }

    public String getCustomerID()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Orders.customerID));
    }

    public Integer getEmployeeID()
    {
        return com.sap.cloud.server.odata.IntValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Orders.employeeID));
    }

    public java.math.BigDecimal getFreight()
    {
        return com.sap.cloud.server.odata.DecimalValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Orders.freight));
    }

    public com.sap.cap.sflight.delta.proxy.Orders getOld()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Orders.cast(this.getOldEntity());
    }

    public com.sap.cloud.server.odata.GlobalDateTime getOrderDate()
    {
        return com.sap.cloud.server.odata.GlobalDateTime.castOptional(this.getDataValue(com.sap.cap.sflight.delta.proxy.Orders.orderDate));
    }

    public int getOrderID()
    {
        return com.sap.cloud.server.odata.IntValue.unwrap(this.getDataValue(com.sap.cap.sflight.delta.proxy.Orders.orderID));
    }

    public com.sap.cloud.server.odata.GlobalDateTime getRequiredDate()
    {
        return com.sap.cloud.server.odata.GlobalDateTime.castOptional(this.getDataValue(com.sap.cap.sflight.delta.proxy.Orders.requiredDate));
    }

    public String getShipAddress()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Orders.shipAddress));
    }

    public String getShipCity()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Orders.shipCity));
    }

    public String getShipCountry()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Orders.shipCountry));
    }

    public String getShipName()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Orders.shipName));
    }

    public String getShipPostalCode()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Orders.shipPostalCode));
    }

    public String getShipRegion()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Orders.shipRegion));
    }

    public Integer getShipVia()
    {
        return com.sap.cloud.server.odata.IntValue.toNullable(this.getDataValue(com.sap.cap.sflight.delta.proxy.Orders.shipVia));
    }

    public com.sap.cloud.server.odata.GlobalDateTime getShippedDate()
    {
        return com.sap.cloud.server.odata.GlobalDateTime.castOptional(this.getDataValue(com.sap.cap.sflight.delta.proxy.Orders.shippedDate));
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final int orderID)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("OrderID", com.sap.cloud.server.odata.IntValue.of(orderID));
    }

    public static com.sap.cap.sflight.delta.proxy.OrdersList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return com.sap.cap.sflight.delta.proxy.OrdersList.share(from);
    }

    public void setCustomerID(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Orders.customerID, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setEmployeeID(final Integer value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Orders.employeeID, com.sap.cloud.server.odata.IntValue.ofNullable(value));
    }

    public void setFreight(final java.math.BigDecimal value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Orders.freight, com.sap.cloud.server.odata.DecimalValue.ofNullable(value));
    }

    public void setOrderDate(final com.sap.cloud.server.odata.GlobalDateTime value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Orders.orderDate, value);
    }

    public void setOrderID(final int value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Orders.orderID, com.sap.cloud.server.odata.IntValue.of(value));
    }

    public void setRequiredDate(final com.sap.cloud.server.odata.GlobalDateTime value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Orders.requiredDate, value);
    }

    public void setShipAddress(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Orders.shipAddress, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setShipCity(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Orders.shipCity, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setShipCountry(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Orders.shipCountry, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setShipName(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Orders.shipName, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setShipPostalCode(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Orders.shipPostalCode, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setShipRegion(final String value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Orders.shipRegion, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setShipVia(final Integer value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Orders.shipVia, com.sap.cloud.server.odata.IntValue.ofNullable(value));
    }

    public void setShippedDate(final com.sap.cloud.server.odata.GlobalDateTime value)
    {
        this.setDataValue(com.sap.cap.sflight.delta.proxy.Orders.shippedDate, value);
    }
}
