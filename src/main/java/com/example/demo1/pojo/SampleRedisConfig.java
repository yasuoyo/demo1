package com.example.demo1.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: demo1
 * @description:
 * @author: Zhaoqiming
 * @create: 2018-10-29 14:48
 **/
@ConfigurationProperties(prefix = "redis.cache")
public class SampleRedisConfig {

    private int expireSeconds;

    private int commandTimeout;

    public void setExpireSeconds(int expireSeconds) {
        this.expireSeconds = expireSeconds;
    }

    public void setCommandTimeout(int commandTimeout) {
        this.commandTimeout = commandTimeout;
    }
}



