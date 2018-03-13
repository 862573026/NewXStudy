package com.newx.headfirst.designer.factory.pizzaaf.pizza;

import com.newx.headfirst.designer.factory.pizzaaf.Pizza;
import com.newx.headfirst.designer.factory.pizzaaf.raw.base.PizzaIngredientFactory;

/**
 * Created by xuzhijian on 2018/2/11 0011.
 */
public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + mName);
        mDough = ingredientFactory.createDough();
        mSauce = ingredientFactory.createSauce();
        mCheese = ingredientFactory.createCheese();
        mClams = ingredientFactory.createClam();
    }
}
