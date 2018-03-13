package com.newx.headfirst.designer.combining.observer;

import com.newx.headfirst.designer.combining.adapter.Goose;

/**
 * Created by xuzhijian on 2018/3/2 0002.
 */
public class GooseAdapter implements Quackable {
    private Goose mGoose;
    private Observable mObservable;

    public GooseAdapter(Goose goose) {
        mGoose = goose;
        mObservable = new Observable(this);
    }

    @Override
    public void quack() {
        mGoose.honk();
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        mObservable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        mObservable.notifyObservers();
    }

    @Override
    public String toString() {
        return "鹅 -> 假装是只鸭子";
    }
}
