package com.newx.headfirst.designer.state.gumballstatewinner;


import com.newx.headfirst.designer.state.Constant;

/**
 * Created by xuzhijian on 2018/2/26 0026.
 */
public class WinnerState implements State {

    private GumballMachine mGumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        mGumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println(Constant.STATE_WINNER_INSERT_COIN);
    }

    @Override
    public void ejectQuarter() {
        System.out.println(Constant.STATE_WINNER_EJECT_COIN);
    }

    @Override
    public void turnCrank() {
        System.out.println(Constant.STATE_WINNER_TURN_CRANK);
    }

    @Override
    public void dispense() {
        System.out.println(Constant.STATE_WINNER);
        mGumballMachine.releaseBall();

        if (mGumballMachine.getCount() == 0) {
            mGumballMachine.setState(mGumballMachine.getSoldOutState());
        } else {
            mGumballMachine.releaseBall();
            if (mGumballMachine.getCount() > 0) {
                mGumballMachine.setState(mGumballMachine.getNoQuarterState());
            } else {
                System.out.println(Constant.STATE_SOLD_OUT);
                mGumballMachine.setState(mGumballMachine.getSoldOutState());
            }
        }
    }

    public String toString() {
        return Constant.STATE_WINNER_TIP;
    }
}
