package com.newx.headfirst.designer.iterator.dinermergerjava.entity;


import com.newx.headfirst.designer.iterator.dinermergerjava.PancakeHouseMenuIterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public class PancakeHouseMenu implements Menu {

    public ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("K&B's 早餐烤饼",
                "拌鸡蛋、吐司、烤饼",
                true,
                2.99);

        addItem("常规早餐烤饼",
                "熟鸡蛋、香肠、烤饼",
                false,
                2.99);

        addItem("蓝莓烤饼",
                "新鲜蓝莓做的烤饼",
                true,
                3.49);

        addItem("华夫饼干",
                "华夫饼干，可选草莓味和蓝莓味",
                true,
                3.59);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }

    public String toString() {
        return "煎饼屋的菜单";
    }

    // other menu methods here
}
