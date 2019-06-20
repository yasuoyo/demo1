package com.example.demo1.controller;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
/**
 * @program: demo1
 * @description:
 * @author: Zhaoqiming
 * @create: 2018-10-31 17:44
 **/
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest hrequest = (HttpServletRequest)servletRequest;
        HttpServletResponseWrapper wrapper = new HttpServletResponseWrapper((HttpServletResponse) servletResponse);
        if(hrequest.getRequestURI().indexOf("/index") != -1 ||
                hrequest.getRequestURI().indexOf("/asd") != -1 ||
                hrequest.getRequestURI().indexOf("/online") != -1 ||
                hrequest.getRequestURI().indexOf("/boot") != -1 ||
                hrequest.getRequestURI().indexOf("/pages") != -1 ||
                hrequest.getRequestURI().indexOf("/login") != -1
     ) {
            filterChain.doFilter(servletRequest, servletResponse);
        }else {
            wrapper.sendRedirect("/login/hello2");
        }
    }
    @Override
    public void destroy() {
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }
}



