package com.se.program.LoginTest;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class fuwufeiModel {

    private String office;
    private List<yaofeiModel> yaofeiArr;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS Z", timezone = "GMT+8")
    private String yishiDate;

    private String yishiImg;
    private int yishiPay;

    public fuwufeiModel() {
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setYishiPay(int yishiPay) {
        this.yishiPay = yishiPay;
    }

    public void setYishiDate(String yishiDate) {
        this.yishiDate = yishiDate;
    }

    public void setYishiImg(String yishiImg) {
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

    public String getYishiDate() {
        return yishiDate;
    }

    public String getYishiImg() {
        return yishiImg;
    }

    public List<yaofeiModel> getYaofeiArr() {
        return yaofeiArr;
    }

    public fuwufeiModel(String office, int yishiPay, String yishiDate,String yishiImg,List<yaofeiModel> yaofeiArr) {
        this.office = office;
        this.yishiPay = yishiPay;
        this.yishiDate = yishiDate;
        this.yishiImg = yishiImg;
        this.yaofeiArr = yaofeiArr;
    }

}
