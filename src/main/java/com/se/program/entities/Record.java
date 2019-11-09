package com.se.program.entities;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Date;

public class Record {

    private Integer RecordId;    //报销ID
    private Integer UserId;     //用户ID
    private Integer DepId;       //部门ID
    private Date RecordSubmitTime;  //报销记录提交时间

    private Bool IsCheck;           //是否审核
    private Date RecordCheckTime;   //报销记录审核时间
    private String CheckerName;     //审核人姓名
    private String CheckResult;     //审核结果
    private String CheckAdvice;     //审核意见

    private Bool IsNeedReCheck;     //是否需要重审
    private Bool IsReCheck;         //是否重审结束

    private Bool IsReceive;         //是否收单
    private String ReceiveName;     //收单人姓名
    private Date ReceiveTime;       //收单时间

    private String PathToSaveReferrals;  //存储转诊单路径
    private Integer RatioForApply;       //报销比例
    private String UserHospital;         //就诊医院
    private Integer RegisterMoney;       //挂号费 单位：元
    private Integer TreatmentMoney;      //医疗费 单位：元
    private String PathToSavePrescription;   // 存储处方路径
    private String SpecificStatus;           //特殊说明

    public Record(Integer recordId, Integer userId, Integer depId, Date recordSubmitTime,
                  Bool isCheck, Date recordCheckTime, String checkerName, String checkResult,
                  String checkAdvice, Bool isNeedReCheck, Bool isReCheck, Bool isReceive,
                  String receiveName, Date receiveTime, String pathToSaveReferrals, Integer ratioForApply,
                  String userHospital, Integer registerMoney, Integer treatmentMoney, String pathToSavePrescription,
                  String specificStatus) {

        RecordId = recordId;
        UserId = userId;
        DepId = depId;
        RecordSubmitTime = recordSubmitTime;
        IsCheck = isCheck;
        RecordCheckTime = recordCheckTime;
        CheckerName = checkerName;
        CheckResult = checkResult;
        CheckAdvice = checkAdvice;
        IsNeedReCheck = isNeedReCheck;
        IsReCheck = isReCheck;
        IsReceive = isReceive;
        ReceiveName = receiveName;
        ReceiveTime = receiveTime;
        PathToSaveReferrals = pathToSaveReferrals;
        RatioForApply = ratioForApply;
        UserHospital = userHospital;
        RegisterMoney = registerMoney;
        TreatmentMoney = treatmentMoney;
        PathToSavePrescription = pathToSavePrescription;
        SpecificStatus = specificStatus;
    }

    public Record() {
    }


    public void setRecordId(Integer recordId) {
        RecordId = recordId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public void setDepId(Integer depId) {
        DepId = depId;
    }

    public void setRecordSubmitTime(Date recordSubmitTime) {
        RecordSubmitTime = recordSubmitTime;
    }

    public void setIsCheck(Bool isCheck) {
        IsCheck = isCheck;
    }

    public void setRecordCheckTime(Date recordCheckTime) {
        RecordCheckTime = recordCheckTime;
    }

    public void setCheckerName(String checkerName) {
        CheckerName = checkerName;
    }

    public void setCheckResult(String checkResult) {
        CheckResult = checkResult;
    }

    public void setCheckAdvice(String checkAdvice) {
        CheckAdvice = checkAdvice;
    }

    public void setIsNeedReCheck(Bool isNeedReCheck) {
        IsNeedReCheck = isNeedReCheck;
    }

    public void setIsReCheck(Bool isReCheck) {
        IsReCheck = isReCheck;
    }

    public void setIsReceive(Bool isReceive) {
        IsReceive = isReceive;
    }

    public void setReceiveName(String receiveName) {
        ReceiveName = receiveName;
    }

    public void setReceiveTime(Date receiveTime) {
        ReceiveTime = receiveTime;
    }

    public void setPathToSaveReferrals(String pathToSaveReferrals) {
        PathToSaveReferrals = pathToSaveReferrals;
    }

    public void setRatioForApply(Integer ratioForApply) {
        RatioForApply = ratioForApply;
    }

    public void setUserHospital(String userHospital) {
        UserHospital = userHospital;
    }

    public void setRegisterMoney(Integer registerMoney) {
        RegisterMoney = registerMoney;
    }

    public void setTreatmentMoney(Integer treatmentMoney) {
        TreatmentMoney = treatmentMoney;
    }

    public void setPathToSavePrescription(String pathToSavePrescription) {
        PathToSavePrescription = pathToSavePrescription;
    }

    public void setSpecificStatus(String specificStatus) {
        SpecificStatus = specificStatus;
    }

    public Integer getRecordId() {
        return RecordId;
    }

    public Integer getUserId() {
        return UserId;
    }

    public Integer getDepId() {
        return DepId;
    }

    public Date getRecordSubmitTime() {
        return RecordSubmitTime;
    }

    public Bool getIsCheck() {
        return IsCheck;
    }

    public Date getRecordCheckTime() {
        return RecordCheckTime;
    }

    public String getCheckerName() {
        return CheckerName;
    }

    public String getCheckResult() {
        return CheckResult;
    }

    public String getCheckAdvice() {
        return CheckAdvice;
    }

    public Bool getIsNeedReCheck() {
        return IsNeedReCheck;
    }

    public Bool getIsReCheck() {
        return IsReCheck;
    }

    public Bool getIsReceive() {
        return IsReceive;
    }

    public String getReceiveName() {
        return ReceiveName;
    }

    public Date getReceiveTime() {
        return ReceiveTime;
    }

    public String getPathToSaveReferrals() {
        return PathToSaveReferrals;
    }

    public Integer getRatioForApply() {
        return RatioForApply;
    }

    public String getUserHospital() {
        return UserHospital;
    }

    public Integer getRegisterMoney() {
        return RegisterMoney;
    }

    public Integer getTreatmentMoney() {
        return TreatmentMoney;
    }

    public String getPathToSavePrescription() {
        return PathToSavePrescription;
    }

    public String getSpecificStatus() {
        return SpecificStatus;
    }


    public Integer CalculateFinalMoney(){
        return (RegisterMoney+TreatmentMoney)*(1-RatioForApply);
    }
}
