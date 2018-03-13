package com.newx.headfirst.designer.strategy.method;

import com.newx.headfirst.designer.strategy.imp.FlyBehavior;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我坐上火箭上天了");
    }
}
