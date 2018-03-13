package com.newx.jvm.ep3;

/**
 * Created by xuzhijian on 2018/3/5 0005.
 * VM args : -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 *           -XX:PretenureSizeThreshold=3145728 (直接进入老年代的阈值)
 */
public class testPretenureSizeThreshold {
    private static final int _1MB = 1024 * 1024;

    public static void testPretenureSizeThreshold(){
        byte[] allocation;
        allocation = new byte[9 * _1MB];
//        allocation = new byte[1 * _1MB];//看看区别
    }

    public static void main(String[] args) {
        testPretenureSizeThreshold();
    }
}
