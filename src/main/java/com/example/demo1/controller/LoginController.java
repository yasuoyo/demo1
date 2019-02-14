package com.example.demo1.controller;

import com.example.demo1.pojo.User;
import com.example.demo1.service.UserService;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;


/**
 * @program: demo1
 * @description:
 * @author: Zhaoqiming
 * @create: 2018-10-30 14:38
 **/
@Controller
@RequestMapping("/login")
public class LoginController{

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    DefaultKaptcha defaultKaptcha;
    @Autowired
    private UserService service;

    @RequestMapping("/hello")
    public String helloHtml(){
        return "logintt";
    }

    @RequestMapping("/hello2")
    public String hello(){
        return "login";
    }

    @RequestMapping("/index")
    public String login(String username,String password,HttpServletRequest request){

        String captchaId = (String) request.getSession().getAttribute("vrifyCode");
        String parameter = request.getParameter("vrifyCode");
        System.out.println("Session  vrifyCode "+captchaId+" form vrifyCode "+parameter);
        User user=service.selectByName(username);
        String s1=user.getUserName();
        String s2=user.getPassword();
        HttpSession session = request.getSession(true);
        session.setAttribute("zxc", "zxc");
        if(s1.equals(username)&& s2.equals(password) && captchaId.equals(parameter)){
            return "index2";
        }
         return "error";
    }
    @RequestMapping("/index2")
    public String login2(String username,String password){
        User user=service.selectByName(username);
        String s1=user.getUserName();
        System.out.println("名字"+s1);
        String s2=user.getPassword();
        System.out.println("密码"+s2);
        if(s1.equals(username)&& s2.equals(password) ){
            return "index";
        }
        return "error";
    }
    @RequestMapping("/index3")
    public String loginto(String inputEmail,String inputPassword){
        String s1="yoyo@qq.com";
        String s2="123456";
        if(s1.equals(inputEmail)&&s2.equals(inputPassword)){
            return "example";
        }
        return "error2";
    }

    @RequestMapping("/table")
    public String showtable(){
     return "table";
    }

    @RequestMapping("/loginOut" )
    public String loginout(HttpSession session){
        session.invalidate();
        return "logintt";
    }


    @RequestMapping("/defaultKaptcha")
    public void defaultKaptcha(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws Exception{
        byte[] captchaChallengeAsJpeg = null;
        ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
        try {
            //生产验证码字符串并保存到session中
            String createText = defaultKaptcha.createText();
            httpServletRequest.getSession().setAttribute("vrifyCode", createText);
            //使用生产的验证码字符串返回一个BufferedImage对象并转为byte写入到byte数组中
            BufferedImage challenge = defaultKaptcha.createImage(createText);
            ImageIO.write(challenge, "jpg", jpegOutputStream);
        } catch (IllegalArgumentException e) {
            httpServletResponse.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        //定义response输出类型为image/jpeg类型，使用response输出流输出图片的byte数组
        captchaChallengeAsJpeg = jpegOutputStream.toByteArray();
        httpServletResponse.setHeader("Cache-Control", "no-store");
        httpServletResponse.setHeader("Pragma", "no-cache");
        httpServletResponse.setDateHeader("Expires", 0);
        httpServletResponse.setContentType("image/jpeg");
        ServletOutputStream responseOutputStream =
                httpServletResponse.getOutputStream();
        responseOutputStream.write(captchaChallengeAsJpeg);
        responseOutputStream.flush();
        responseOutputStream.close();
    }

    @RequestMapping("/imgvrifyControllerDefaultKaptcha")
    public ModelAndView imgvrifyControllerDefaultKaptcha(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse){
        ModelAndView andView = new ModelAndView();
        String captchaId = (String) httpServletRequest.getSession().getAttribute("vrifyCode");
        String parameter = httpServletRequest.getParameter("vrifyCode");
        System.out.println("Session  vrifyCode "+captchaId+" form vrifyCode "+parameter);

        if (!captchaId.equals(parameter)) {
            andView.addObject("info", "错误的验证码");
            andView.setViewName("index");
        } else {
            andView.addObject("info", "登录成功");
            andView.setViewName("logintt");
        }
        return andView;
    }
    @RequestMapping("/check" )
    public String check(){

        return "yanzheng";
    }

    @RequestMapping("/log")
    public String che(){

        return "yanzheng";
    }










}



