package com.newx.headfirst.designer.strategy.method;

import com.newx.headfirst.designer.strategy.imp.QuackBehavior;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 * 静音
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<　最怕空气突然安静　>>");
    }
}
