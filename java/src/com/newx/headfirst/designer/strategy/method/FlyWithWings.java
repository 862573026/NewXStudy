package com.newx.headfirst.designer.strategy.method;

import com.newx.headfirst.designer.strategy.imp.FlyBehavior;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("起飞!");
    }
}
