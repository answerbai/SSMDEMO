package com.xingyue.web;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/1/18.
 */
public class SSMMain {
    public static void main(String []args){
        SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd ");
        String s= "2011-07-09 ";
        try {
            Date date = formatter.parse(s);
            System.out.print(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
