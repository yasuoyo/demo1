package com.example.demo1.config;

import java.util.*;

/**
 * @program: demo1
 * @description:
 * @author: Zhaoqiming
 * @create: 2019-02-14 13:40
 **/
public class Demo {
    private boolean IS_DEMO = false;

    private static final int IS_key = 10000;

    public void IS() {
        IS_DEMO = true;

        if (!IS_DEMO) {

            System.out.println("执行1");


        }
        if (IS_DEMO) {

            System.out.println("执行2");
            for (int i = 0; i <= 5; i++) {
                int a = UUID.randomUUID().hashCode();
                if (a < 0) {//有可能是负数
                    a = -a;
                }
                int b = UUID.randomUUID().toString().hashCode();
                if (b < 0) {//有可能是负数
                    b = -b;
                }
                System.out.println("输出A为" + a);
                System.out.println("输出B为" + b);

                long c = UUID.randomUUID().timestamp();
                System.out.println("输出C为" + c);
            }
        }

    }

    public static void main(String[] args) {

//        if (IS_key>100){
//
//
//            Demo demo = new Demo();
//
//            demo.IS();
//
//        }
//         for(int i=1; i<=3;i++) {
//             //定义人名数组
//             String[] name = {"陈阳", "陈向凯", "唐玉东", "王彬", "李聪"}; //随机生成数组下标、
//             int num = (int) (Math.random() * 1000);
//
//             //对生成的随机数进行判断，如果小于数组下标，就跳出循环
//             while (num > name.length - 1) {
//                 if (num <= name.length - 1) {
//                     break;
//                 }
//                 num = (int) (Math.random() * 1000);
//
//             } //将数组下标设置成随机数，就可以实现人名的随机抽取
//             System.out.println("被抽到的同学是：" + name[num]);
//         }

        Set set = new HashSet();

        set.add("耐克");
        set.add("安踏");
        set.add("李宁");
        set.add("安踏");

        System.out.println("set为" + set);

        List<String> list = new ArrayList<>();
        list.add("耐克");
        list.add("李宁");
        list.add("安踏");
        list.add("安踏");
        System.out.println("list为" + list);
        Map<Set, List<String>> map = new HashMap<>();
        map.put(set, list);
        System.out.println("map为" + map);


    }
}



