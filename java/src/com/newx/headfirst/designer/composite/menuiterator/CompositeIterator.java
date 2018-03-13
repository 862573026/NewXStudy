package com.newx.headfirst.designer.composite.menuiterator;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by xuzhijian on 2018/2/23 0023.
 * 组合迭代器 -> 遍历组件内的菜单，并且保证所有菜单以及子菜单都包括进来
 */
public class CompositeIterator implements Iterator {

    public Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator); //构造加入迭代器
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) { //检查堆栈是否被清空
            return false;
        } else {
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator iterator = (Iterator) stack.peek(); //获取栈顶元素
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu) {
                stack.push(component.createIterator()); //如果是菜单，进栈，实现树形结构
            }
            return component;
        } else {
            return null;
        }
    }

    @Override
    public void remove() {

    }
}
