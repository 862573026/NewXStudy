package com.newx.headfirst.designer.factory.pizzas;

import com.newx.headfirst.designer.factory.FactoryConstant;

/**
 * Created by xuzhijian on 2018/2/11 0011.
 */
public class SimplePizzaFactory {


    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals(FactoryConstant.CHEESE)) {
            pizza = new CheesePizza();
        } else if (type.equals(FactoryConstant.PEPPERONI)) {
            pizza = new PepperoniPizza();
        } else if (type.equals(FactoryConstant.CLAM)) {
            pizza = new ClamPizza();
        } else if (type.equals(FactoryConstant.VEGGIE)) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }


    public class CheesePizza extends Pizza {
        public CheesePizza() {
            name = "Cheese Pizza";
            dough = "Regular Crust";
            sauce = "Marinara Pizza Sauce";
            toppings.add("Fresh Mozzarella");
            toppings.add("Parmesan");
        }
    }

    public class ClamPizza extends Pizza {
        public ClamPizza() {
            name = "Clam Pizza";
            dough = "Thin crust";
            sauce = "White garlic sauce";
            toppings.add("Clams");
            toppings.add("Grated parmesan cheese");
        }
    }

    public class PepperoniPizza extends Pizza {
        public PepperoniPizza() {
            name = "Pepperoni Pizza";
            dough = "Crust";
            sauce = "Marinara sauce";
            toppings.add("Sliced Pepperoni");
            toppings.add("Sliced Onion");
            toppings.add("Grated parmesan cheese");
        }
    }

    public class VeggiePizza extends Pizza {
        public VeggiePizza() {
            name = "Veggie Pizza";
            dough = "Crust";
            sauce = "Marinara sauce";
            toppings.add("Shredded mozzarella");
            toppings.add("Grated parmesan");
            toppings.add("Diced onion");
            toppings.add("Sliced mushrooms");
            toppings.add("Sliced red pepper");
            toppings.add("Sliced black olives");
        }
    }

}
