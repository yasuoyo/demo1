package com.example.demo1.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: demo1
 * @description:
 * @author: Zhaoqiming
 * @create: 2019-02-11 11:13
 **/
/*
 * 取球问题：
 * 从n个球中取出m个有多少种取法？
 */

public class Main {

    public static int i = 1;
    public static void main(String[] args) {
       // System.out.println(equ1(10, 3));

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间


    }

    static int quQiu(int n, int m) {
        if (n < m) {
            return 0;
        }
        if (n == m) {
            return 1;
        }
        if (m == 0) {
            return 1;
        }
        return quQiu(n - 1, m) + quQiu(n - 1, m - 1); // 弄一个特殊球，再分该球取不取两种情况
    }
   public int equ(int n,int m){
     if(n < m){
         return 1;
     }
     if(n == m ){
         return 1;
     }

    return equ(n-1,m);
   }
   static int equ1(int n,int m){

        if(n > m){
            if(i == 2){
                return 3;
            }
            ++i;
            System.out.println("i:"+i);
            return 1;
        }
        return 2;
    }


}


