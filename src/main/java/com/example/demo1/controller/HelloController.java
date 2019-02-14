package com.example.demo1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;


/**
 * @program: demo1
 * @description:
 * @author: Zhaoqiming
 * @create: 2018-10-09 15:11
 **/
@Controller
@RequestMapping("/demo")
public class HelloController {

    @RequestMapping("/hello")
    public String helloHtml(HashMap<String, Object> map){
        map.put("hello", "欢迎进入HTML页面");
        return "index";
    }


}



