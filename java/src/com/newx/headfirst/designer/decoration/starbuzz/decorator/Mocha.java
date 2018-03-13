package com.newx.headfirst.designer.decoration.starbuzz.decorator;

import com.newx.headfirst.designer.decoration.starbuzz.base.Beverage;

/**
 * Created by xuzhijian on 2018/2/8 0008.
 * 摩卡
 */
public class Mocha extends CondimentDecorator {
    Beverage mBeverage;

    public Mocha(Beverage beverage) {
        mBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return mBeverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + mBeverage.cost();
    }
}
