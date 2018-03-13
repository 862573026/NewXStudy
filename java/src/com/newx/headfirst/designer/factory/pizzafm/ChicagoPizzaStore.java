package com.newx.headfirst.designer.factory.pizzafm;

import com.newx.headfirst.designer.factory.FactoryConstant;

/**
 * Created by xuzhijian on 2018/2/11 0011.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (item.equals(FactoryConstant.CHEESE)) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals(FactoryConstant.VEGGIE)) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals(FactoryConstant.CLAM)) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals(FactoryConstant.PEPPERONI)) {
            return new ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
