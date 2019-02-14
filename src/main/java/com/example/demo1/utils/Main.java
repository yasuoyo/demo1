package com.example.demo1.utils;

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

    public static void main(String[] args) {
        System.out.println(quQiu(10, 3));
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









}


