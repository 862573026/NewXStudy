package com.newx.jvm.ep3;

/**
 * Created by xuzhijian on 2018/3/5 0005.
 * VM args:
 *   -XX:+PrintGC : 输出GC日志  -> Full/Major GC:老年代的GC, Minor GC:新生代的GC; Major比Minor慢10倍以上。
 *   -XX:+PrintGCDetails :输出详细的GC日志 -> 与PrintGC合用，仍是输出详细的GC日志
 *   -XX:+PrintGCTimeStamps : 输出GC的时间戳(基准时间)  -> 时间戳需要与上面任意组合
 *   -XX:+PrintGCDateStamps : 输出GC的时间戳(日期)
 * 引用计数法 -> 弃用，因为难以解决对象间相互循环引用的问题
 * 原理：引用，计数+1；引用失效，计数-1
 */
public class ReferenceCountingGC {

    public Object instance = null;
    private static final int _1MB = 1024 * 1024;

    /**
     * 这个成员属性的唯一意义就是占点内存，以便在能在GC日志中看清楚是否有回收过
     */
    private byte[] bigSize = new byte[2 * _1MB];

    public static void testGC(){
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();

        objA.instance = objB;
        objB.instance = objA;

        // 假设在这行发生GC，objA和objB是否能被回收？
        //             ->2018-03-05T14:29:31.303+0800: [GC (System.gc())  8034K->4744K(123904K), 0.0078526 secs] -> 变小，被回收，说明技术算法已经弃用。
        //               2018-03-05T14:29:31.311+0800: [Full GC (System.gc())  4744K->4698K(123904K), 0.0164814 secs]
        //
        System.gc();
    }

    public static void main(String[] args) {
        testGC();
    }
}
