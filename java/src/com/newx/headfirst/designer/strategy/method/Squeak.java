package com.newx.headfirst.designer.strategy.method;

import com.newx.headfirst.designer.strategy.imp.QuackBehavior;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 * 橡皮鸭的吱吱叫
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("吱吱吱");
    }
}
