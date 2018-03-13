package com.newx.headfirst.designer.factory.pizzaaf;

import com.newx.headfirst.designer.factory.FactoryConstant;
import com.newx.headfirst.designer.factory.pizzaaf.store.ChicagoPizzaStore;
import com.newx.headfirst.designer.factory.pizzaaf.store.NYPizzaStore;
import com.newx.headfirst.designer.factory.pizzaaf.store.PizzaStore;

/**
 * Created by xuzhijian on 2018/2/11 0011.
 */
public class Test {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(FactoryConstant.CHEESE);
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza(FactoryConstant.CHEESE);
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza(FactoryConstant.CLAM);
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza(FactoryConstant.CLAM);
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza(FactoryConstant.PEPPERONI);
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza(FactoryConstant.PEPPERONI);
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza(FactoryConstant.VEGGIE);
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza(FactoryConstant.VEGGIE);
        System.out.println("Joel ordered a " + pizza + "\n");

    }
}
