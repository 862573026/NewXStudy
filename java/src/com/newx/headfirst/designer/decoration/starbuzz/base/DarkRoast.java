package com.newx.headfirst.designer.decoration.starbuzz.base;

/**
 * Created by xuzhijian on 2018/2/8 0008.
 * 深焙咖啡
 */
public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
