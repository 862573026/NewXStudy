package com.newx.headfirst.designer.proxy.gumball;

import java.rmi.Naming;

/**
 * Created by xuzhijian on 2018/2/28 0028.
 */
public class Test {

    public static void main(String[] args) {

        String str = "{\"gdxm\":\"E064.87.00\",\"zjzh\":\"MC601214\",\"yyb_ip\":\"192.168.24.26\",\"client_ip\":\"101.71.41.233\",\"lg_account\":\"MC601214\",\"sslsvr\":\"0\",\"cmd\":\"cmd_generic_dt\",\"ret_msg\":\"请求成功   \",\"req_time\":\"109\",\"list_Columns\":\"9\",\"extend_return\":{\"clientver\":\"G037.08.55.1.32\",\"imsi\":\"310270000000000\",\"zjzh\":\"MC601214\",\"retcode\":\"1\",\"cflag\":\"2\",\"cmd\":\"hk_cx_drzz\",\"ND\":\"1.0\",\"c_support\":\"000000010001\",\"client\":\"mobile\",\"mobileuser\":\"15705817032\",\"mobile\":\"client\"},\"head\":[{\"col_dec\":\"0\",\"col_width\":\"5\",\"col_align\":\"0\",\"col_type\":\"13287\",\"col_caption\":\"序号\",\"col_ishide\":\"1\",\"col_name\":\"D_999\",\"col_dtype\":\"12288\"},{\"col_dec\":\"\",\"col_width\":\"30\",\"col_align\":\"64\",\"col_type\":\"10295\",\"col_caption\":\"银行名称\",\"col_ishide\":\"0\",\"col_name\":\"D_2103\",\"col_dtype\":\"8192\"},{\"col_dec\":\"\",\"col_width\":\"18\",\"col_align\":\"64\",\"col_type\":\"10298\",\"col_caption\":\"银行账户号码\",\"col_ishide\":\"0\",\"col_name\":\"D_2106\",\"col_dtype\":\"8192\"},{\"col_dec\":\"\",\"col_width\":\"18\",\"col_align\":\"64\",\"col_type\":\"10332\",\"col_caption\":\"操作时间\",\"col_ishide\":\"0\",\"col_name\":\"D_2140\",\"col_dtype\":\"8192\"},{\"col_dec\":\"\",\"col_width\":\"20\",\"col_align\":\"64\",\"col_type\":\"10327\",\"col_caption\":\"币种\",\"col_ishide\":\"0\",\"col_name\":\"D_2135\",\"col_dtype\":\"8192\"},{\"col_dec\":\"\",\"col_width\":\"20\",\"col_align\":\"64\",\"col_type\":\"12023\",\"col_caption\":\"操作\",\"col_ishide\":\"0\",\"col_name\":\"D_3831\",\"col_dtype\":\"8192\"},{\"col_dec\":\"\",\"col_width\":\"20\",\"col_align\":\"64\",\"col_type\":\"11208\",\"col_caption\":\"金额\",\"col_ishide\":\"0\",\"col_name\":\"D_3016\",\"col_dtype\":\"8192\"},{\"col_dec\":\"\",\"col_width\":\"10\",\"col_align\":\"64\",\"col_type\":\"11138\",\"col_caption\":\"办理情况\",\"col_ishide\":\"0\",\"col_name\":\"D_2946\",\"col_dtype\":\"8192\"},{\"col_dec\":\"\",\"col_width\":\"244\",\"col_align\":\"0\",\"col_type\":\"10297\",\"col_caption\":\"备注\",\"col_ishide\":\"0\",\"col_name\":\"D_2105\",\"col_dtype\":\"8192\"}],\"option\":\"0\",\"list\":[{\"item_Index\":\"0\",\"item\":{\"D_2105\":\"666\",\"D_3016\":\"1.0\",\"D_3831_cap\":\"操作\",\"D_2140_cap\":\"操作时间\",\"D_2106\":\"8615064394\",\"D_999\":\"0\",\"D_2103_cap\":\"银行名称\",\"D_999_cap\":\"序号\",\"D_2135\":\"美元\",\"D_2105_cap\":\"备注\",\"D_2106_cap\":\"银行账户号码\",\"D_2135_cap\":\"币种\",\"D_3016_cap\":\"金额\",\"D_2946_cap\":\"办理情况\",\"D_2946\":\"待报\",\"D_2140\":\"20180228094018\",\"D_3831\":\"资金转出\"}},{\"item_Index\":\"1\",\"item\":{\"D_2105\":\"Withdraw\",\"D_3016\":\"1.0\",\"D_3831_cap\":\"操作\",\"D_2140_cap\":\"操作时间\",\"D_2106\":\"8615064394\",\"D_999\":\"0\",\"D_2103_cap\":\"银行名称\",\"D_999_cap\":\"序号\",\"D_2135\":\"美元\",\"D_2105_cap\":\"备注\",\"D_2106_cap\":\"银行账户号码\",\"D_2135_cap\":\"币种\",\"D_3016_cap\":\"金额\",\"D_2946_cap\":\"办理情况\",\"D_2946\":\"待报\",\"D_2140\":\"20180228094039\",\"D_3831\":\"资金转入\"}},{\"item_Index\":\"2\",\"item\":{\"D_2105_cap\":\"备注\",\"D_2946_cap\":\"办理情况\",\"D_999\":\"0\",\"D_2946\":\"待报\",\"D_2103_cap\":\"银行名称\",\"D_999_cap\":\"序号\",\"D_2135\":\"港币\",\"D_3016\":\"0.0\",\"D_3016_cap\":\"金额\",\"D_2106_cap\":\"银行账户号码\",\"D_2135_cap\":\"币种\",\"D_3831_cap\":\"操作\",\"D_2140\":\"20180228102702\",\"D_2140_cap\":\"操作时间\",\"D_2106\":\"5721909467\",\"D_3831\":\"资金转出\"}},{\"item_Index\":\"3\",\"item\":{\"D_2105_cap\":\"备注\",\"D_2946_cap\":\"办理情况\",\"D_999\":\"0\",\"D_2946\":\"待报\",\"D_2103_cap\":\"银行名称\",\"D_999_cap\":\"序号\",\"D_2135\":\"港币\",\"D_3016\":\"0.0\",\"D_3016_cap\":\"金额\",\"D_2106_cap\":\"银行账户号码\",\"D_2135_cap\":\"币种\",\"D_3831_cap\":\"操作\",\"D_2140\":\"20180228102718\",\"D_2140_cap\":\"操作时间\",\"D_2106\":\"5721909467\",\"D_3831\":\"资金转出\"}}],\"mobileuserid\":\"15705817032\",\"head_Columns\":\"9\",\"lg_account_type\":\"0\",\"extend\":\"client*mobile|mobile*client|mobileuser*15705817032|imei*|c_support*000000010001|imsi*310270000000000|clientver*G037.08.55.1.32||svn*|ptgp_sptggt*|extend_mobile*|cflag*2||zjzh*MC601214|jzrq*|qsrq*|cmd*hk_cx_drzz|\",\"list_Rows\":\"4\",\"qsid\":\"90016\",\"ret_code\":\"0\",\"session_id\":\"145\",\"yyb_port\":\"9002\"}";


        GumballMachineRemote gumballMachine = null;

        int count;

        if(args.length < 2){
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);

            gumballMachine =
                    new GumballMachine(args[0], count);
            Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
