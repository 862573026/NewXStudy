package com.newx.headfirst.designer.iterator.dinermerger.entity;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public class MenuItem {

    public String name;
    public String description;
    public boolean vegetarian;
    public double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String toString() {
        return (name + ", $" + price + "\n   " + description);
    }
}
