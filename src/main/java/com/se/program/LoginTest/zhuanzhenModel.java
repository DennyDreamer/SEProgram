package com.se.program.LoginTest;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import  com.se.program.LoginTest.*;

public class zhuanzhenModel {
    String hosName;
    String zhuanzhenDate;
    MultipartFile zhuanzhenImg;
    List<fuwufeiModel> fuwufeiArr;



    public void setHosName(String hosName) {
        this.hosName = hosName;
    }

    public void setZhuanzhenDate(String zhuanzhenDate) {
        this.zhuanzhenDate = zhuanzhenDate;
    }

    public void setZhuanzhenImg(MultipartFile zhuanzhenImg) {
        this.zhuanzhenImg = zhuanzhenImg;
    }

    public void setFuwufeiArr(List<fuwufeiModel> fuwufeiArr) {
        this.fuwufeiArr = fuwufeiArr;
    }

    public zhuanzhenModel(String hosName, String zhuanzhenDate, MultipartFile zhuanzhenImg, List<fuwufeiModel> fuwufeiArr) {
        this.hosName = hosName;
        this.zhuanzhenDate = zhuanzhenDate;
        this.zhuanzhenImg = zhuanzhenImg;
        this.fuwufeiArr = fuwufeiArr;
    }

    public String getHosName() {
        return hosName;
    }

    public String getZhuanzhenDate() {
        return zhuanzhenDate;
    }

    public MultipartFile getZhuanzhenImg() {
        return zhuanzhenImg;
    }

    public List<fuwufeiModel> getFuwufeiArr() {
        return fuwufeiArr;
    }
}
