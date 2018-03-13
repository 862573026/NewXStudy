package com.newx.jvm.ep2;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by xuzhijian on 2018/3/5 0005.
 * VM args: -XX:PermSize=10M -XX:MaxPermSize=10M
 *
 *  方法区内存溢出
 *         -> 方法区 存储类的信息
 *         -> 借助CGLib，大量生产类，来产生
 */
public class JavaMethodAreaOOM {

    static class OOMObejct{}

    public static void main(String[] args) {
        while (true){
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(OOMObejct.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    return methodProxy.invokeSuper(objects,args);
                }
            });
            enhancer.create();
        }
    }
}
