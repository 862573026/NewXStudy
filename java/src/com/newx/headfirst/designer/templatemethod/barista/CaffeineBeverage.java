package com.newx.headfirst.designer.templatemethod.barista;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public abstract class CaffeineBeverage {

    public final void prepareRecipe() { //Recipe 烹饪法
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("烧水");
    }

    public void pourInCup() {
        System.out.println("导入杯中");
    }
}
