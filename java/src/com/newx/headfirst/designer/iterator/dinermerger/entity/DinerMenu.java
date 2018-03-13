package com.newx.headfirst.designer.iterator.dinermerger.entity;

import com.newx.headfirst.designer.iterator.dinermerger.DinerMenuIterator;
import com.newx.headfirst.designer.iterator.dinermerger.Iterator;


/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public class DinerMenu implements Menu {

    public static final int MAX_ITEMS = 6;
    public int numberOfItems = 0;
    public MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("素食 BLT",
                "(Fakin') 腌肉、 生菜、西红柿、全麦", true, 2.99);
        addItem("BLT",
                "腌肉生菜、西红柿、全麦", false, 2.99);
        addItem("例汤",
                "例汤，土豆汤", false, 3.29);
        addItem("热狗",
                "热狗、酸菜、调料、洋葱、顶级奶酪",
                false, 3.05);
        addItem("熟的蔬菜和大米",
                "熟的蔬菜和大米", true, 3.99);
        addItem("意大利面",
                "Marinara Sauce意大利面和一块面包",
                true, 3.89);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("菜单已满，不能再添加");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
