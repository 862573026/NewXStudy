package com.newx.headfirst.designer.templatemethod.barista.hook;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public abstract class CaffeineBeverageWithHook {

    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("烧水");
    }

    public void pourInCup() {
        System.out.println("倒入杯中");
    }

    public boolean customerWantsCondiments() {
        return true;
    }
}
