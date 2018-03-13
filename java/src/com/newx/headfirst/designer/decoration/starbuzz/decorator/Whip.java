package com.newx.headfirst.designer.decoration.starbuzz.decorator;

import com.newx.headfirst.designer.decoration.starbuzz.base.Beverage;

/**
 * Created by xuzhijian on 2018/2/8 0008.
 * 奶泡
 */
public class Whip extends CondimentDecorator {
    Beverage mBeverage;

    public Whip(Beverage beverage) {
        mBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return mBeverage.getDescription() + ",Whip";
    }

    @Override
    public double cost() {
        return 0.10 + mBeverage.cost();
    }
}
