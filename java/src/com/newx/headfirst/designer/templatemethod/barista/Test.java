package com.newx.headfirst.designer.templatemethod.barista;

import com.newx.headfirst.designer.templatemethod.barista.hook.CoffeeWithHook;
import com.newx.headfirst.designer.templatemethod.barista.hook.TeaWithHook;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public class Test {

    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        tea.prepareRecipe();
        System.out.println();
        coffee.prepareRecipe();
        System.out.println();

        teaHook.prepareRecipe();
        System.out.println();
        coffeeHook.prepareRecipe();
        System.out.println();
    }
}
