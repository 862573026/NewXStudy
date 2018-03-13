package com.newx.headfirst.designer.factory.pizzafm;

import com.newx.headfirst.designer.factory.FactoryConstant;

/**
 * Created by xuzhijian on 2018/2/11 0011.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (item.equals(FactoryConstant.CHEESE)) {
            return new NYStyleCheesePizza();
        } else if (item.equals(FactoryConstant.VEGGIE)) {
            return new NYStyleVeggiePizza();
        } else if (item.equals(FactoryConstant.CLAM)) {
            return new NYStyleClamPizza();
        } else if (item.equals(FactoryConstant.PEPPERONI)) {
            return new NYStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
