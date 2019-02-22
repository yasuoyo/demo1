package com.example.demo1.pojo;

import java.util.Date;

/**
 * @program: demo1
 * @description:
 * @author: Zhaoqiming
 * @create: 2019-02-13 14:48
 **/
public class MemberInfo {
    private String Id;
    private String UserName;
    private String Sex;
    private String Phone;
    private String Email;
    private String Password;
    private String SysTime;


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getSysTime() {
        return SysTime;
    }

    public void setSysTime(String sysTime) {
        SysTime = sysTime;
    }
}



