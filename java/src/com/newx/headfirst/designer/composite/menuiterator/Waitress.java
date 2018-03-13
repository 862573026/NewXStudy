package com.newx.headfirst.designer.composite.menuiterator;

import java.util.Iterator;

/**
 * Created by xuzhijian on 2018/2/23 0023.
 */
public class Waitress {

    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();//递归调用
        System.out.println("\n素食菜单\n");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();

            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {//菜单会进入
//                System.err.println(e);
            }

        }
    }
}
