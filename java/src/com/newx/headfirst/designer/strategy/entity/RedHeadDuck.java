package com.newx.headfirst.designer.strategy.entity;

import com.newx.headfirst.designer.strategy.method.FlyWithWings;
import com.newx.headfirst.designer.strategy.method.Quack;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        mFlyBehavior = new FlyWithWings();
        mQuackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是一只红头鸭");
    }
}
