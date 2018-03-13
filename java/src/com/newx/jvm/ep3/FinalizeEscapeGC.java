package com.newx.jvm.ep3;

/**
 * Created by xuzhijian on 2018/3/5 0005.
 * 此代码演示了两点：
 * 1.对象可以在被GC时自我拯救。
 * 2.这种自救的机会只有一次，因为一个对象的finalize()方法最多只会被系统自动调用一次
 */
public class FinalizeEscapeGC {

    public static FinalizeEscapeGC SAVE_HOOK = null;

    public void isAlive(){
        System.out.println("是的，我还活着！");
    }


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize方法执行...");
        FinalizeEscapeGC.SAVE_HOOK = this; //在finalize，与引用链上任意一个对象建立联系
    }

    public static void main(String[] args) throws Exception {
        SAVE_HOOK = new FinalizeEscapeGC();

        // 对象第一次成功自救
        SAVE_HOOK = null; //置为null，请求GC
        System.gc();

        // 因为Finalizer方法优先级很低，暂停0.5秒，以等待它
        Thread.sleep(500);
        if(SAVE_HOOK != null){
            SAVE_HOOK.isAlive();
        }else {
            System.out.println("我被回收了..."); //没有SAVE_HOOK了
        }

        // 下面这段代码与上面的完全相同，但是这次自救却失败了
        SAVE_HOOK = null;
        System.gc();
        // 因为Finalizer方法优先级很低，暂停0.5秒，以等待它
        Thread.sleep(500);
        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        } else {
            System.out.println("我被回收了...");;
        }
    }
}
