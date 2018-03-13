package com.newx.headfirst.designer.proxy.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by xuzhijian on 2018/3/2 0002.
 * 看自己的Bean
 */
public class OwnerInvocationHandler implements InvocationHandler {

    private PersonBean mPerson;

    public OwnerInvocationHandler(PersonBean person) {
        mPerson = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {

        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(mPerson, args);
            } else if (method.getName().equals("setHotOrNotRating")) {
                throw new IllegalAccessException("不能给自己打分"); //不能给自己打分
            } else if (method.getName().startsWith("set")) {
                return method.invoke(mPerson, args); //能给自己设置
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }
}
