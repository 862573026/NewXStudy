package com.newx.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Xuzhijian on 2017/10/31 0031.
 */
public class RegexTest {

    public static void main(String[] args){
        getStr("12313(646341)");
    }

    public static void getStr(String managers){
        Pattern pattern = Pattern.compile("(?<=\\()(.+?)(?=\\))");
        Matcher matcher = pattern.matcher(managers);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
