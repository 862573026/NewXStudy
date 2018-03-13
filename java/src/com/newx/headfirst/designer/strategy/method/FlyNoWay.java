package com.newx.headfirst.designer.strategy.method;

import com.newx.headfirst.designer.strategy.imp.FlyBehavior;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我不会飞");
    }
}
