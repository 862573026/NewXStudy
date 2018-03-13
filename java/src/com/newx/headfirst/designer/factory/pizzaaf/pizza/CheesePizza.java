package com.newx.headfirst.designer.factory.pizzaaf.pizza;

import com.newx.headfirst.designer.factory.pizzaaf.Pizza;
import com.newx.headfirst.designer.factory.pizzaaf.raw.base.PizzaIngredientFactory;

/**
 * Created by xuzhijian on 2018/2/11 0011.
 */
public class CheesePizza extends Pizza {

    PizzaIngredientFactory mIngredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.mIngredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + mName);
        mDough = mIngredientFactory.createDough();
        mSauce = mIngredientFactory.createSauce();
        mCheese = mIngredientFactory.createCheese();
    }
}
