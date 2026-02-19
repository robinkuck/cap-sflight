package com.sap.cap.sflight.delta.proxy;

public class AirportList
    extends com.sap.cloud.server.odata.ListBase
    implements java.lang.Iterable<com.sap.cap.sflight.delta.proxy.Airport>
{
    public static final com.sap.cap.sflight.delta.proxy.AirportList empty = new com.sap.cap.sflight.delta.proxy.AirportList(java.lang.Integer.MIN_VALUE);

    public AirportList()
    {
        this(4);
    }

    public AirportList(final int capacity)
    {
        super(capacity);
    }

    public final void add(final com.sap.cap.sflight.delta.proxy.Airport item)
    {
        this.getUntypedList().add(((Object)item));
    }

    public final void addAll(final com.sap.cap.sflight.delta.proxy.AirportList list)
    {
        this.getUntypedList().addAll(list.getUntypedList());
    }

    public final com.sap.cap.sflight.delta.proxy.AirportList addThis(final com.sap.cap.sflight.delta.proxy.Airport item)
    {
        this.add(item);
        return this;
    }

    public final com.sap.cap.sflight.delta.proxy.AirportList copy()
    {
        return this.slice(0);
    }

    public final com.sap.cap.sflight.delta.proxy.AirportList filter(final com.sap.cloud.server.odata.core.Function1<com.sap.cap.sflight.delta.proxy.Airport, Boolean> predicate)
    {
        int n = this.length();
        if (n > 4)
        {
            n = 4;
        }
        final com.sap.cap.sflight.delta.proxy.AirportList result = new com.sap.cap.sflight.delta.proxy.AirportList(n);
        // for (let item of this)
        {
            final com.sap.cap.sflight.delta.proxy.AirportList item_list = this;
            final int item_count = item_list.length();
            int item_index;
            for (item_index = 0; item_index < item_count; item_index++)
            {
                final com.sap.cap.sflight.delta.proxy.Airport item = item_list.get(item_index);
                if (predicate.call(item))
                {
                    result.add(item);
                }
            }
        }
        return result;
    }

    public final com.sap.cap.sflight.delta.proxy.Airport first()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Airport.cast(this.getUntypedList().first());
    }

    public static com.sap.cap.sflight.delta.proxy.AirportList from(final java.util.List<com.sap.cap.sflight.delta.proxy.Airport> list)
    {
        return AirportList.share(new com.sap.cloud.server.odata.core.GenericList<com.sap.cap.sflight.delta.proxy.Airport>(list).toAnyList());
    }

    public final com.sap.cap.sflight.delta.proxy.Airport get(final int index)
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Airport.cast(this.getUntypedList().get(index));
    }

    public final boolean includes(final com.sap.cap.sflight.delta.proxy.Airport item)
    {
        return this.indexOf(item) != -1;
    }

    public final int indexOf(final com.sap.cap.sflight.delta.proxy.Airport item)
    {
        return this.indexOf(item, 0);
    }

    public final int indexOf(final com.sap.cap.sflight.delta.proxy.Airport item, final int start)
    {
        return this.getUntypedList().indexOf(((Object)item), start);
    }

    public final void insertAll(final int index, final com.sap.cap.sflight.delta.proxy.AirportList list)
    {
        this.getUntypedList().insertAll(index, list.getUntypedList());
    }

    public final void insertAt(final int index, final com.sap.cap.sflight.delta.proxy.Airport item)
    {
        this.getUntypedList().insertAt(index, ((Object)item));
    }

    public java.util.Iterator<com.sap.cap.sflight.delta.proxy.Airport> iterator()
    {
        return this.toGeneric().iterator();
    }

    public final com.sap.cap.sflight.delta.proxy.Airport last()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Airport.cast(this.getUntypedList().last());
    }

    public final int lastIndexOf(final com.sap.cap.sflight.delta.proxy.Airport item)
    {
        return this.lastIndexOf(item, 2147483647);
    }

    public final int lastIndexOf(final com.sap.cap.sflight.delta.proxy.Airport item, final int start)
    {
        return this.getUntypedList().lastIndexOf(((Object)item), start);
    }

    public static com.sap.cap.sflight.delta.proxy.AirportList of(final com.sap.cap.sflight.delta.proxy.Airport... items)
    {
        com.sap.cap.sflight.delta.proxy.AirportList rest_items = new com.sap.cap.sflight.delta.proxy.AirportList(items.length);
        for (com.sap.cap.sflight.delta.proxy.Airport items_item : items) rest_items.add(items_item);
        return rest_items;
    }

    public com.sap.cap.sflight.delta.proxy.AirportList reversed()
    {
        final com.sap.cap.sflight.delta.proxy.AirportList result = this.copy();
        result.reverse();
        return result;
    }

    public final void set(final int index, final com.sap.cap.sflight.delta.proxy.Airport item)
    {
        this.getUntypedList().set(index, ((Object)item));
    }

    public static com.sap.cap.sflight.delta.proxy.AirportList share(final com.sap.cloud.server.odata.ListBase list)
    {
        final com.sap.cloud.server.odata.core.UntypedList items = list.getUntypedList();
        final int n = items.length();
        final com.sap.cap.sflight.delta.proxy.AirportList result = new com.sap.cap.sflight.delta.proxy.AirportList(n);
        boolean replace = false;
        {
            int i = 0;
            for (; (i < n); i++)
            {
                final Object item = items.get(i);
                if (item instanceof com.sap.cap.sflight.delta.proxy.Airport)
                {
                    final com.sap.cap.sflight.delta.proxy.Airport var_item = ((com.sap.cap.sflight.delta.proxy.Airport)item);
                    result.add(var_item);
                }
                else
                {
                    replace = true;
                }
            }
        }
        result.shareWith(list, replace);
        return result;
    }

    public final com.sap.cap.sflight.delta.proxy.Airport single()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Airport.cast(this.getUntypedList().single());
    }

    public final com.sap.cap.sflight.delta.proxy.AirportList slice(final int start)
    {
        return this.slice(start, 2147483647);
    }

    public final com.sap.cap.sflight.delta.proxy.AirportList slice(final int start, final int end)
    {
        final com.sap.cloud.server.odata.core.UntypedList list = this.getUntypedList();
        final int var_start = list.startRange(start);
        final int var_end = list.endRange(end);
        final com.sap.cap.sflight.delta.proxy.AirportList result = new com.sap.cap.sflight.delta.proxy.AirportList(var_end - var_start);
        result.getUntypedList().addRange(list, var_start, var_end);
        return result;
    }

    public final void sortBy(final com.sap.cloud.server.odata.core.Function2<com.sap.cap.sflight.delta.proxy.Airport, com.sap.cap.sflight.delta.proxy.Airport, Boolean> increasing)
    {
        this.sortWith(new com.sap.cap.sflight.delta.proxy.AirportList.OrderBy(increasing));
    }

    public final com.sap.cap.sflight.delta.proxy.AirportList sorted()
    {
        final com.sap.cap.sflight.delta.proxy.AirportList result = this.copy();
        result.sort();
        return result;
    }

    public final com.sap.cap.sflight.delta.proxy.AirportList sortedBy(final com.sap.cloud.server.odata.core.Function2<com.sap.cap.sflight.delta.proxy.Airport, com.sap.cap.sflight.delta.proxy.Airport, Boolean> increasing)
    {
        final com.sap.cap.sflight.delta.proxy.AirportList result = this.copy();
        result.sortBy(increasing);
        return result;
    }

    @Override public com.sap.cloud.server.odata.ListBase toDynamic()
    {
        return this.toEntityList();
    }

    public com.sap.cloud.server.odata.EntityValueList toEntityList()
    {
        return com.sap.cloud.server.odata.EntityValueList.share(this).withItemType(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.airport);
    }

    public java.util.List<com.sap.cap.sflight.delta.proxy.Airport> toGeneric()
    {
        return new com.sap.cloud.server.odata.core.GenericList<com.sap.cap.sflight.delta.proxy.Airport>(this);
    }

    public static class OrderBy
    extends com.sap.cloud.server.odata.core.Comparer
    {
        private com.sap.cloud.server.odata.core.Function2<com.sap.cap.sflight.delta.proxy.Airport, com.sap.cap.sflight.delta.proxy.Airport, Boolean> _increasing_;

        public OrderBy(final com.sap.cloud.server.odata.core.Function2<com.sap.cap.sflight.delta.proxy.Airport, com.sap.cap.sflight.delta.proxy.Airport, Boolean> increasing)
        {
            this.set_increasing(increasing);
        }

        @Override public int compare(final Object left, final Object right)
        {
            final com.sap.cap.sflight.delta.proxy.Airport a = com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Airport.cast(left);
            final com.sap.cap.sflight.delta.proxy.Airport b = com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Airport.cast(right);
            final com.sap.cloud.server.odata.core.Function2<com.sap.cap.sflight.delta.proxy.Airport, com.sap.cap.sflight.delta.proxy.Airport, Boolean> increasing = this.get_increasing();
            return increasing.call(b, a) ? 1 : 0;
        }

        private final com.sap.cloud.server.odata.core.Function2<com.sap.cap.sflight.delta.proxy.Airport, com.sap.cap.sflight.delta.proxy.Airport, Boolean> get_increasing()
        {
            return ((com.sap.cloud.server.odata.core.Function2<com.sap.cap.sflight.delta.proxy.Airport, com.sap.cap.sflight.delta.proxy.Airport, Boolean>)com.sap.cloud.server.odata.core.CheckProperty.isDefined(this, "_increasing", this._increasing_));
        }

        private final void set_increasing(final com.sap.cloud.server.odata.core.Function2<com.sap.cap.sflight.delta.proxy.Airport, com.sap.cap.sflight.delta.proxy.Airport, Boolean> value)
        {
            this._increasing_ = value;
        }
    }
}
