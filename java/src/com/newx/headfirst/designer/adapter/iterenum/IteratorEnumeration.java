package com.newx.headfirst.designer.adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by xuzhijian on 2018/2/13 0013.
 */
public class IteratorEnumeration implements Enumeration {

    private Iterator mIterator;

    public IteratorEnumeration(Iterator iterator) {
        this.mIterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return mIterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return mIterator.next();
    }
}
