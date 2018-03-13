package com.newx.headfirst.designer.combining.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by xuzhijian on 2018/3/2 0002.
 */
public class Flock implements Quackable {

    private ArrayList mDucks = new ArrayList();

    public void add(Quackable duck) {
        mDucks.add(duck);
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = mDucks.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable) iterator.next();
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }

    @Override
    public void quack() {
        Iterator iterator = mDucks.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable) iterator.next();
            duck.quack();
        }
    }

    @Override
    public String toString() {
        return "鸭子群";
    }
}
