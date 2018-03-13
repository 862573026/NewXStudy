package com.newx.headfirst.designer.decoration.starbuzz.base;

/**
 * Created by xuzhijian on 2018/2/8 0008.
 * 低咖啡因
 */
public class Decat extends Beverage {

    public Decat() {
        description = "Decat";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
