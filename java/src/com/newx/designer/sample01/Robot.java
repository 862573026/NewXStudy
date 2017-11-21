package com.newx.designer.sample01;

/**
 * Created by Xuzhijian on 2017/11/20 0020.
 */
public class Robot extends Changer{


    public Robot(Transform transform) {
        super(transform);
        System.out.println("变成机器人！");
    }

    public void say(){
        System.out.println("说话！");
    }
}
