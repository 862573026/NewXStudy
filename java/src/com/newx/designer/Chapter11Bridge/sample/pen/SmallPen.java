package com.newx.designer.Chapter11Bridge.sample.pen;

/**
 * Created by Xuzhijian on 2017/11/20 0020.
 */
public class SmallPen extends Pen{
    @Override
    public void draw(String name) {
        String penType="小号毛笔绘制";
        this.color.bepaint(penType,name);
    }
}
