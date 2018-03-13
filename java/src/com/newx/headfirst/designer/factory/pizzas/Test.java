package com.newx.headfirst.designer.factory.pizzas;

import com.newx.headfirst.designer.factory.FactoryConstant;

/**
 * Created by xuzhijian on 2018/2/11 0011.
 */
public class Test {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza(FactoryConstant.CHEESE);
        System.out.println("We ordered a " + pizza.getName() + "\n");

        pizza = store.orderPizza(FactoryConstant.VEGGIE);
        System.out.println("We ordered a " + pizza.getName() + "\n");
    }
}
