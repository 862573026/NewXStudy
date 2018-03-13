package com.newx.headfirst.designer.proxy.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by xuzhijian on 2018/3/2 0002.
 * 看其他人的bean （代理的辅助类，用于生产代理）
 */
public class NonOwnerInvocationHandler implements InvocationHandler {

    private PersonBean mPerson;

    public NonOwnerInvocationHandler(PersonBean person) {
        mPerson = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(mPerson, args);
            } else if (method.getName().equals("setHotOrNotRating")) {
                method.invoke(mPerson, args); // 能给其他人打分
            } else if (method.getName().startsWith("set")) {
                throw new IllegalAccessException("不能给他人设置属性"); //其他人的不能设置
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
