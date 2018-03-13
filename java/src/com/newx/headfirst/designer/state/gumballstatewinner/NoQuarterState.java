package com.newx.headfirst.designer.state.gumballstatewinner;

import com.newx.headfirst.designer.state.Constant;

public class NoQuarterState implements State {
    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println(Constant.STATE_INSERT_QUARTER);
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println(Constant.STATE_EJECT_QUARTER_NO_COIN_INSERTED);
    }

    public void turnCrank() {
        System.out.println(Constant.STATE_TURN_CRANK_NO_COIN_INSERTED);
    }

    public void dispense() {
        System.out.println(Constant.STATE_DISPENSE_NO_COIN_INSERTED);
    }

    public String toString() {
        return Constant.STATE_WAITING_FOR_QUARTER;
    }
}
