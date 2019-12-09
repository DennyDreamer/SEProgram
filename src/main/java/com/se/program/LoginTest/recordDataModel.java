package com.se.program.LoginTest;

import java.util.Date;

public class recordDataModel {
    private int number;
    private  int recordID;
    private Date createTime;
    private String recordStatus;

    public recordDataModel(int number, int recordID, Date createTime, String recordStatus) {
        this.number = number;
        this.recordID = recordID;
        this.createTime = createTime;
        this.recordStatus = recordStatus;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setRecordID(int recordID) {
        this.recordID = recordID;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    public int getRecordID() {
        return recordID;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public String getRecordStatus() {
        return recordStatus;
    }

    public recordDataModel() {
    }
}
