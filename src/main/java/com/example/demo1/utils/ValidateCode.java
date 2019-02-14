package com.example.demo1.utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * @program: demo1
 * @description:
 * @author: Zhaoqiming
 * @create: 2019-02-11 11:56
 **/
public class ValidateCode {
    // 定义画布的宽和高
    public static final int WIDTH = 300;
    public static final int HEIGHT = 150;
    public static BufferedImage bi;
    public static Graphics g;
    public static Random r = new Random();

    // 生成min到max之间的随机数
    private static int r(int min, int max) {
        int num = r.nextInt(max - min) + min;
        return num;
    }

    // 画背景图
    public static void generateBg() {
        bi = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        g = bi.getGraphics();
        g.setColor(new Color(r(0, 255), r(0, 255), r(0, 255))); // 设置画布的背景色
        g.fillRect(0, 0, WIDTH, HEIGHT); // 填充
    }

    // 画随机数
    public static void generateNum() {
        String words = "abcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < 4; i++) {
            g.setColor(new Color(r(0, 255), r(0, 255), r(0, 255)));
            g.setFont(new Font("微软雅黑", Font.PLAIN, 70));
            char c = words.charAt(r(0, words.length()));
            g.drawString(String.valueOf(c), 40 + i * 60, r(40, HEIGHT - 40));
        }
    }

    // 画干扰线
    public static void generateLine() {
        for (int i = 0; i < 25; i++) {
            g.setColor(new Color(r(0, 255), r(0, 255), r(0, 255)));
            g.drawLine(r(0, WIDTH), r(0, HEIGHT), r(0, WIDTH), r(0, HEIGHT));
        }
    }

    // 将图片从内存输出到硬盘
    public static void save() throws IOException {
        File file = new File("d:/1.png");
        ImageIO.write(bi, "png", file);
        System.out.println("保存完成！");
    }

    // 测试
    public static void main(String[] args) throws IOException {
        generateBg();
        generateNum();
        generateLine();
        save();
    }
}



