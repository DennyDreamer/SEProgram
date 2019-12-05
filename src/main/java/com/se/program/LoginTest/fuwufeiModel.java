package com.se.program.LoginTest;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

public class fuwufeiModel {
    String office;
    int yishiPay;
    Date yishiDate;
    MultipartFile yishiImg;
    List<yaofeiModel> yaofeiArr;



    public void setOffice(String office) {
        this.office = office;
    }

    public void setYishiPay(int yishiPay) {
        this.yishiPay = yishiPay;
    }

    public void setYishiDate(Date yishiDate) {
        this.yishiDate = yishiDate;
    }

    public void setYishiImg(MultipartFile yishiImg) {
        this.yishiImg = yishiImg;
    }

    public void setYaofeiArr(List<yaofeiModel> yaofeiArr) {
        this.yaofeiArr = yaofeiArr;
    }


    public String getOffice() {
        return office;
    }

    public int getYishiPay() {
        return yishiPay;
    }

    public Date getYishiDate() {
        return yishiDate;
    }

    public MultipartFile getYishiImg() {
        return yishiImg;
    }

    public List<yaofeiModel> getYaofeiArr() {
        return yaofeiArr;
    }

    public fuwufeiModel(String office, int yishiPay, Date yishiDate, MultipartFile yishiImg, List<yaofeiModel> yaofeiArr) {
        this.office = office;
        this.yishiPay = yishiPay;
        this.yishiDate = yishiDate;
        this.yishiImg = yishiImg;
        this.yaofeiArr = yaofeiArr;
    }

}
