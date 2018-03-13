package com.newx.headfirst.designer.decoration.starbuzz;

import com.newx.headfirst.designer.decoration.starbuzz.base.Beverage;
import com.newx.headfirst.designer.decoration.starbuzz.base.DarkRoast;
import com.newx.headfirst.designer.decoration.starbuzz.base.Espresso;
import com.newx.headfirst.designer.decoration.starbuzz.decorator.Mocha;
import com.newx.headfirst.designer.decoration.starbuzz.decorator.Whip;

/**
 * Created by xuzhijian on 2018/2/8 0008.
 */
public class StarBuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }
}
