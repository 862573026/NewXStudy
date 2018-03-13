package com.newx.headfirst.designer.factory.pizzas;

/**
 * Created by xuzhijian on 2018/2/11 0011.
 */
public class PizzaStore {

    SimplePizzaFactory mFactory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.mFactory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = mFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
