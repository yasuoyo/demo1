package com.example.demo1.config;

/**
 * @program: demo1
 * @description:
 * @author: Zhaoqiming
 * @create: 2019-02-11 11:43
 **/
public class Main {
    public static void main(String[] args)
    {
        int num = 3;
        System.out.printf("%d个盘移动步骤：%n", num);
        hanoi(num, 'A', 'B', 'C');
    }

    // 将 num 个盘从 a 塔移到 c 塔
    private static void hanoi(int num, char a, char b, char c)
    {
        if (1 == num) {
            move(a, c);
        } else {
            hanoi(num - 1, a, c, b);
            move(a, c);
            hanoi(num - 1, b, a, c);
        }
    }
    // 从 x 移到 y 上面
    private static void move(char x, char y)
    {
        System.out.printf("%c -> %c%n", x, y);
    }
}


