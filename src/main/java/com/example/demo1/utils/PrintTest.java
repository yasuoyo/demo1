package com.example.demo1.utils;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


import java.util.Date;

/**
 * @program: demo1
 * @description:
 * @author: Zhaoqiming
 * @create: 2019-01-02 10:13
 **/
//@Component
public class PrintTest {


    String firstCronSettleTime = ReadProperties.readPropertiesFromfiles("/api.properties","firstCronSettleTime","CONF_HOME");

    @Scheduled(cron="1 * * * * ?")
    public  void cron1() throws Exception{
        System.out.println("定时任务1开始执行时间"+new Date(System.currentTimeMillis()));
    }
//    @Scheduled(cron="1 * * * * ?")
//    public  void cron() throws Exception{
//        Thread.sleep(5000);
//        System.out.println("定时任务开始执行时间"+new Date(System.currentTimeMillis()));
//    }
//    @Scheduled(fixedRate = 1000*1)
//    public  void corn2() throws Exception{
//        System.out.println("定时任务2开始执行时间"+new Date(System.currentTimeMillis()));
//    }
//    @Scheduled(fixedDelay = 1000*1)
//    public  void cron3() throws Exception{
//        System.out.println("定时任务3"+new Date(System.currentTimeMillis()));
//    }
//


}



