package com.newx.headfirst.designer.templatemethod.sort;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public class Duck implements Comparable {
    public String name;
    public int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " 质量 " + weight;
    }


    @Override
    public int compareTo(Object o) {
        Duck otherDuck = (Duck) o;
        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else {
            return 1;
        }
    }
}
