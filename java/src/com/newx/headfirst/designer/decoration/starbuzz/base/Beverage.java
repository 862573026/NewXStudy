package com.newx.headfirst.designer.decoration.starbuzz.base;

/**
 * Created by xuzhijian on 2018/2/8 0008.
 * 饮料
 */
public abstract class Beverage {

    public static final int TALL = 1; //小杯
    public static final int GRANDE = 2; //中杯
    public static final int VENTI = 3; //大杯


    protected String description = "Unknown Beverage";


    public String getDescription() {
        return description;
    }

//    public abstract int getSize();


    public abstract double cost();
}
