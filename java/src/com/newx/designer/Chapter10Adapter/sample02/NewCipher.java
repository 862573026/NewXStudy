package com.newx.designer.Chapter10Adapter.sample02;

/**
 * Created by Xuzhijian on 2017/11/20 0020.
 */
public class NewCipher {

    public String doEncrypt(int key,String ps)
    {
        String es="";
        for(int i=0;i<ps.length();i++)
        {
            String c=String.valueOf(ps.charAt(i)%key);
            es+=c;
        }
        return es;
    }

}
