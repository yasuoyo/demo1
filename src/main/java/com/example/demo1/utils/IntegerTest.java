package com.example.demo1.utils;

/**
 * @program: demo1
 * @description:
 * @author: Zhaoqiming
 * @create: 2019-01-23 14:30
 **/
public class IntegerTest {
    public static void main(String[] args) {
//            Integer i= new Integer(200);
//            Integer j = 200;
//            System.out.print(i == j);
//            输出：false
        Integer i1 = 127;
        Integer ji = 127;
        System.out.println(i1 == ji);//输出：true
        Integer i2 = 128;
        Integer j2 = 128;
        System.out.println(i2 == j2);//输出：false
        //首次刷新时间
        String firstCronSettleTime = ReadProperties.readPropertiesFromfiles("/api.properties","firstCronSettleTime","CONF_HOME");
        System.out.println("time:"+firstCronSettleTime);
    }
}



