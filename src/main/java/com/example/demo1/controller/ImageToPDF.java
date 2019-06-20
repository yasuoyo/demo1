package com.example.demo1.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;


import com.spire.pdf.PdfDocument;
import com.spire.pdf.PdfPageBase;
import com.spire.pdf.graphics.PdfImage;


/**
 * @program: demo1
 * @description:
 * @author: Zhaoqiming
 * @create: 2019-04-17 13:52
 **/
public class ImageToPDF {
    public static void main(String[] args) {
        String fileName = "D://1.jpg";
        String pdfOutPath = "D://ImageToPDF.pdf";
        //创建文档
        PdfDocument doc = new PdfDocument();
        //添加一个页面
        PdfPageBase page = doc.getPages().add();
        //加载图片
        PdfImage image = PdfImage.fromFile(fileName);
        //绘制图片到pdf并设置其在pdf文件的位置和大小
        double widthFitRate = getImgWidth(new File(fileName)) / page.getActualBounds(true).getWidth();
        double heightFitRate = getImgHeight(new File(fileName)) / page.getActualBounds(true).getHeight();
        double fitRate = Math.max(widthFitRate, heightFitRate);
        double fitWidth = getImgWidth(new File(fileName)) / fitRate * 0.8f;
        double fitHeight = getImgHeight(new File(fileName)) / fitRate * 0.8f;
        page.getCanvas().drawImage(image, 50, 30, fitWidth, fitHeight);
        //保存并关闭
        doc.saveToFile(pdfOutPath);
        System.out.println("打印完成");
        doc.close();

    }

    public static int getImgWidth(File ImageFile) {

        InputStream is = null;
        BufferedImage src = null;
        int ret = -1;

        try {
            is = new FileInputStream(ImageFile);
            src = javax.imageio.ImageIO.read(is);
            ret = src.getWidth(null);
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }


    /**
     * @param ImageFile      * @return image height
     *                      
     */
    public static int getImgHeight(File ImageFile) {
        InputStream is = null;
        BufferedImage src = null;

        int ret = -1;

        try {
            is = new FileInputStream(ImageFile);
            src = javax.imageio.ImageIO.read(is);
            ret = src.getHeight(null);
            is.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }

}



