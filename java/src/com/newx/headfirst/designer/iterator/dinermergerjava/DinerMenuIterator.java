package com.newx.headfirst.designer.iterator.dinermergerjava;


import com.newx.headfirst.designer.iterator.dinermergerjava.entity.MenuItem;

import java.util.Iterator;

/**
 * Created by xuzhijian on 2018/2/23 0023.
 */
public class DinerMenuIterator implements Iterator {

    MenuItem[] list;
    int position = 0;

    public DinerMenuIterator(MenuItem[] list) {
        this.list = list;
    }

    @Override
    public Object next() {
        MenuItem menuItem = list[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if (position >= list.length || list[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    //高版本remove可以不实现
    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("菜单没有数据");
        }

        if (list[position - 1] != null) {
            for (int i = position - 1; i < (list.length - 1); i++) {
                list[i] = list[i + 1];
            }
            list[list.length - 1] = null;
        }
    }
}
