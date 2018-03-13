package com.newx.headfirst.designer.iterator.dinermerger;

import com.newx.headfirst.designer.iterator.dinermerger.entity.MenuItem;


/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public class DinerMenuIterator implements Iterator {

    public MenuItem[] items;
    public int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position > items.length - 1 || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
}
