package com.se.program.LoginTest;

import java.util.Date;

public class CheckInfo {
    String Username;
    String UserNumber;
    int UserState;
    private Date formTime;
    private Integer formKind;
    private String hospital;
    private String formText;
    private String hospitalDepartment;
    String BillImgPath;
    String ChangeImgPath;
    String PrescriptionImgPath;
    String RegisterImgPath;
    public CheckInfo(String username, String userNumber, int userState, Date formTime, Integer formKind, String hospital, String formText, String hospitalDepartment, String billImgPath, String changeImgPath, String prescriptionImgPath, String registerImgPath) {
        Username = username;
        UserNumber = userNumber;
        UserState = userState;
        this.formTime = formTime;
        this.formKind = formKind;
        this.hospital = hospital;
        this.formText = formText;
        this.hospitalDepartment = hospitalDepartment;
        BillImgPath = billImgPath;
        ChangeImgPath = changeImgPath;
        PrescriptionImgPath = prescriptionImgPath;
        RegisterImgPath = registerImgPath;
    }

}
