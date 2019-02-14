package com.example.demo1.service;

import com.example.demo1.dao.BatchReqMapper;
import com.example.demo1.pojo.BatchReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: demo1
 * @description:
 * @author: Zhaoqiming
 * @create: 2018-10-09 13:34
 **/

@Service
public class BatchReqServiceImpl implements BatchReqService {
    @Autowired
    private BatchReqMapper mapper;


    @Override
    public List<BatchReq> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public BatchReq selectOne() {
        return mapper.selectOne();
    }

    @Override
    public int updateBatchRq() {
        return 1;
    }


}



