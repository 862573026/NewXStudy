package com.newx.headfirst.designer.factory.pizzafm;

/**
 * Created by xuzhijian on 2018/2/11 0011.
 */
public class NYStyleCheesePizza extends Pizza{

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
