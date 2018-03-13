package com.newx.headfirst.designer.combining.decorator;

import com.newx.headfirst.designer.combining.base.Quackable;

/**
 * Created by xuzhijian on 2018/3/2 0002.
 */
public class QuackCounter implements Quackable {

    private Quackable mDuck;
    private static int mNumberOfQuacks; //静态变量来统计 -> jvm计数(理解JVM还是有好处的，所以，即使多个new，这个还是唯一的而且数值一直存在)

    public QuackCounter(Quackable duck) {
        this.mDuck = duck;
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
