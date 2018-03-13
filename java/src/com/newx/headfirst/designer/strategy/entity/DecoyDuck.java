package com.newx.headfirst.designer.strategy.entity;

import com.newx.headfirst.designer.strategy.method.FlyNoWay;
import com.newx.headfirst.designer.strategy.method.MuteQuack;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 * 诱饵鸭
 */
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("我是一只诱饵鸭");
    }
}
