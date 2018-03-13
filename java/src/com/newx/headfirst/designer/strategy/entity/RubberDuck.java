package com.newx.headfirst.designer.strategy.entity;

import com.newx.headfirst.designer.strategy.method.FlyNoWay;
import com.newx.headfirst.designer.strategy.method.Squeak;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        mFlyBehavior = new FlyNoWay();
        mQuackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("我是一只橡皮鸭");
    }
}
