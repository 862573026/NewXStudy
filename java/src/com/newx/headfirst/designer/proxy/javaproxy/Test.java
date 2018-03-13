package com.newx.headfirst.designer.proxy.javaproxy;

import java.lang.reflect.Proxy;
import java.util.Hashtable;

/**
 * Created by xuzhijian on 2018/3/2 0002.
 */
public class Test {

    private Hashtable datingDB = new Hashtable(); //模拟数据库

    public static void main(String[] args) {
        Test test = new Test();
        test.drive();
    }

    public Test() {
        initializeDatabase();
    }


    private void drive() {
        PersonBean joe = getPersonFromDataBase("Joe Javabean");
        PersonBean ownerProxy = getOwnerProxy(joe); //自己的bean
        System.out.println("名字是：" + ownerProxy.getName() + " 兴趣是：" + ownerProxy.getInterests());
        ownerProxy.setInterests("bowling,Go"); //自己的可修改兴趣
        System.out.println("名字是：" + ownerProxy.getName() + " 兴趣是：" + ownerProxy.getInterests());

        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("不能给自己打分");
        }

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        try {
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e) {
            System.out.println("不能给他人设置兴趣");
        }

        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());

    }


    private void initializeDatabase() {
        PersonBean joe = new PersonBeanImpl();
        joe.setName("Joe Javabean");
        joe.setInterests("cars, computers, music");
        joe.setHotOrNotRating(7);
        datingDB.put(joe.getName(), joe);

        PersonBean kelly = new PersonBeanImpl();
        kelly.setName("Kelly Klosure");
        kelly.setInterests("ebay, movies, music");
        kelly.setHotOrNotRating(6);
        datingDB.put(kelly.getName(), kelly);
    }

    private PersonBean getPersonFromDataBase(String name) {
        return (PersonBean) datingDB.get(name);
    }

    private PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    private PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }

}
