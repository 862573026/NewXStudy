package com.newx.jvm.ep2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuzhijian on 2018/3/5 0005.
 * VM args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError -> 设置一下VM options
 * (HeapDumpOnOutOfMemoryError: 使在项目发生异常时,在项目目录下生产hprof -> 堆转储快照文件)
 * Java 堆溢出 -> OOM/memory leak
 */
public class HeapOOM {

    static class OOMObejct{}

    public static void main(String[] args) {
        List<OOMObejct> list = new ArrayList<>();

        while(true){
            list.add(new OOMObejct());
        }
    }
}
