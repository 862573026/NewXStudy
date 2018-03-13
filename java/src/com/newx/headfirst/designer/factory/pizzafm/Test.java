package com.newx.headfirst.designer.factory.pizzafm;

import com.newx.headfirst.designer.factory.FactoryConstant;

/**
 * Created by xuzhijian on 2018/2/11 0011.
 */
public class Test {

    public static void main(String[] args) {
        PizzaStore mNyStore = new NYPizzaStore();
        PizzaStore mChicagoStore = new ChicagoPizzaStore();

        Pizza pizza = mNyStore.orderPizza(FactoryConstant.CHEESE);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = mChicagoStore.orderPizza(FactoryConstant.CHEESE);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = mNyStore.orderPizza(FactoryConstant.CLAM);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = mChicagoStore.orderPizza(FactoryConstant.PEPPERONI);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

    }
}
