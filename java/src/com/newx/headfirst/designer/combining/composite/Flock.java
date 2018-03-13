package com.newx.headfirst.designer.combining.composite;

import com.newx.headfirst.designer.combining.base.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by xuzhijian on 2018/3/2 0002.
 * Flock：群
 */
public class Flock implements Quackable {

    private ArrayList quackers = new ArrayList();

    public void add(Quackable quackable) {
        quackers.add(quackable);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();//用了迭代器模式
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
    }
}
