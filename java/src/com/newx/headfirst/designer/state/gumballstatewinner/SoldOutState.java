package com.newx.headfirst.designer.state.gumballstatewinner;

import com.newx.headfirst.designer.state.Constant;

public class SoldOutState implements State {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println(Constant.STATE_INSERT_QUARTER_SOLD_OUT);
    }

    public void ejectQuarter() {
        System.out.println(Constant.STATE_EJECT_WHEN_SOLD_OUT);
    }

    public void turnCrank() {
        System.out.println(Constant.STATE_TURN_CRANK_SOLD_OUT);
    }

    public void dispense() {
        System.out.println(Constant.STATE_DISPENSE_SOLD_OUT);
    }

    public String toString() {
        return Constant.STATE_SOLD_OUT;
    }
}
