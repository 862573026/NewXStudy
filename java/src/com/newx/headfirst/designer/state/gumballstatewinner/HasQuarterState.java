package com.newx.headfirst.designer.state.gumballstatewinner;

import com.newx.headfirst.designer.state.Constant;

import java.util.Random;

public class HasQuarterState implements State {
    private Random randomWinner = new Random(System.currentTimeMillis());
    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println(Constant.STATE_INSERT_QUARTER_REPEATEDLY);
    }

    public void ejectQuarter() {
        System.out.println(Constant.STATE_EJECT_QUARTER);
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println(Constant.STATE_TURN_CRANK);
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    public void dispense() {
        System.out.println(Constant.STATE_DISPENSE_SOLD_OUT);
    }

    public String toString() {
        return Constant.STATE_WAITING_FOR_TURN_OF_CRANK;
    }
}
