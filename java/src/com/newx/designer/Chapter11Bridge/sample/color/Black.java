package com.newx.designer.Chapter11Bridge.sample.color;

/**
 * Created by Xuzhijian on 2017/11/20 0020.
 */
public class Black implements Color {
    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType + "黑色的" + name + ".");
    }
}
