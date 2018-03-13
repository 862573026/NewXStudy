package com.newx.headfirst.designer.adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by xuzhijian on 2018/2/13 0013.
 */
public class EnumerationIterator implements Iterator {

    private Enumeration mEnumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.mEnumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return mEnumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return mEnumeration.nextElement();
    }

    //Java中好像默认实现了
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
