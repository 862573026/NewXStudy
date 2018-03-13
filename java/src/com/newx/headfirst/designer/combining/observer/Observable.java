package com.newx.headfirst.designer.combining.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by xuzhijian on 2018/3/2 0002.
 * Observable 辅助类
 */
public class Observable implements QuackObservable{

    private ArrayList mObservers = new ArrayList();
    private QuackObservable mDuck;

    public Observable(QuackObservable duck) {
        this.mDuck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        mObservers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = mObservers.iterator();

        while (iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
            observer.update(mDuck);
        }
    }
}
