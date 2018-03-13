package com.newx.headfirst.designer.decoration.starbuzz.base;

/**
 * Created by xuzhijian on 2018/2/
 * 浓缩咖啡
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
