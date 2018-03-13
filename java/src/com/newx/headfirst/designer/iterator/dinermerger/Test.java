package com.newx.headfirst.designer.iterator.dinermerger;

import com.newx.headfirst.designer.iterator.dinermerger.entity.DinerMenu;
import com.newx.headfirst.designer.iterator.dinermerger.entity.PancakeHouseMenu;
import com.newx.headfirst.designer.iterator.dinermerger.entity.Waitress;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public class Test {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
