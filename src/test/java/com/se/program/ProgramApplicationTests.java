package com.se.program;

import com.se.program.entities.record;
import com.se.program.mapper.*;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import com.se.program.LoginTest.zhuanzhenModel;
@MapperScan(value = "com.se.program.mapper")
@SpringBootTest
class ProgramApplicationTests {

    @Autowired
    userMapper UserMapper;
    @Autowired
    recordMapper RecordMapper;
    @Autowired
    billMapper BillMapper;
    @Autowired
    changehospitalMapper ChangehospitalMapper;
    @Autowired
    formMapper FormMapper;
    @Autowired
    prescriptionMapper PrescriptionMapper;
    @Autowired
    registerMapper RegisterMapper;

    @Test
    void contextLoads() {
        List<zhuanzhenModel> recordArr;

        List<Integer> TheseFormId = RecordMapper.selectFormIdByRecordId(3);
        for(int j =0;j<TheseFormId.size();j++){
            System.out.println(TheseFormId.get(j).intValue());
        }

        List<Integer> TheseBillid = BillMapper.selectBillIdByFormId(3);

        for(int i=0;i<TheseBillid.size();i++){
            System.out.println(TheseBillid.get(i).intValue());
        }

        List<Integer> TheseChangeId= ChangehospitalMapper.selectChangeIdByFormId(3);
        for(int i=0;i<TheseChangeId.size();i++){
            System.out.println(TheseChangeId.get(i).intValue());
        }

        List<Integer> ThesePreId= PrescriptionMapper.selectPreIdByFormId(3);
        for(int i=0;i<ThesePreId.size();i++){
            System.out.println(ThesePreId.get(i).intValue());
        }

        List<Integer> TheseRegId= RegisterMapper.selectRegIdByFormId(3);
        for(int i=0;i<TheseRegId.size();i++){
            System.out.println(TheseRegId.get(i).intValue());
        }
     //   System.out.println(UserMapper.selectPasswordByPrimaryKey(1));
//        List<record> a = RecordMapper.selectByUserId(1);
//
//        System.out.println(BillMapper.selectMaxCount());
//        System.out.println(RecordMapper.selectMaxCount());
//        System.out.println(FormMapper.selectMaxCount());
//        System.out.println(RegisterMapper.selectMaxCount());
//        System.out.println(PrescriptionMapper.selectMaxCount());
//       System.out.println(ChangehospitalMapper.selectMaxCount());
//        for(int i =0;i<a.size();i++) {
//
//        System.out.println(a.get(i).getRecordId());

//        }
      //  System.out.println(RecordMapper.selectByUserId(1));
      //  System.out.println(UserMapper.selectIdByUserNumber("456888"));
    }
}