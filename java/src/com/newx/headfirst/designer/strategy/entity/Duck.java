package com.newx.headfirst.designer.strategy.entity;

import com.newx.headfirst.designer.strategy.imp.FlyBehavior;
import com.newx.headfirst.designer.strategy.imp.QuackBehavior;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public abstract class Duck {

    public FlyBehavior mFlyBehavior;
    public QuackBehavior mQuackBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        mFlyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        mQuackBehavior = quackBehavior;
    }

    public abstract void display();

    public void performFly() {
        mFlyBehavior.fly();
    }

    public void performQuack() {
        mQuackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

}
