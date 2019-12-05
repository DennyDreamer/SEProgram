package com.se.program.LoginTest;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public class UploadInfo {

    String ChangeHospital ;
    Date ChangeDate;
    MultipartFile ChangeImg;


    String RegisterHospital;
    String RegisterShi;
    Date RegisterDate;
    float RegisterFee;
    MultipartFile RegisterImg;

    String BillHospital;
    Date BillDate;
    float BillFee;
    MultipartFile BillImg;

    MultipartFile PrescriptionImg;



    String Text;
    public UploadInfo(String changeHospital, Date changeDate, MultipartFile changeImg, String registerHospital, String registerShi, Date registerDate, float registerFee, MultipartFile registerImg, String billHospital, Date billDate, float billFee, MultipartFile billImg, MultipartFile prescriptionImg, String text) {
        ChangeHospital = changeHospital;
        ChangeDate = changeDate;
        ChangeImg = changeImg;
        RegisterHospital = registerHospital;
        RegisterShi = registerShi;
        RegisterDate = registerDate;
        RegisterFee = registerFee;
        RegisterImg = registerImg;
        BillHospital = billHospital;
        BillDate = billDate;
        BillFee = billFee;
        BillImg = billImg;
        PrescriptionImg = prescriptionImg;
        Text = text;
    }

    public String getChangeHospital() {
        return ChangeHospital;
    }

    public Date getChangeDate() {
        return ChangeDate;
    }

    public MultipartFile getChangeImg() {
        return ChangeImg;
    }

    public String getRegisterHospital() {
        return RegisterHospital;
    }

    public String getRegisterShi() {
        return RegisterShi;
    }

    public Date getRegisterDate() {
        return RegisterDate;
    }

    public float getRegisterFee() {
        return RegisterFee;
    }

    public MultipartFile getRegisterImg() {
        return RegisterImg;
    }

    public String getBillHospital() {
        return BillHospital;
    }

    public Date getBillDate() {
        return BillDate;
    }

    public float getBillFee() {
        return BillFee;
    }

    public MultipartFile getBillImg() {
        return BillImg;
    }

    public MultipartFile getPrescriptionImg() {
        return PrescriptionImg;
    }
    public String getText() {
        return Text;
    }
}
