package com.newx.headfirst.designer.factory.pizzafm;

/**
 * Created by xuzhijian on 2018/2/11 0011.
 */
public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        name = "Chicago Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
    }

    protected void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
