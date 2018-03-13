package com.newx.headfirst.designer.factory.pizzas;

import java.util.ArrayList;

/**
 * Created by xuzhijian on 2018/2/9 0009.
 */
public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    ArrayList toppings = new ArrayList();

    protected void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Preparing " + name);

        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
    }

    protected void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    protected void cut() {
        System.out.println("Cutting the Pizza into diagonal slices");
    }

    protected void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
