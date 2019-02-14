package com.example.demo1.config;

import com.example.demo1.config.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @program: demo1
 * @description:
 * @author: Zhaoqiming
 * @create: 2018-10-31 14:21
 **/
@SpringBootConfiguration
public class MySpringMVCConfig extends WebMvcConfigurerAdapter{
//    @Autowired
//    private UserConfig userConfig;
//    @Override
//    public void addInterceptors(InterceptorRegistry registry){
//       registry.addInterceptor(userConfig).addPathPatterns("/**");
//    }
}
