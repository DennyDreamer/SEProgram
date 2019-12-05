package com.se.program.LoginTest;

import java.util.Date;

public class UncheckStuList {


    String StuName;
    String StuNumber;
    int FormId;
    int StuId;
    Date RecordTime;

    int RecordState;

    public String getStuName() {
        return StuName;
    }

    public String getStuNumber() {
        return StuNumber;
    }

    public int getStuId() {
        return StuId;
    }

    public Date getRecordTime() {
        return RecordTime;
    }

    public int getRecordState() {
        return RecordState;
    }
    public int getFormId() {
        return FormId;
    }
    public UncheckStuList(String stuName, String stuNumber,int formId, int stuId, Date recordTime, int recordState) {
        StuName = stuName;
        StuNumber = stuNumber;
        StuId = stuId;
        RecordTime = recordTime;
        RecordState = recordState;
        FormId = formId;
    }
}
