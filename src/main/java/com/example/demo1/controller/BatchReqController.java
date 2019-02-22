package com.example.demo1.controller;

import com.alibaba.fastjson.JSONObject;
import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiGettokenRequest;
import com.dingtalk.api.request.OapiServiceGetCorpTokenRequest;
import com.dingtalk.api.request.OapiUserGetRequest;
import com.dingtalk.api.response.OapiGettokenResponse;
import com.dingtalk.api.response.OapiServiceGetCorpTokenResponse;
import com.dingtalk.api.response.OapiUserGetResponse;
import com.example.demo1.pojo.BatchReq;
import com.example.demo1.pojo.MemberInfo;
import com.example.demo1.service.BatchReqService;
import com.example.demo1.service.UserService;
import com.example.demo1.utils.PageVO;
import com.example.demo1.utils.Random;
import com.taobao.api.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @program: demo1
 * @description:
 * @author: Zhaoqiming
 * @create: 2018-10-09 13:42
 **/

@RestController
@RequestMapping("/boot")
public class BatchReqController {
    @Autowired
    private BatchReqService service;
    @Autowired
    private UserService mservice;
    @Autowired
    private UserService service1;

    @RequestMapping(value="/find",method= RequestMethod.GET)
    public String show(){
        List<BatchReq> list = service.selectAll();
        String json = JSONObject.toJSON(list).toString();
        return json;
    }

    @RequestMapping(value="/search",method= RequestMethod.GET)
    public String show1(){
        BatchReq batchReq = service.selectOne();
        String json = JSONObject.toJSON(batchReq).toString();
        System.out.println("json输出为"+json);
        return json;
    }


//    @RequestMapping(value="/show",method = RequestMethod.GET)
//    public String index(){
//        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/user/get");
//        OapiUserGetRequest req = new OapiUserGetRequest();
//        req.setUserid("userid1");
//        req.setHttpMethod("GET");
//        OapiUserGetResponse rsp = client.execute(req, accessToken);
//        String json = JSONObject.toJSON(rsp).toString();
//        return json;
//    }
    /***
     * 三方企业获取access_token
     * @return
     * @throws ApiException
     */
    @RequestMapping(value="/test",method = RequestMethod.GET)
    public String Ding() throws ApiException {
        DefaultDingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/service/get_corp_token");
        OapiServiceGetCorpTokenRequest req = new OapiServiceGetCorpTokenRequest();
        req.setAuthCorpid("dingc365fcabbf733c3535c2f4657eb6378f");
        OapiServiceGetCorpTokenResponse execute = client.execute(req,"suiteKey","suiteSecret", "suiteTicket");
        String json = JSONObject.toJSON(execute).toString();
        return json;
    }
    /***
     *企业内部开发获取access_token
     * @return
     * @throws ApiException
     */
    @RequestMapping(value="/test2",method = RequestMethod.GET)
    public String Ding1() throws ApiException {
        DefaultDingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/gettoken");
        OapiGettokenRequest request = new OapiGettokenRequest();
        request.setAppkey("appkey");
        request.setAppsecret("appsecret");
        request.setHttpMethod("GET");
        OapiGettokenResponse response = client.execute(request);
        String json = JSONObject.toJSON(response).toString();
        System.out.println("输出为："+json);
        return json;
    }


    @RequestMapping(value="/memlist",method= RequestMethod.GET)
    public String showlist(){
        List<MemberInfo> list = mservice.selectAll();
        String json = JSONObject.toJSON(list).toString();
        System.out.println("json:"+json);
        return json;
    }

    @RequestMapping("/addinfo")
    public String  addinfo(String username,String sex,String phone,String email,String pass){
        System.out.println("名字："+username);
        System.out.println("密码："+pass);
        String id = Random.getLocalTrmSeqNum();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));
        String systime = df.format(new Date());
        int line =service1.addInfo(id,username,sex,phone,email,pass,systime);
        if (line>0){
            return "ok";
        }
        return "error";
    }

}



