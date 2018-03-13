package com.newx.jvm.ep2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuzhijian on 2018/3/5 0005.
 * VM args : -XX:PermSize=10M -XX:MaxPermSize=10M
 * <p>
 *运行时常量池溢出 1.6及之前会OOM:PermGen space ,1.7以后开始去永久代
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {
        // ------------------------------ part1 start ------------------------------
//        //使用List保持着常量池的引用，避免Full GC回收常量池的行为
//        List<String> list = new ArrayList<>();
//        // 10MB 的 PermSize 在integer 范围内足够产生OOM了
//        int i = 0;
//        while (true){
//            list.add(String.valueOf(i++).intern());
//        }
        // ------------------------------ part1 end ------------------------------

        // ------------------------------ part2 start ------------------------------
        //移除 -XX:PermSize=10M -XX:MaxPermSize=10M
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString(); // -> 出现过
        System.out.println(str2.intern() == str2);
        // ------------------------------ part2 start ------------------------------

    }

}
