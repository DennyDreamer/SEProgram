package com.se.program.LoginTest;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class paramModel {
    private List<zhuanzhenModel> records;



    private  waishangModels waishangArr;

    public List<zhuanzhenModel> getRecords() {
        return records;
    }

    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    //private Date records;


    public paramModel() {
    }

    public waishangModels getWaishangArr() {
        return waishangArr;
    }
    public void setRecords(List<zhuanzhenModel> records) {
        this.records = records;
    }

    public void setWaishangArr(waishangModels waishangArr) {
        this.waishangArr = waishangArr;
    }

    public paramModel(List<zhuanzhenModel> records, waishangModels waishangshuoming) {
        this.records = records;
        this.waishangArr = waishangshuoming;
    }

}
