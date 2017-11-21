package com.newx.designer.sample01;

/**
 * Created by Xuzhijian on 2017/11/20 0020.
 */
public final class Car implements Transform {

    public Car() {
        System.out.println("变形金刚是一辆车！");
    }

    @Override
    public void move() {
        System.out.println("在陆地上移动！");
    }
}
