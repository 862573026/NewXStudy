package com.newx.designer.Chapter10Adapter.sample01;

/**
 * Created by Xuzhijian on 2017/11/20 0020.
 */
public class Client {
    public static void main(String[] args){
        Robot robot = (Robot) XMLUtil.getBean();

        robot.cry();
        robot.move();

        Robot dog = new DogAdapter();
        dog.cry();
        dog.move();
    }
}
