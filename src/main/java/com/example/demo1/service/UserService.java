package com.example.demo1.service;

import com.example.demo1.pojo.MemberInfo;
import com.example.demo1.pojo.User;

import java.util.List;

public interface UserService {
    User selectOne();

    User selectByName(String username);

    int addInfo(String username,String sex,String phone,String email,String password);

    List<MemberInfo> selectAll();

}
