package com.newx.headfirst.designer.state;

/**
 * Created by xuzhijian on 2018/2/24 0024.
 */
public class Constant {

    //投币
    public final static String STATE_INSERT_QUARTER_REPEATEDLY = "您已投入硬币，请勿重复投入";

    public final static String STATE_INSERT_QUARTER = "您投入了一枚硬币";

    public final static String STATE_INSERT_QUARTER_SOLD_OUT = "已售罄";

    public final static String STATE_INSERT_QUARTER_SOLD = "请稍等，糖果即将提供";

    //退币
    public final static String STATE_EJECT_QUARTER = "返回硬币";

//    public final static String STATE_EJECT_QUARTER_NO_COIN_INSERTED = "您未投入硬币";

    public final static String STATE_EJECT_WHEN_SOLD_OUT = "点击了退币，但是已售罄";

    public final static String STATE_EJECT_QUARTER_ALREADY_TURNED_CRANK = "您已拉动摇杆";

    public final static String STATE_EJECT_QUARTER_NO_COIN_INSERTED = "退币失败，您未投入硬币";

    //拉杆
    public final static String STATE_TURN_CRANK_REPEATEDLY = "摇动两次摇杆不能获得两个糖果";

    public final static String STATE_TURN_CRANK_NO_COIN_INSERTED = "您未投入硬币";

    public final static String STATE_TURN_CRANK_SOLD_OUT = "已售罄";

    public final static String STATE_TURN_CRANK = "拉动摇杆";

    //分发糖果
    public final static String STATE_DISPENSE = "糖果正在出仓";

    public final static String STATE_DISPENSE_SOLD_OUT_RIGHT_WAAY = "已售罄";

    public final static String STATE_DISPENSE_NO_COIN_INSERTED = "请先投币";

    public final static String STATE_DISPENSE_SOLD_OUT = "已售罄";

    //大赢家
    public final static String STATE_WINNER_INSERT_COIN = "请稍等，糖果正在出库";

    public final static String STATE_WINNER_EJECT_COIN = "请稍等，糖果正在出库";

    public final static String STATE_WINNER_TURN_CRANK = "摇动两次摇杆不能获得多颗糖果";

    public final static String STATE_WINNER = "恭喜！大赢家，你获得了两颗糖果";


    //
    public final static String STATE_SOLD_OUT = "已售罄";

    public final static String STATE_WAITING_FOR_QUARTER = "请投币";

    public final static String STATE_WAITING_FOR_TURN_OF_CRANK = "请摇杆";

    public final static String STATE_DELIVERING_A_GUMBALL = "糖果正在出库";

    public final static String STATE_WINNER_TIP = "出库两颗糖果，因为你是大赢家！";

    //
    public final static String STATE_SOLDING = "稍等片刻，糖在路上";

}
