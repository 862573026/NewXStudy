package com.newx.headfirst.designer.factory.pizzaaf.store;

import com.newx.headfirst.designer.factory.pizzaaf.Pizza;

/**
 * Created by xuzhijian on 2018/2/11 0011.
 */
public abstract class PizzaStore {

    protected abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
