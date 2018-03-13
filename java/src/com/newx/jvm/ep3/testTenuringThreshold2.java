package com.newx.jvm.ep3;

/**
 * Created by xuzhijian on 2018/3/5 0005.
 * VM args：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=15
 * -XX:+PrintTenuringDistribution
 * 动态对象年龄判定(相同大于一半)
 */
public class testTenuringThreshold2 {
    private static final int _1MB = 1024 * 1024;

    private static void testTenuringThreshold2() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[_1MB / 4];   // allocation1+allocation2大于survivo空间一半
        allocation2 = new byte[_1MB / 4];
        allocation3 = new byte[4 * _1MB];
        allocation4 = new byte[4 * _1MB];
        allocation4 = null;
        allocation4 = new byte[4 * _1MB];

    }

    public static void main(String[] args) {
        testTenuringThreshold2();
    }
}
