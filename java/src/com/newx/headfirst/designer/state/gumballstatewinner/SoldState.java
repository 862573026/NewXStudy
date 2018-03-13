package com.newx.headfirst.designer.state.gumballstatewinner;

import com.newx.headfirst.designer.state.Constant;

public class SoldState implements State {
    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println(Constant.STATE_INSERT_QUARTER_SOLD);
    }

    public void ejectQuarter() {
        System.out.println(Constant.STATE_EJECT_QUARTER_ALREADY_TURNED_CRANK);
    }

    public void turnCrank() {
        System.out.println(Constant.STATE_TURN_CRANK_REPEATEDLY);
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println(Constant.STATE_DISPENSE_SOLD_OUT_RIGHT_WAAY);
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    public String toString() {
        return Constant.STATE_DISPENSE;
    }
}
