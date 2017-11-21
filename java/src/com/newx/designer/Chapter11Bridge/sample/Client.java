package com.newx.designer.Chapter11Bridge.sample;

import com.designer.Chapter11Bridge.sample.color.Color;
import com.designer.Chapter11Bridge.sample.pen.Pen;

/**
 * Created by Xuzhijian on 2017/11/20 0020.
 */
public class Client {

    public static void main(String args[]){
        Color color;
        Pen pen;

        color = (Color) XMLUtilPen.getBean("color");
        pen = (Pen) XMLUtilPen.getBean("pen");

        pen.setColor(color);
        pen.draw("鲜花");

    }
}
