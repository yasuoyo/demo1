package com.example.demo1.service;

import com.example.demo1.dao.MemberInfoMapper;
import com.example.demo1.dao.UserInfoMapper;
import com.example.demo1.pojo.MemberInfo;
import com.example.demo1.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: demo1
 * @description:
 * @author: Zhaoqiming
 * @create: 2019-01-31 11:31
 **/
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;
   @Autowired
   private MemberInfoMapper memberInfoMapper;
    @Override
    public User selectOne() {
        return userInfoMapper.selectByOne();
    }

    @Override
    public User selectByName(String username) {
        return userInfoMapper.selectByName(username);
    }

    @Override
    public int addInfo(String id,String username, String sex, String phone, String email, String password,String systime) {
        return  memberInfoMapper.insertinfo(id,username,sex,phone,email,password,systime);
    }

    @Override
    public List<MemberInfo> selectAll() {
        return memberInfoMapper.selectAll();
    }
}



