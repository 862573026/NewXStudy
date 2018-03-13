package com.newx.headfirst.designer.state.gumballstate;

/**
 * Created by xuzhijian on 2018/2/24 0024.
 */
public class Test {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        System.out.println(gumballMachine);

//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        System.out.println(gumballMachine);
//
//        gumballMachine.insertQuarter();
//        gumballMachine.insertQuarter();
//        System.out.println(gumballMachine);
//
//        gumballMachine.turnCrank();
//        System.out.println(gumballMachine);
//
//        gumballMachine.turnCrank();
//        System.out.println(gumballMachine);

        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
