package com.newx.headfirst.designer.strategy.entity;

import com.newx.headfirst.designer.strategy.method.FlyNoWay;
import com.newx.headfirst.designer.strategy.method.Quack;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        mFlyBehavior = new FlyNoWay();
        mQuackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是一只模型鸭");
    }
}
