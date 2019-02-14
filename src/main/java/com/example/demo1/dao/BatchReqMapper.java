package com.example.demo1.dao;

import com.example.demo1.pojo.BatchReq;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BatchReqMapper {

    List<BatchReq> selectAll();

    BatchReq  selectOne();


}
