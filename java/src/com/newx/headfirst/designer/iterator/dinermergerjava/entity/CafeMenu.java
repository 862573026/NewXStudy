package com.newx.headfirst.designer.iterator.dinermergerjava.entity;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by xuzhijian on 2018/2/23 0023.
 * 改造三连 1.实现Menu接口，2.丢弃getItems，3.createIterator返回迭代器(Hashtable自带有，没有的可以自己实现)
 */
public class CafeMenu implements Menu {

    public Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("汉堡和薯条",
                "圆全麦面包,生菜,西红柿,薯条",
                true, 3.99);
        addItem("例汤",
                "例汤，土豆汤",
                false, 3.69);
        addItem("玉米煎饼",
                "大份玉米煎饼,豆子,辣调味汁,鳄梨色拉酱",
                true, 4.29);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Hashtable getItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator(); //本身具有迭代器 Hashtable的760行的values取得值，调用 ValueCollection
    }
}
