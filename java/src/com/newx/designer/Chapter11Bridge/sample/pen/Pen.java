package com.newx.designer.Chapter11Bridge.sample.pen;


import com.newx.designer.Chapter11Bridge.sample.color.Color;

/**
 * Created by Xuzhijian on 2017/11/20 0020.
 */
public abstract class Pen {
    protected Color color;
    public void setColor(Color color){
        this.color = color;
    }

    public abstract void draw(String name);
}
