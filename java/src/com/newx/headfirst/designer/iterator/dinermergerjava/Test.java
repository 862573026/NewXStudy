package com.newx.headfirst.designer.iterator.dinermergerjava;


import com.newx.headfirst.designer.iterator.dinermergerjava.entity.CafeMenu;
import com.newx.headfirst.designer.iterator.dinermergerjava.entity.DinerMenu;
import com.newx.headfirst.designer.iterator.dinermergerjava.entity.PancakeHouseMenu;
import com.newx.headfirst.designer.iterator.dinermergerjava.entity.Waitress;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public class Test {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}
