package com.newx.designer.Chapter11Bridge.sample.color;

/**
 * Created by Xuzhijian on 2017/11/20 0020.
 */
public class Red implements Color {

    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType + "红色的" + name + ".");
    }

}
