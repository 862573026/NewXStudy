package com.newx.jvm.ep2;

/**
 * Created by xuzhijian on 2018/3/5 0005.
 * VM args : -Xss2M
 * 虚拟机和本地方法栈溢出 (多线程-> OOM)
 * 解决方法：如果不能减少线程数/更换更高位的虚拟机，可以考虑减少最大堆容量和栈容量来换取更多线程运行的空间。
 *  -> 谨慎运行，会卡死(windows机器的java线程映射到操作系统的内核线程上)
 */
public class JavaVMStackOOM {

    private void dontStop() {
        while (true) {
        }
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }

}
