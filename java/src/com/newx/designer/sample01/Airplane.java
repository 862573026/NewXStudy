package com.newx.designer.sample01;

/**
 * Created by Xuzhijian on 2017/11/20 0020.
 */
public class Airplane extends Changer{

    public Airplane(Transform transform) {
        super(transform);
        System.out.println("变成飞机！");
    }

    public void fly(){
        System.out.println("在天空飞翔！");
    }
}
