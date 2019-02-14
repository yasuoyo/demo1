package com.example.demo1.dao;

import com.example.demo1.pojo.MemberInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberInfoMapper {
    int addInfo(@Param("username")String username, @Param("sex")String sex,@Param("phone") String phone,@Param("email") String email, @Param("password")String password);

    int insertinfo(@Param("username")String username, @Param("sex")String sex,@Param("phone") String phone,@Param("email") String email, @Param("password")String password);

    List<MemberInfo> selectAll();

}
