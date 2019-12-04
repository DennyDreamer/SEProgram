package com.se.program.LoginTest;

public class myInfoForm {
    String number;
    String name;
    String sex;
    String nation;



    String idcard;
    String phone;

    public myInfoForm(String number, String name, String sex, String nation, String idcard, String phone) {
        this.number = number;
        this.name = name;
        this.sex = sex;
        this.nation = nation;
        this.idcard = idcard;
        this.phone = phone;
    }
    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getNation() {
        return nation;
    }

    public String getIdcard() {
        return idcard;
    }

    public String getPhone() {
        return phone;
    }
}
