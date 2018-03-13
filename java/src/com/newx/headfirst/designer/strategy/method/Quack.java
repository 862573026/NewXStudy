package com.newx.headfirst.designer.strategy.method;

import com.newx.headfirst.designer.strategy.imp.QuackBehavior;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 * 鸭子的呱呱叫
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱呱");
    }
}
