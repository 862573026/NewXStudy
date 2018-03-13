package com.newx.headfirst.designer.state.gumballstatewinner;

/**
 * Created by xuzhijian on 2018/2/26 0026.
 */
public class Test {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10);

        System.out.println();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);


        gumballMachine.refill(20);
        System.out.println(gumballMachine);
    }
}
