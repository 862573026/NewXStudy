package com.newx.headfirst.designer.iterator.dinermergerjava;


import java.util.ArrayList;
import java.util.Iterator;

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

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Alternating Diner Menu Iterator does not support remove()");
    }
}
