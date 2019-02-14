package com.example.demo1.controller;

import com.example.demo1.pojo.BatchReq;
import com.example.demo1.service.BatchReqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: demo1
 * @description:
 * @author: Zhaoqiming
 * @create: 2018-10-24 14:31
 **/
@Controller
@RequestMapping("/show")
public class ShowController {
    @Autowired
    private BatchReqService service;
    @RequestMapping("/view")
    public String show(Model model){
        List<BatchReq> list = service.selectAll();
        model.addAttribute("list", list);
        return "show";
    }






}



