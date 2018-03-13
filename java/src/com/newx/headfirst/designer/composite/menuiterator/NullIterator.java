package com.newx.headfirst.designer.composite.menuiterator;

import java.util.Iterator;

/**
 * Created by xuzhijian on 2018/2/23 0023.
 * 空迭代器hasNext一致为false
 */
public class NullIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
