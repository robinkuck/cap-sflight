package com.sap.cap.sflight.delta.proxy;

public class SupplementTypeTextsList
    extends com.sap.cloud.server.odata.ListBase
    implements java.lang.Iterable<com.sap.cap.sflight.delta.proxy.SupplementTypeTexts>
{
    public static final com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList empty = new com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList(java.lang.Integer.MIN_VALUE);

    public SupplementTypeTextsList()
    {
        this(4);
    }

    public SupplementTypeTextsList(final int capacity)
    {
        super(capacity);
    }

    public final void add(final com.sap.cap.sflight.delta.proxy.SupplementTypeTexts item)
    {
        this.getUntypedList().add(((Object)item));
    }

    public final void addAll(final com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList list)
    {
        this.getUntypedList().addAll(list.getUntypedList());
    }

    public final com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList addThis(final com.sap.cap.sflight.delta.proxy.SupplementTypeTexts item)
    {
        this.add(item);
        return this;
    }

    public final com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList copy()
    {
        return this.slice(0);
    }

    public final com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList filter(final com.sap.cloud.server.odata.core.Function1<com.sap.cap.sflight.delta.proxy.SupplementTypeTexts, Boolean> predicate)
    {
        int n = this.length();
        if (n > 4)
        {
            n = 4;
        }
        final com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList result = new com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList(n);
        // for (let item of this)
        {
            final com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList item_list = this;
            final int item_count = item_list.length();
            int item_index;
            for (item_index = 0; item_index < item_count; item_index++)
            {
                final com.sap.cap.sflight.delta.proxy.SupplementTypeTexts item = item_list.get(item_index);
                if (predicate.call(item))
                {
                    result.add(item);
                }
            }
        }
        return result;
    }

    public final com.sap.cap.sflight.delta.proxy.SupplementTypeTexts first()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_SupplementTypeTexts.cast(this.getUntypedList().first());
    }

    public static com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList from(final java.util.List<com.sap.cap.sflight.delta.proxy.SupplementTypeTexts> list)
    {
        return SupplementTypeTextsList.share(new com.sap.cloud.server.odata.core.GenericList<com.sap.cap.sflight.delta.proxy.SupplementTypeTexts>(list).toAnyList());
    }

    public final com.sap.cap.sflight.delta.proxy.SupplementTypeTexts get(final int index)
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_SupplementTypeTexts.cast(this.getUntypedList().get(index));
    }

    public final boolean includes(final com.sap.cap.sflight.delta.proxy.SupplementTypeTexts item)
    {
        return this.indexOf(item) != -1;
    }

    public final int indexOf(final com.sap.cap.sflight.delta.proxy.SupplementTypeTexts item)
    {
        return this.indexOf(item, 0);
    }

    public final int indexOf(final com.sap.cap.sflight.delta.proxy.SupplementTypeTexts item, final int start)
    {
        return this.getUntypedList().indexOf(((Object)item), start);
    }

    public final void insertAll(final int index, final com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList list)
    {
        this.getUntypedList().insertAll(index, list.getUntypedList());
    }

    public final void insertAt(final int index, final com.sap.cap.sflight.delta.proxy.SupplementTypeTexts item)
    {
        this.getUntypedList().insertAt(index, ((Object)item));
    }

    public java.util.Iterator<com.sap.cap.sflight.delta.proxy.SupplementTypeTexts> iterator()
    {
        return this.toGeneric().iterator();
    }

    public final com.sap.cap.sflight.delta.proxy.SupplementTypeTexts last()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_SupplementTypeTexts.cast(this.getUntypedList().last());
    }

    public final int lastIndexOf(final com.sap.cap.sflight.delta.proxy.SupplementTypeTexts item)
    {
        return this.lastIndexOf(item, 2147483647);
    }

    public final int lastIndexOf(final com.sap.cap.sflight.delta.proxy.SupplementTypeTexts item, final int start)
    {
        return this.getUntypedList().lastIndexOf(((Object)item), start);
    }

    public static com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList of(final com.sap.cap.sflight.delta.proxy.SupplementTypeTexts... items)
    {
        com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList rest_items = new com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList(items.length);
        for (com.sap.cap.sflight.delta.proxy.SupplementTypeTexts items_item : items) rest_items.add(items_item);
        return rest_items;
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList reversed()
    {
        final com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList result = this.copy();
        result.reverse();
        return result;
    }

    public final void set(final int index, final com.sap.cap.sflight.delta.proxy.SupplementTypeTexts item)
    {
        this.getUntypedList().set(index, ((Object)item));
    }

    public static com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList share(final com.sap.cloud.server.odata.ListBase list)
    {
        final com.sap.cloud.server.odata.core.UntypedList items = list.getUntypedList();
        final int n = items.length();
        final com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList result = new com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList(n);
        boolean replace = false;
        {
            int i = 0;
            for (; (i < n); i++)
            {
                final Object item = items.get(i);
                if (item instanceof com.sap.cap.sflight.delta.proxy.SupplementTypeTexts)
                {
                    final com.sap.cap.sflight.delta.proxy.SupplementTypeTexts var_item = ((com.sap.cap.sflight.delta.proxy.SupplementTypeTexts)item);
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

    public final com.sap.cap.sflight.delta.proxy.SupplementTypeTexts single()
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_SupplementTypeTexts.cast(this.getUntypedList().single());
    }

    public final com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList slice(final int start)
    {
        return this.slice(start, 2147483647);
    }

    public final com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList slice(final int start, final int end)
    {
        final com.sap.cloud.server.odata.core.UntypedList list = this.getUntypedList();
        final int var_start = list.startRange(start);
        final int var_end = list.endRange(end);
        final com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList result = new com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList(var_end - var_start);
        result.getUntypedList().addRange(list, var_start, var_end);
        return result;
    }

    public final void sortBy(final com.sap.cloud.server.odata.core.Function2<com.sap.cap.sflight.delta.proxy.SupplementTypeTexts, com.sap.cap.sflight.delta.proxy.SupplementTypeTexts, Boolean> increasing)
    {
        this.sortWith(new com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList.OrderBy(increasing));
    }

    public final com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList sorted()
    {
        final com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList result = this.copy();
        result.sort();
        return result;
    }

    public final com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList sortedBy(final com.sap.cloud.server.odata.core.Function2<com.sap.cap.sflight.delta.proxy.SupplementTypeTexts, com.sap.cap.sflight.delta.proxy.SupplementTypeTexts, Boolean> increasing)
    {
        final com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList result = this.copy();
        result.sortBy(increasing);
        return result;
    }

    @Override public com.sap.cloud.server.odata.ListBase toDynamic()
    {
        return this.toEntityList();
    }

    public com.sap.cloud.server.odata.EntityValueList toEntityList()
    {
        return com.sap.cloud.server.odata.EntityValueList.share(this).withItemType(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplementTypeTexts);
    }

    public java.util.List<com.sap.cap.sflight.delta.proxy.SupplementTypeTexts> toGeneric()
    {
        return new com.sap.cloud.server.odata.core.GenericList<com.sap.cap.sflight.delta.proxy.SupplementTypeTexts>(this);
    }

    public static class OrderBy
    extends com.sap.cloud.server.odata.core.Comparer
    {
        private com.sap.cloud.server.odata.core.Function2<com.sap.cap.sflight.delta.proxy.SupplementTypeTexts, com.sap.cap.sflight.delta.proxy.SupplementTypeTexts, Boolean> _increasing_;

        public OrderBy(final com.sap.cloud.server.odata.core.Function2<com.sap.cap.sflight.delta.proxy.SupplementTypeTexts, com.sap.cap.sflight.delta.proxy.SupplementTypeTexts, Boolean> increasing)
        {
            this.set_increasing(increasing);
        }

        @Override public int compare(final Object left, final Object right)
        {
            final com.sap.cap.sflight.delta.proxy.SupplementTypeTexts a = com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_SupplementTypeTexts.cast(left);
            final com.sap.cap.sflight.delta.proxy.SupplementTypeTexts b = com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_SupplementTypeTexts.cast(right);
            final com.sap.cloud.server.odata.core.Function2<com.sap.cap.sflight.delta.proxy.SupplementTypeTexts, com.sap.cap.sflight.delta.proxy.SupplementTypeTexts, Boolean> increasing = this.get_increasing();
            return increasing.call(b, a) ? 1 : 0;
        }

        private final com.sap.cloud.server.odata.core.Function2<com.sap.cap.sflight.delta.proxy.SupplementTypeTexts, com.sap.cap.sflight.delta.proxy.SupplementTypeTexts, Boolean> get_increasing()
        {
            return ((com.sap.cloud.server.odata.core.Function2<com.sap.cap.sflight.delta.proxy.SupplementTypeTexts, com.sap.cap.sflight.delta.proxy.SupplementTypeTexts, Boolean>)com.sap.cloud.server.odata.core.CheckProperty.isDefined(this, "_increasing", this._increasing_));
        }

        private final void set_increasing(final com.sap.cloud.server.odata.core.Function2<com.sap.cap.sflight.delta.proxy.SupplementTypeTexts, com.sap.cap.sflight.delta.proxy.SupplementTypeTexts, Boolean> value)
        {
            this._increasing_ = value;
        }
    }
}
