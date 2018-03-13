package com.newx.headfirst.designer.templatemethod.barista;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("用沸水冲泡咖啡");
    }

    @Override
    public void addCondiments() {
        System.out.println("加糖和牛奶");
    }
}
