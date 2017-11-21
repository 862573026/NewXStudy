package com.newx.designer.sample01;

/**
 * Created by Xuzhijian on 2017/11/20 0020.
 */
public class Client {
    public static void main(String args[]) {
        Transform camaro;
        camaro = new Car();
        camaro.move();

        System.out.println("-----------------------------");

        Airplane bumb = new Airplane(camaro);
        bumb.move();
        bumb.fly();
    }
}
