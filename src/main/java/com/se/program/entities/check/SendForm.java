package com.se.program.entities.check;

import com.se.program.entities.bill;
import com.se.program.entities.changehospital;
import com.se.program.entities.form;
import com.se.program.entities.register;

import java.util.List;

public class SendForm {
    private form Form;
    private float registerPercentage ;
    private float medicalPercentage;
    private List<changehospital> changehospitalList;
    private List<register> registerList;
    private List<bill> billList;
    private int code;
    private String beizhu;
    private float recordMoney;

    public float getMedicalPercentage() {
        return medicalPercentage;
    }

    public void setMedicalPercentage(float medicalPercentage) {
        this.medicalPercentage = medicalPercentage;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }


    public float getRecordMoney() {
        return recordMoney;
    }

    public void setRecordMoney(float recordMoney) {
        this.recordMoney = recordMoney;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public SendForm(form form, List<changehospital> changehospitalList, List<register> registerList, List<bill> billList,int code) {
        Form = form;
        this.changehospitalList = changehospitalList;
        this.registerList = registerList;
        this.billList = billList;
        this.medicalPercentage=0;
        this.registerPercentage=0;
        this.code=code;
        this.beizhu ="";
        this.recordMoney=0;

    }


    public float getRegisterPercentage() {
        return registerPercentage;
    }

    public void setRegisterPercentage(float registerPercentage) {
        this.registerPercentage = registerPercentage;
    }



    public form getForm() {
        return Form;
    }

    public void setForm(form form) {
        Form = form;
    }

    public List<changehospital> getChangehospitalList() {
        return changehospitalList;
    }

    public void setChangehospitalList(List<changehospital> changehospitalList) {
        this.changehospitalList = changehospitalList;
    }

    public List<register> getRegisterList() {
        return registerList;
    }

    public void setRegisterList(List<register> registerList) {
        this.registerList = registerList;
    }

    public List<bill> getBillList() {
        return billList;
    }

    public void setBillList(List<bill> billList) {
        this.billList = billList;
    }
}
