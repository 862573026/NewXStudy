package com.newx.headfirst.designer.factory.pizzaaf.raw.base;

/**
 * Created by xuzhijian on 2018/2/11 0011.
 * 原料工厂
 */
public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();
}
