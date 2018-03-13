package com.newx.jvm.ep3;

/**
 * Created by xuzhijian on 2018/3/5 0005.
 * VM args : -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:
 *           -HandlePromotionFailure=false(JDK6后不识别)
 *             -> 改为只要老年代的连续空间大于新生代对象总大小或者历次晋升的平均大小就会MinorGC
 *  空间分配担保
 *             -> 检查老年代的连续空间大于新生代对象总大小，来保证MinorGC安全
 *
 */
public class testHandlePromotion {

    private static final int _1MB = 1024 * 1024;

    public static void testHandlePromotion(){
        byte[] allocation1, allocation2, allocation3, allocation4, allocation5, allocation6, allocation7;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation1 = null;
        allocation4 = new byte[2 * _1MB];
        allocation5 = new byte[2 * _1MB];
        allocation6 = new byte[2 * _1MB];
        allocation4 = null;
        allocation5 = null;
        allocation6 = null;
        allocation7 = new byte[2 * _1MB];
    }

    public static void main(String[] args) {
        testHandlePromotion();
    }
}
