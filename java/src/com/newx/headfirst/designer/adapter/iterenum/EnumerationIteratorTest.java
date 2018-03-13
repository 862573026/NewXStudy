package com.newx.headfirst.designer.adapter.iterenum;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by xuzhijian on 2018/2/13 0013.
 */
public class EnumerationIteratorTest {

    public static void main(String[] args) {
        //EnumerationIterator 测试
        Vector v = new Vector();
        v.addElement("EnumerationIterator 1");
        v.addElement("EnumerationIterator 2");
        v.addElement("EnumerationIterator 3");
        v.addElement("EnumerationIterator 4");

        Iterator iterator = new EnumerationIterator(v.elements());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //IteratorEnumeration 测试
        ArrayList a = new ArrayList();
        a.add("IteratorEnumeration 1");
        a.add("IteratorEnumeration 2");
        a.add("IteratorEnumeration 3");
        a.add("IteratorEnumeration 4");

        Enumeration enumeration = new IteratorEnumeration(a.iterator());
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
