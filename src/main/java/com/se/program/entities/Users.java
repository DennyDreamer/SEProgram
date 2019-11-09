package com.se.program.entities;

public class Users {
    private Integer UserId;  //用户编号
    private String UserSex;   //用户性别
    private String UserIDCard; //用户身份证
    private String UserNation;  //用户民族
    private String UserPhone;   //用户电话
    private String UserNumber;   //用户工资号 / 学号
    private String UserKind; // 用户类别/权限
    private String UserPassword; //用户密码
    private Integer UserState; //用户状态
    private String UserPri; //用户权限


    public Users() {
    }

    public Users(Integer userId, String userSex, String userIDCard,
                 String userNation, String userPhone, String userNumber,
                 String userKind, String userPassword, Integer userState,
                 String userPri) {
        UserId = userId;
        UserSex = userSex;
        UserIDCard = userIDCard;
        UserNation = userNation;
        UserPhone = userPhone;
        UserNumber = userNumber;
        UserKind = userKind;
        UserPassword = userPassword;
        UserState = userState;
        UserPri = userPri;
    }

    public void setUserPri(String userPri) {
        UserPri = userPri;
    }
    public String getUserPri() {
        return UserPri;
    }
    public Integer getUserId() {
        return UserId;
    }

    public String getUserSex() {
        return UserSex;
    }

    public String getUserIDCard() {
        return UserIDCard;
    }

    public String getUserNation() {
        return UserNation;
    }

    public String getUserPhone() {
        return UserPhone;
    }

    public String getUserNumber() {
        return UserNumber;
    }

    public String getUserKind() {
        return UserKind;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public Integer getUserState() {
        return UserState;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public void setUserSex(String userSex) {
        UserSex = userSex;
    }

    public void setUserIDCard(String userIDCard) {
        UserIDCard = userIDCard;
    }

    public void setUserNation(String userNation) {
        UserNation = userNation;
    }

    public void setUserPhone(String userPhone) {
        UserPhone = userPhone;
    }

    public void setUserNumber(String userNumber) {
        UserNumber = userNumber;
    }

    public void setUserKind(String userKind) {
        UserKind = userKind;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public void setUserState(Integer userState) {
        UserState = userState;
    }
}


