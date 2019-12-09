package com.se.program.LoginTest;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class yaofeiModel {
    private String chufangImg;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS Z", timezone = "GMT+8")
    private String yaofeiDate;



    private String yaofeiImg;
    private int yaofeiPay;
    public yaofeiModel() {
    }
    public void setYaofeiPay(int yaofeiPay) {
        this.yaofeiPay = yaofeiPay;
    }

    public void setYaofeiDate(String yaofeiDate) {
        this.yaofeiDate = yaofeiDate;
    }

    public void setYaofeiImg(String yaofeiImg) {
        this.yaofeiImg = yaofeiImg;
    }

    public void setChufangImg(String chufangImg) {
        this.chufangImg = chufangImg;
    }

    public int getYaofeiPay() {
        return yaofeiPay;
    }

    public String getYaofeiDate() {
        return yaofeiDate;
    }

    public String getYaofeiImg() {
        return yaofeiImg;
    }

    public String getChufangImg() {
        return chufangImg;
    }
    public yaofeiModel(int yaofeiPay, String yaofeiDate,String yaofeiImg,String chufangImg) {
        this.yaofeiPay = yaofeiPay;
        this.yaofeiDate = yaofeiDate;
        this.yaofeiImg = yaofeiImg;
        this.chufangImg = chufangImg;
    }
}
