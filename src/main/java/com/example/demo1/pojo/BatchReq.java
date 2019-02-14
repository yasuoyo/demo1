package com.example.demo1.pojo;

/**
 * @program: demo1
 * @description:
 * @author: Zhaoqiming
 * @create: 2018-10-09 13:13
 **/
public class BatchReq {

    private String JobGroupId;

    private String JobId;

    private String ReqCode;

    private String MsgNo;

    private String JobExe;

    private String InstuCde;

    private String OpId;

    private String UsrId;

    private String UsrName;

    private String SetSeq;

    public String getJobGroupId() {
        return JobGroupId;
    }

    public void setJobGroupId(String jobGroupId) {
        JobGroupId = jobGroupId;
    }

    public String getJobId() {
        return JobId;
    }

    public void setJobId(String jobId) {
        JobId = jobId;
    }

    public String getReqCode() {
        return ReqCode;
    }

    public void setReqCode(String reqCode) {
        ReqCode = reqCode;
    }

    public String getMsgNo() {
        return MsgNo;
    }

    public void setMsgNo(String msgNo) {
        MsgNo = msgNo;
    }

    public String getJobExe() {
        return JobExe;
    }

    public void setJobExe(String jobExe) {
        JobExe = jobExe;
    }

    public String getInstuCde() {
        return InstuCde;
    }

    public void setInstuCde(String instuCde) {
        InstuCde = instuCde;
    }

    public String getOpId() {
        return OpId;
    }

    public void setOpId(String opId) {
        OpId = opId;
    }

    public String getUsrId() {
        return UsrId;
    }

    public void setUsrId(String usrId) {
        UsrId = usrId;
    }

    public String getUsrName() {
        return UsrName;
    }

    public void setUsrName(String usrName) {
        UsrName = usrName;
    }

    public String getSetSeq() {
        return SetSeq;
    }

    public void setSetSeq(String setSeq) {
        SetSeq = setSeq;
    }

    @Override
    public String toString() {
        return "BatchReq{" +
                "JobGroupId='" + JobGroupId + '\'' +
                ", JobId='" + JobId + '\'' +
                ", ReqCode='" + ReqCode + '\'' +
                ", MsgNo='" + MsgNo + '\'' +
                ", JobExe='" + JobExe + '\'' +
                ", InstuCde='" + InstuCde + '\'' +
                ", OpId='" + OpId + '\'' +
                ", UsrId='" + UsrId + '\'' +
                ", UsrName='" + UsrName + '\'' +
                ", SetSeq='" + SetSeq + '\'' +
                '}';
    }
}



