package com.newx.headfirst.designer.strategy.entity;

import com.newx.headfirst.designer.strategy.method.FlyWithWings;
import com.newx.headfirst.designer.strategy.method.Quack;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 * 绿头鸭
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        mQuackBehavior = new Quack();
        mFlyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("我是一只绿头鸭");
    }
}
