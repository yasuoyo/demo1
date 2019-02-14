package com.example.demo1.service;

import com.example.demo1.pojo.BatchReq;

import java.util.List;
public interface BatchReqService {

    List<BatchReq> selectAll();

    BatchReq  selectOne();

    int   updateBatchRq();
}
