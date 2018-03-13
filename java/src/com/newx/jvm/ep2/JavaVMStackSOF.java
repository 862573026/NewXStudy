package com.newx.jvm.ep2;

/**
 * Created by xuzhijian on 2018/3/5 0005.
 * vm args : -Xss128k
 * <p> 不设置: Stack length:20713 设置: Stack length:991(左右)
 * 虚拟机和本地方法栈溢出(单线程:SOF) -> 说明方法栈的深度是有限的，不能一直递归
 */
public class JavaVMStackSOF {

    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();

        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("Stack length:" + oom.stackLength);
//            throw e;
            e.printStackTrace();
        }

    }
}
