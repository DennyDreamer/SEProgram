package com.se.program.LoginTest;

import java.util.Date;

public class RecordInfo {
    int num;
    int RecordId;



    Date RecordTime;
    int RecodeState;

    public RecordInfo(int num, int recordId, Date recordTime, int recodeState) {
        this.num = num;
        RecordId = recordId;
        RecordTime = recordTime;
        RecodeState = recodeState;
    }

}
