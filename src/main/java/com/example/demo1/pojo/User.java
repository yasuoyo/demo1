package com.example.demo1.pojo;

/**
 * @program: demo1
 * @description:
 * @author: Zhaoqiming
 * @create: 2019-01-31 11:23
 **/
public class User {
    private String UserName;
    private String Password;
    private String UserCode;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUserCode() {
        return UserCode;
    }

    public void setUserCode(String userCode) {
        UserCode = userCode;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserName='" + UserName + '\'' +
                ", Password='" + Password + '\'' +
                ", UserCode='" + UserCode + '\'' +
                '}';
    }
}



