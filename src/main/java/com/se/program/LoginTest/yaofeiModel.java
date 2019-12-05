package com.se.program.LoginTest;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public class yaofeiModel {
    int yaofeiPay;
    Date yaofeiDate;

    MultipartFile yaofeiImg;
    MultipartFile chufangImg;

    public void setYaofeiPay(int yaofeiPay) {
        this.yaofeiPay = yaofeiPay;
    }

    public void setYaofeiDate(Date yaofeiDate) {
        this.yaofeiDate = yaofeiDate;
    }

    public void setYaofeiImg(MultipartFile yaofeiImg) {
        this.yaofeiImg = yaofeiImg;
    }

    public void setChufangImg(MultipartFile chufangImg) {
        this.chufangImg = chufangImg;
    }

    public int getYaofeiPay() {
        return yaofeiPay;
    }

    public Date getYaofeiDate() {
        return yaofeiDate;
    }

    public MultipartFile getYaofeiImg() {
        return yaofeiImg;
    }

    public MultipartFile getChufangImg() {
        return chufangImg;
    }
    public yaofeiModel(int yaofeiPay, Date yaofeiDate, MultipartFile yaofeiImg, MultipartFile chufangImg) {
        this.yaofeiPay = yaofeiPay;
        this.yaofeiDate = yaofeiDate;
        this.yaofeiImg = yaofeiImg;
        this.chufangImg = chufangImg;
    }
}
