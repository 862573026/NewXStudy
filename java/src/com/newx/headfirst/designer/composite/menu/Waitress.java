package com.newx.headfirst.designer.composite.menu;

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
}
