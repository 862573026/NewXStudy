package com.newx.headfirst.designer.factory.pizzaaf.raw;

import com.newx.headfirst.designer.factory.pizzaaf.raw.base.*;
import com.newx.headfirst.designer.factory.pizzaaf.raw.veggies.Garlic;
import com.newx.headfirst.designer.factory.pizzaaf.raw.veggies.Mushroom;
import com.newx.headfirst.designer.factory.pizzaaf.raw.veggies.Onion;
import com.newx.headfirst.designer.factory.pizzaaf.raw.veggies.RedPepper;

/**
 * Created by xuzhijian on 2018/2/11 0011.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
