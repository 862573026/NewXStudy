package com.newx.headfirst.designer.iterator.dinermerger;

import java.util.ArrayList;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public class PancakeHouseMenuIterator implements Iterator {

    public ArrayList items;
    public int position = 0;

    public PancakeHouseMenuIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Object object = items.get(position);
        position = position + 1;
        return object;
    }
}
