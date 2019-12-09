package com.se.program.LoginTest;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;
import  com.se.program.LoginTest.*;
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class zhuanzhenModel {

    private List<fuwufeiModel> fuwufeiArr;
    private String hosName;
    private String zhuangzhenImg;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS Z", timezone = "GMT+8")
    private String zhuanzhenDate;


    public zhuanzhenModel(List<fuwufeiModel> fuwufeiArr, String hosName,String zhuangzhenImg,String zhuanzhenDate) {
        this.fuwufeiArr = fuwufeiArr;
        this.hosName = hosName;
        this.zhuangzhenImg = zhuangzhenImg;
        this.zhuanzhenDate = zhuanzhenDate;
    }

    public zhuanzhenModel() {
    }

    public List<fuwufeiModel> getFuwufeiArr() {
        return fuwufeiArr;
    }

    public String getHosName() {
        return hosName;
    }

    public void setFuwufeiArr(List<fuwufeiModel> fuwufeiArr) {
        this.fuwufeiArr = fuwufeiArr;
    }

    public void setHosName(String hosName) {
        this.hosName = hosName;
    }

    public void setZhuangzhenImg(String zhuangzhenImg) {
        this.zhuangzhenImg = zhuangzhenImg;
    }

    public void setZhuanzhenDate(String zhuanzhenDate) {
        this.zhuanzhenDate = zhuanzhenDate;
    }

    public String getZhuangzhenImg() {
        return zhuangzhenImg;
    }

    public String getZhuanzhenDate() {
        return zhuanzhenDate;
    }

}
