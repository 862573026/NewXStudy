package com.newx.headfirst.designer.combining.observer;

/**
 * Created by xuzhijian on 2018/3/2 0002.
 */
public class QuackCounter implements Quackable {

    private Quackable mDuck;
    private static int mNumberOfQuacks;

    public QuackCounter(Quackable duck) {
        mDuck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        mDuck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        mDuck.notifyObservers();
    }

    @Override
    public void quack() {
        mDuck.quack();
        mNumberOfQuacks++;
    }

    public static int getQuacks() {
        return mNumberOfQuacks;
    }

    //重置鸭子叫声数量
    public static void resetQuacks() {
        mNumberOfQuacks = 0;
    }
}
