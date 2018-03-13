package com.newx.headfirst.designer.decoration.starbuzz.base;

/**
 * Created by xuzhijian on 2018/2/8 0008.
 * 综合咖啡
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
