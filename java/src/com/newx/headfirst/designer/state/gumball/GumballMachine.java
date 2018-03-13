package com.newx.headfirst.designer.state.gumball;

import com.newx.headfirst.designer.state.Constant;

/**
 * Created by xuzhijian on 2018/2/24 0024.
 */
public class GumballMachine {

    //状态
    final static int SOLD_OUT = 0; //售罄
    final static int NO_QUARTER = 1; //等待投币
    final static int HAS_QUARTER = 2; //已投币
    final static int SOLD = 3; //售出糖果

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println(Constant.STATE_INSERT_QUARTER_REPEATEDLY);
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println(Constant.STATE_INSERT_QUARTER);
        } else if (state == SOLD_OUT) {
            System.out.println(Constant.STATE_INSERT_QUARTER_SOLD_OUT);
        } else if (state == SOLD) {
            System.out.println(Constant.STATE_INSERT_QUARTER_SOLD);
        }
    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println(Constant.STATE_EJECT_QUARTER);
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println(Constant.STATE_EJECT_QUARTER_NO_COIN_INSERTED);
        } else if (state == SOLD) {
            System.out.println(Constant.STATE_EJECT_QUARTER_ALREADY_TURNED_CRANK);
        } else if (state == SOLD_OUT) {
            System.out.println(Constant.STATE_EJECT_QUARTER_NO_COIN_INSERTED);
        }
    }


    public void turnCrank() {
        if (state == SOLD) {
            System.out.println(Constant.STATE_TURN_CRANK_REPEATEDLY);
        } else if (state == NO_QUARTER) {
            System.out.println(Constant.STATE_TURN_CRANK_NO_COIN_INSERTED);
        } else if (state == SOLD_OUT) {
            System.out.println(Constant.STATE_TURN_CRANK_SOLD_OUT);
        } else if (state == HAS_QUARTER) {
            System.out.println(Constant.STATE_TURN_CRANK);
            state = SOLD;
            dispense();
        }
    }

    public void dispense() {
        if (state == SOLD) {
            System.out.println(Constant.STATE_DISPENSE);
            count = count - 1;
            if (count == 0) {
                System.out.println(Constant.STATE_DISPENSE_SOLD_OUT_RIGHT_WAAY);
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println(Constant.STATE_DISPENSE_NO_COIN_INSERTED);
        } else if (state == SOLD_OUT) {
            System.out.println(Constant.STATE_DISPENSE_SOLD_OUT);
        } else if (state == HAS_QUARTER) {
            System.out.println(Constant.STATE_DISPENSE_SOLD_OUT);
        }
    }

    public void refill(int numGumBalls) {
        this.count = numGumBalls;
        state = NO_QUARTER;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nMachine is ");
        if (state == SOLD_OUT) {
            result.append("sold out");
        } else if (state == NO_QUARTER) {
            result.append("waiting for quarter");
        } else if (state == HAS_QUARTER) {
            result.append("waiting for turn of crank");
        } else if (state == SOLD) {
            result.append("delivering a gumball");
        }
        result.append("\n");
        return result.toString();
    }

}
