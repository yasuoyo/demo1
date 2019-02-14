package com.example.demo1.controller;

import com.alibaba.fastjson.JSONObject;

import com.example.demo1.pojo.MemberInfo;

import com.example.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @program: demo1
 * @description:
 * @author: Zhaoqiming
 * @create: 2019-02-13 13:34
 **/
@Controller
@RequestMapping("/pages")
public class IndexController {
    @Autowired
    private UserService service;


    @RequestMapping("/list")
    public String showlist(){
        return "/pages/member/list";
    }

    @RequestMapping("/del")
    public String showdel(){
        return "/pages/member/del";
    }

    @RequestMapping("/addInput")
    public String showaddInput(){
        return "/pages/member/addInput";
    }

    @RequestMapping("/welcome")
    public String showwelcome(){
        return "/pages/welcome";
    }

    @RequestMapping("/loginOut" )
    public String loginout(HttpSession session){
        session.invalidate();
        return "login";
    }
    @RequestMapping("/edit")
    public String edit(){
        return "/pages/member/edit";
    }
    @RequestMapping("/orderlist")
    public String   orderlist(){
        return "/pages/order/list";
    }
    @RequestMapping("/add")
    public String   add(){
        return "/pages/member/add";
    }

    @RequestMapping("/addinfo")
    public String  addinfo(String username,String sex,String phone,String email,String pass){
        System.out.println("名字："+username);
        System.out.println("密码："+pass);
        int line =service.addInfo(username,sex,phone,email,pass);
        if (line>0){
            return "/pages/member/list";
        }
        return "error";
    }
    @RequestMapping("/password")
    public String   password(){
        return "/pages/member/password";
    }

}



