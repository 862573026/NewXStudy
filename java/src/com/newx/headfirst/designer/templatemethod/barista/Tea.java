package com.newx.headfirst.designer.templatemethod.barista;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("用沸水浸泡茶叶");
    }

    @Override
    public void addCondiments() {
        System.out.println("加柠檬");
    }
}
