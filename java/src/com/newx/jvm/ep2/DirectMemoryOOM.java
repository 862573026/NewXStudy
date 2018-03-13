package com.newx.jvm.ep2;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Created by xuzhijian on 2018/3/5 0005.
 * VM args: -Xmx20M -XX:MaxDirectMemorySize=10M
 * 本地直接内存溢出
 * OOM 后 dump文件很小，程序中直接或间接使用了NIO
 */
public class DirectMemoryOOM {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(_1MB);
        }
    }
}
