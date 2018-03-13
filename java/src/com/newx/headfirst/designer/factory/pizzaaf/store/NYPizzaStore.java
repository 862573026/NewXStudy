package com.newx.headfirst.designer.factory.pizzaaf.store;

import com.newx.headfirst.designer.factory.FactoryConstant;
import com.newx.headfirst.designer.factory.pizzaaf.Pizza;
import com.newx.headfirst.designer.factory.pizzaaf.pizza.ClamPizza;
import com.newx.headfirst.designer.factory.pizzaaf.pizza.PepperoniPizza;
import com.newx.headfirst.designer.factory.pizzaaf.pizza.VeggiePizza;
import com.newx.headfirst.designer.factory.pizzaaf.raw.NYPizzaIngredientFactory;
import com.newx.headfirst.designer.factory.pizzaaf.pizza.CheesePizza;
import com.newx.headfirst.designer.factory.pizzaaf.raw.base.PizzaIngredientFactory;

/**
 * Created by xuzhijian on 2018/2/11 0011.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals(FactoryConstant.CHEESE)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals(FactoryConstant.VEGGIE)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (item.equals(FactoryConstant.CLAM)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (item.equals(FactoryConstant.PEPPERONI)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
