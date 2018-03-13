package com.newx.headfirst.designer.factory.pizzafm;

/**
 * Created by xuzhijian on 2018/2/11 0011.
 */
public abstract class PizzaStore {

    abstract Pizza createPizza(String item); //定义的抽象方法

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // ~ 类区块
    // =================================================================================================================


}
