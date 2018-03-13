package com.newx.headfirst.designer.templatemethod.sort;

import java.util.Arrays;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public class DuckTest {

    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 2)
        };

        System.out.println("排序前:");
        display(ducks);

        Arrays.sort(ducks); //排序必须实现 Comparable

        System.out.println("排序后:");
        display(ducks);

    }

    public static void display(Duck[] ducks) {
        for (int i = 0; i < ducks.length; i++) {
            System.out.println(ducks[i]);
        }
    }
}
