package com.newx.headfirst.designer.singleton;

/**
 * Created by xuzhijian on 2018/2/12 0012.
 */
public class Singleton {
    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }
}
