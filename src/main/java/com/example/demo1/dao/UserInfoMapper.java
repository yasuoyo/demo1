package com.example.demo1.dao;

import com.example.demo1.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoMapper {
    User selectByOne();

    User selectByName(String username);
}
