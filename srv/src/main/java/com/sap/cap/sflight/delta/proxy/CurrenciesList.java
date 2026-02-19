package com.sap.cap.sflight.delta.proxy;

public class CurrenciesList
    extends com.sap.cloud.server.odata.ListBase
    implements java.lang.Iterable<com.sap.cap.sflight.delta.proxy.Currencies>
{
    public static final com.sap.cap.sflight.delta.proxy.CurrenciesList empty = new com.sap.cap.sflight.delta.proxy.CurrenciesList(java.lang.Integer.MIN_VALUE);

    public CurrenciesList()
    {
        this(4);
    }

    public CurrenciesList(final int capacity)
    {
        super(capacity);
    }

    public final void add(final com.sap.cap.sflight.delta.proxy.Currencies item)
    {
        this.getUntypedList().add(((Object)item));
    }

    public final void addAll(final com.sap.cap.sflight.delta.proxy.CurrenciesList list)
    {
        this.getUntypedList().addAll(list.getUntypedList());
    }

    public final com.sap.cap.sflight.delta.proxy.CurrenciesList addThis(final com.sap.cap.sflight.delta.proxy.Currencies item)
    {
        this.add(item);
        return this;
    }

    public final com.sap.cap.sflight.delta.proxy.CurrenciesList copy()
    {
        return this.slice(0);
    }

    public final com.sap.cap.sflight.delta.proxy.CurrenciesList filter(final com.sap.cloud.server.odata.core.Function1<com.sap.cap.sflight.delta.proxy.Currencies, Boolean> predicate)
    {
        int n = this.length();
        if (n > 4)
        {
            n = 4;
        }
        final com.sap.cap.sflight.delta.proxy.CurrenciesList result = new com.sap.cap.sflight.delta.proxy.CurrenciesList(n);
        // for (let item of this)
        {
            final com.sap.cap.sflight.delta.proxy.CurrenciesList item_list = this;
            final int item_count = item_list.length();
            int item_index;
            for (item_index = 0; item_index < item_count; item_index++)
            {
                final com.sap.cap.sflight.delta.proxy.Currencies item = item_list.get(item_index);
                if (predicate.call(item))
                {
                    result.add(item);
                }
            }
        }
        return result;
    }

    public final com.sap.cap.sflight.delta.proxy.Currencies first()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Currencies.cast(this.getUntypedList().first());
    }

    public static com.sap.cap.sflight.delta.proxy.CurrenciesList from(final java.util.List<com.sap.cap.sflight.delta.proxy.Currencies> list)
    {
        return CurrenciesList.share(new com.sap.cloud.server.odata.core.GenericList<com.sap.cap.sflight.delta.proxy.Currencies>(list).toAnyList());
    }

    public final com.sap.cap.sflight.delta.proxy.Currencies get(final int index)
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Currencies.cast(this.getUntypedList().get(index));
    }

    public final boolean includes(final com.sap.cap.sflight.delta.proxy.Currencies item)
    {
        return this.indexOf(item) != -1;
    }

    public final int indexOf(final com.sap.cap.sflight.delta.proxy.Currencies item)
    {
        return this.indexOf(item, 0);
    }

    public final int indexOf(final com.sap.cap.sflight.delta.proxy.Currencies item, final int start)
    {
        return this.getUntypedList().indexOf(((Object)item), start);
    }

    public final void insertAll(final int index, final com.sap.cap.sflight.delta.proxy.CurrenciesList list)
    {
        this.getUntypedList().insertAll(index, list.getUntypedList());
    }

    public final void insertAt(final int index, final com.sap.cap.sflight.delta.proxy.Currencies item)
    {
        this.getUntypedList().insertAt(index, ((Object)item));
    }

    public java.util.Iterator<com.sap.cap.sflight.delta.proxy.Currencies> iterator()
    {
        return this.toGeneric().iterator();
    }

    public final com.sap.cap.sflight.delta.proxy.Currencies last()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Currencies.cast(this.getUntypedList().last());
    }

    public final int lastIndexOf(final com.sap.cap.sflight.delta.proxy.Currencies item)
    {
        return this.lastIndexOf(item, 2147483647);
    }

    public final int lastIndexOf(final com.sap.cap.sflight.delta.proxy.Currencies item, final int start)
    {
        return this.getUntypedList().lastIndexOf(((Object)item), start);
    }

    public static com.sap.cap.sflight.delta.proxy.CurrenciesList of(final com.sap.cap.sflight.delta.proxy.Currencies... items)
    {
        com.sap.cap.sflight.delta.proxy.CurrenciesList rest_items = new com.sap.cap.sflight.delta.proxy.CurrenciesList(items.length);
        for (com.sap.cap.sflight.delta.proxy.Currencies items_item : items) rest_items.add(items_item);
        return rest_items;
    }

    public com.sap.cap.sflight.delta.proxy.CurrenciesList reversed()
    {
        final com.sap.cap.sflight.delta.proxy.CurrenciesList result = this.copy();
        result.reverse();
        return result;
    }

    public final void set(final int index, final com.sap.cap.sflight.delta.proxy.Currencies item)
    {
        this.getUntypedList().set(index, ((Object)item));
    }

    public static com.sap.cap.sflight.delta.proxy.CurrenciesList share(final com.sap.cloud.server.odata.ListBase list)
    {
        final com.sap.cloud.server.odata.core.UntypedList items = list.getUntypedList();
        final int n = items.length();
        final com.sap.cap.sflight.delta.proxy.CurrenciesList result = new com.sap.cap.sflight.delta.proxy.CurrenciesList(n);
        boolean replace = false;
        {
            int i = 0;
            for (; (i < n); i++)
            {
                final Object item = items.get(i);
                if (item instanceof com.sap.cap.sflight.delta.proxy.Currencies)
                {
                    final com.sap.cap.sflight.delta.proxy.Currencies var_item = ((com.sap.cap.sflight.delta.proxy.Currencies)item);
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

    public final com.sap.cap.sflight.delta.proxy.Currencies single()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Currencies.cast(this.getUntypedList().single());
    }

    public final com.sap.cap.sflight.delta.proxy.CurrenciesList slice(final int start)
    {
        return this.slice(start, 2147483647);
    }

    public final com.sap.cap.sflight.delta.proxy.CurrenciesList slice(final int start, final int end)
    {
        final com.sap.cloud.server.odata.core.UntypedList list = this.getUntypedList();
        final int var_start = list.startRange(start);
        final int var_end = list.endRange(end);
        final com.sap.cap.sflight.delta.proxy.CurrenciesList result = new com.sap.cap.sflight.delta.proxy.CurrenciesList(var_end - var_start);
        result.getUntypedList().addRange(list, var_start, var_end);
        return result;
    }

    public final void sortBy(final com.sap.cloud.server.odata.core.Function2<com.sap.cap.sflight.delta.proxy.Currencies, com.sap.cap.sflight.delta.proxy.Currencies, Boolean> increasing)
    {
        this.sortWith(new com.sap.cap.sflight.delta.proxy.CurrenciesList.OrderBy(increasing));
    }

    public final com.sap.cap.sflight.delta.proxy.CurrenciesList sorted()
    {
        final com.sap.cap.sflight.delta.proxy.CurrenciesList result = this.copy();
        result.sort();
        return result;
    }

    public final com.sap.cap.sflight.delta.proxy.CurrenciesList sortedBy(final com.sap.cloud.server.odata.core.Function2<com.sap.cap.sflight.delta.proxy.Currencies, com.sap.cap.sflight.delta.proxy.Currencies, Boolean> increasing)
    {
        final com.sap.cap.sflight.delta.proxy.CurrenciesList result = this.copy();
        result.sortBy(increasing);
        return result;
    }

    @Override public com.sap.cloud.server.odata.ListBase toDynamic()
    {
        return this.toEntityList();
    }

    public com.sap.cloud.server.odata.EntityValueList toEntityList()
    {
        return com.sap.cloud.server.odata.EntityValueList.share(this).withItemType(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.currencies);
    }

    public java.util.List<com.sap.cap.sflight.delta.proxy.Currencies> toGeneric()
    {
        return new com.sap.cloud.server.odata.core.GenericList<com.sap.cap.sflight.delta.proxy.Currencies>(this);
    }

    public static class OrderBy
    extends com.sap.cloud.server.odata.core.Comparer
    {
        private com.sap.cloud.server.odata.core.Function2<com.sap.cap.sflight.delta.proxy.Currencies, com.sap.cap.sflight.delta.proxy.Currencies, Boolean> _increasing_;

        public OrderBy(final com.sap.cloud.server.odata.core.Function2<com.sap.cap.sflight.delta.proxy.Currencies, com.sap.cap.sflight.delta.proxy.Currencies, Boolean> increasing)
        {
            this.set_increasing(increasing);
        }

        @Override public int compare(final Object left, final Object right)
        {
            final com.sap.cap.sflight.delta.proxy.Currencies a = com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Currencies.cast(left);
            final com.sap.cap.sflight.delta.proxy.Currencies b = com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Currencies.cast(right);
            final com.sap.cloud.server.odata.core.Function2<com.sap.cap.sflight.delta.proxy.Currencies, com.sap.cap.sflight.delta.proxy.Currencies, Boolean> increasing = this.get_increasing();
            return increasing.call(b, a) ? 1 : 0;
        }

        private final com.sap.cloud.server.odata.core.Function2<com.sap.cap.sflight.delta.proxy.Currencies, com.sap.cap.sflight.delta.proxy.Currencies, Boolean> get_increasing()
        {
            return ((com.sap.cloud.server.odata.core.Function2<com.sap.cap.sflight.delta.proxy.Currencies, com.sap.cap.sflight.delta.proxy.Currencies, Boolean>)com.sap.cloud.server.odata.core.CheckProperty.isDefined(this, "_increasing", this._increasing_));
        }

        private final void set_increasing(final com.sap.cloud.server.odata.core.Function2<com.sap.cap.sflight.delta.proxy.Currencies, com.sap.cap.sflight.delta.proxy.Currencies, Boolean> value)
        {
            this._increasing_ = value;
        }
    }
}
