package com.se.program.controller;

import com.se.program.LoginTest.*;
import com.se.program.entities.*;
import com.se.program.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Controller
public class UserLookRecordController {

    /**
     *   用户查看报销记录
     */

    @Autowired
    userMapper UserMapper;

    @Autowired
    operationMapper OperationMapper;
    @Autowired
    departmentMapper DepartmentMapper;
    @Autowired
    recordMapper RecordMapper;
    @Autowired
    formMapper FormMapper;
    @Autowired
    billMapper BillMapper;
    @Autowired
    changehospitalMapper ChangehospitalMapper;
    @Autowired
    prescriptionMapper PrescriptionMapper;
    @Autowired
    registerMapper RegisterMapper;

    @PostMapping(value = "api/UserLookRecord")
    @ResponseBody
    @CrossOrigin
    public List<recordDataModel> UserLookRecord(HttpServletRequest request){

        HttpSession session = request.getSession();
        user ThisUser = (user) session.getAttribute("users");
        System.out.println(ThisUser.getUserId());

        List<record> Record= RecordMapper.selectByUserId(ThisUser.getUserId());

        List<recordDataModel> recordData = new ArrayList<>();

        for(int j = 0;j<Record.size();j++){
            String ThisRecordStatus = null;
            if(Record.get(j).getRecordState()==2||Record.get(j).getRecordState()==0){
                ThisRecordStatus ="已提交未审核";
            }
            else if(Record.get(j).getRecordState()==1){
                ThisRecordStatus="暂存";
            }
            else if(Record.get(j).getRecordState()==3){
                ThisRecordStatus = "审核未通过";
            }
            else if(Record.get(j).getRecordState()==4){
                ThisRecordStatus = "审核通过未确认";
            }
            else if(Record.get(j).getRecordState()==5){
                ThisRecordStatus = "已确认";
            }
            else{
                ThisRecordStatus ="收单完成";
            }
        //    System.out.println(ThisRecordStatus);

            recordDataModel ThisRecordData= new recordDataModel(j+1,Record.get(j).getRecordId(),Record.get(j).getRecordTime(),ThisRecordStatus);
            recordData.add(ThisRecordData);
        //    System.out.println(ThisRecordData.getRecordID());
       //     System.out.println(ThisRecordData.getNumber());
       //     System.out.println(ThisRecordData.getCreateTime());
       //     System.out.println(ThisRecordData.getRecordStatus());
        }
        return recordData;
    }

    @PostMapping(value = "api/UserDeleteRecord")
    @ResponseBody
    @CrossOrigin
    public Result DeleteRecord(@RequestBody HashMap<String,Integer> map){
        int recordID = map.get("recordId");
        //复议
        try {
            record ThisRecord;
            ThisRecord = RecordMapper.selectByPrimaryKey(recordID);
            List<Integer> TheseFormId = RecordMapper.selectFormIdByRecordId(recordID);
            for (int j = 0; j < TheseFormId.size(); j++) {
                System.out.println(TheseFormId.get(j).intValue());

                List<Integer> TheseBillid = BillMapper.selectBillIdByFormId(TheseFormId.get(j).intValue());
                for (int i = 0; i < TheseBillid.size(); i++) {
                    System.out.println(TheseBillid.get(i).intValue());
                    BillMapper.deleteByPrimaryKey(TheseBillid.get(i).intValue());
                }

                List<Integer> TheseChangeId = ChangehospitalMapper.selectChangeIdByFormId(TheseFormId.get(j).intValue());
                for (int i = 0; i < TheseChangeId.size(); i++) {
                    System.out.println(TheseChangeId.get(i).intValue());
                    ChangehospitalMapper.deleteByPrimaryKey(TheseChangeId.get(i).intValue());
                }

                List<Integer> ThesePreId = PrescriptionMapper.selectPreIdByFormId(TheseFormId.get(j).intValue());
                for (int i = 0; i < ThesePreId.size(); i++) {
                    System.out.println(ThesePreId.get(i).intValue());
                    PrescriptionMapper.deleteByPrimaryKey(ThesePreId.get(i).intValue());
                }

                List<Integer> TheseRegId = RegisterMapper.selectRegIdByFormId(TheseFormId.get(j).intValue());
                for (int i = 0; i < TheseRegId.size(); i++) {
                    System.out.println(TheseRegId.get(i).intValue());
                    RegisterMapper.deleteByPrimaryKey(TheseRegId.get(i).intValue());
                }
                FormMapper.deleteByPrimaryKey(TheseFormId.get(j).intValue());
            }

            RecordMapper.deleteByPrimaryKey(recordID);
            return new Result(200);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new Result(400);
    }

    @PostMapping(value = "api/CompileRecord")
    @ResponseBody
    @CrossOrigin
    public paramModel CompileRecord(@RequestBody HashMap<String,Integer> map){

    //   System.out.println("1111111111111111");

        System.out.println("hello");
        int recordID = map.get("recordID");
        System.out.println(recordID);

        int recordId = recordID;
        paramModel ReturnParam= new paramModel();

        List<Integer> TheseFormId= RecordMapper.selectFormIdByRecordId(recordId);

        int FormId = TheseFormId.get(0).intValue();

        System.out.println(FormId);


        form ThisForm = FormMapper.selectByPrimaryKey(FormId);
        //String ThisGaiZhangImg = "http://localhost:8888/img/gaizhang/"+ThisForm.getGaizhangImg()+".jpeg";
        String ThisGaiZhangImg = "http://localhost:8888/img/gaizhang/2fcd514445ea4099afdde15aaf92a15c.jpeg";
        System.out.println(ThisGaiZhangImg);
        //String ThisTeShuImg = "http://localhost:8888/img/teshu/"+ThisForm.getTeshuImg()+".jpeg";
        String ThisTeShuImg = "http://localhost:8888/img/teshu/0d231c65db5f4a9a8311debfcf767921.jpeg";
        System.out.println(ThisTeShuImg);

        waishangModels ThisWaiShangShuoMing = new waishangModels(ThisForm.getFormText(),ThisGaiZhangImg,ThisTeShuImg);
        ReturnParam.setWaishangArr(ThisWaiShangShuoMing);


        Date ThisTime = ThisForm.getFormTime();

        List<Integer> TheseChangeHospitalId = ChangehospitalMapper.selectChangeIdByFormId(FormId);

        List<Integer> TheseRegisterId = RegisterMapper.selectRegIdByFormId(FormId);

        List<Integer> TheseBillId = BillMapper.selectBillIdByFormId(FormId);

       // List<Integer> ThesePreId = PrescriptionMapper.selectPreIdByFormId(FormId);

        List<zhuanzhenModel> records =new ArrayList<>();

        for(int i=0;i<TheseChangeHospitalId.size();i++){
            List<fuwufeiModel> fuwufeiArr =new ArrayList<>();
            int ThisChangeId = TheseChangeHospitalId.get(i);
            for(int j=0;j<TheseRegisterId.size();j++){

                int ThisRegId= TheseRegisterId.get(j);
                register ThisRegister = RegisterMapper.selectByPrimaryKey(ThisRegId);

                if(ThisChangeId==ThisRegister.getChangehospitalId()) {

                    List<yaofeiModel> yaofeiArr = new ArrayList<>();
                    for (int k = 0; k < TheseBillId.size(); k++) {

                        int ThisBillId =TheseBillId.get(k);
                        bill ThisBill = BillMapper.selectByPrimaryKey(TheseBillId.get(k).intValue());
                        if(ThisRegId==ThisBill.getRegisterId()) {
                            //prescription ThisPre =PrescriptionMapper.selectByPrimaryKey(ThesePreId.get(k).intValue());
                           // String ThisBillImg = "http://localhost:8888/img/yaofei/"+ThisBill.getBillImage()+".jpeg";
                            String ThisBillImg = "http://localhost:8888/img/yaofei/9c23bcdbe9cf46669971d15578afc5d7.jpeg";

                            System.out.println(ThisBillImg);
                      //      String ThisPreImg = "http://localhost:8888/img/chufang/"+ThisBill.getBillPrescriptionImage()+".jpeg";
                            String ThisPreImg = "http://localhost:8888/img/chufang/3d599d48bc2948c68876c922165f86b8.jpeg";

                            System.out.println(ThisPreImg);

                            yaofeiModel ThisYaoFei = new yaofeiModel(ThisBill.getBillCost(), ThisTime.toString(), ThisBillImg, ThisPreImg);
                            yaofeiArr.add(ThisYaoFei);
                        }
                    }

                 //   String ThisRegisterImg =  "http://localhost:8888/img/fuwufei/"+ThisRegister.getRegisterImage()+".jpeg";
                    String ThisRegisterImg = "http://localhost:8888/img/fuwufei/1eb0bce69c22472db188516c65e2d03d.jpeg";
                    System.out.println(ThisRegisterImg);

                fuwufeiModel ThisFuWu = new fuwufeiModel(ThisRegister.getRegisterDepartment(),ThisRegister.getRegisterCost(),ThisTime.toString(),ThisRegisterImg,yaofeiArr);
                fuwufeiArr.add(ThisFuWu);
                }

            }

            changehospital ThisChange = ChangehospitalMapper.selectByPrimaryKey(TheseChangeHospitalId.get(i).intValue());

           // String ThisChangeImg = "http://localhost:8888/img/zhuanzhendan/"+ThisChange.getChangehospitalImage()+".jpeg";
            String ThisChangeImg = "http://localhost:8888/img/zhuanzhendan/1d400be70c55485894f0c76407442c03.jpeg";
            System.out.println(ThisChangeImg);
            zhuanzhenModel ThisZhuanZhen = new zhuanzhenModel(fuwufeiArr,ThisChange.getChangehospitalIn(),ThisChangeImg,ThisTime.toString());
            records.add(ThisZhuanZhen);
        }
        ReturnParam.setRecords(records);
      //  System.out.println(TheseChangeHospitalId.size());
     //   System.out.println(TheseRegisterId.size());
     //   System.out.println(TheseBillId.size());
   //     System.out.println(ReturnParam.getWaishangArr().getWaishangshuoming());
     //   System.out.println(ReturnParam);
//        for(int i=0;i<TheseChangeHospitalId.size();i++){
//            System.out.println(ReturnParam.getRecords().get(i).getZhuangzhenImg());
//            for(int j =0;j<TheseRegisterId.size();j++){
//              //  System.out.println(ReturnParam.getRecords().get(i).getFuwufeiArr().get(j).getYishiImg());
//                for(int k =0;k<TheseBillId.size();k++){
//              //      System.out.println(ReturnParam.getRecords().get(i).getFuwufeiArr().get(j).getYaofeiArr().get(k).getYaofeiImg());
//             //      System.out.println(ReturnParam.getRecords().get(i).getFuwufeiArr().get(j).getYaofeiArr().get(k).getChufangImg());
//                }
//            }
//        }


        return ReturnParam;
    }

    @PostMapping(value = "api/CreateTable")
    @ResponseBody
    @CrossOrigin
    public tableDataModel CreateRecord(@RequestBody HashMap<String,Integer> map,HttpServletRequest request){

        //   System.out.println("1111111111111111");

      //  System.out.println("1111111111111111");
        System.out.println(MoneyUtil.toBigAmt(100));
        int recordID = map.get("recordID");

        tableDataModel tableData =new tableDataModel();

        HttpSession session = request.getSession();

        user ThisUser = (user)session.getAttribute("users");

        int recordId = recordID;
        record ThisRecord =RecordMapper.selectByPrimaryKey(recordID);

//        if(ThisRecord.getRecordState()!=4){
//            return new Result(400);
//        }


        int ThisFormId = ThisRecord.getFormId();

        System.out.println(ThisFormId);
        List<Integer> TheseChangeHospitalId = ChangehospitalMapper.selectChangeIdByFormId(ThisFormId);

        List<Integer> TheseRegisterId = RegisterMapper.selectRegIdByFormId(ThisFormId);

        List<Integer> TheseBillId = BillMapper.selectBillIdByFormId(ThisFormId);

//        operationExample example = new operationExample();
//        operationExample.Criteria criteria = new operationExample().createCriteria();
//
//        criteria.andFormIdEqualTo(ThisFormId);
//        List<operation> TheseOperation = OperationMapper.selectByExample(example);

        operation ThisOperation = OperationMapper.selectByFormId(ThisFormId);
        System.out.println(ThisOperation.getFormId());

        for(int i=0;i<TheseChangeHospitalId.size();i++){
            tableDataModel ThisTableData =new tableDataModel();
            ThisTableData.setDate(ThisRecord.getRecordTime().toString());
            ThisTableData.setBaoxiaoNum(TheseChangeHospitalId.get(i));
            ThisTableData.setBaozhangNum((int)((Math.random()*9+1)*10000));
            ThisTableData.setName(ThisUser.getUserName());
            ThisTableData.setStatus(ThisUser.getUserState());
            ThisTableData.setHospital((ChangehospitalMapper.selectByPrimaryKey(TheseChangeHospitalId.get(i)).getChangehospitalIn()));
            String DepartName = (DepartmentMapper.selectByPrimaryKey(ThisUser.getDepartmentId())).getDepartmentName();
            ThisTableData.setDepartment(DepartName);

            ThisTableData.setGefuPay(ThisOperation.getRegisterZifei());
            ThisTableData.setYaofeigefuPay(ThisOperation.getBillZifei());
            ThisTableData.setBufenFudan(0);
            ThisTableData.setTeshuFudan(0);
            ThisTableData.setOther(ThisOperation.getOperationText());

            int ThisRealFuwu =0;
            int ThisRealYaofei =0;
            int ThisFuwuPingzheng =0;
            int ThisYaofeiPingzheng =0;
            int ThisChangeId = TheseChangeHospitalId.get(i);
            for(int j=0;j<TheseRegisterId.size();j++){


                int ThisRegId= TheseRegisterId.get(j);
                register ThisRegister = RegisterMapper.selectByPrimaryKey(ThisRegId);

                if(ThisChangeId==ThisRegister.getChangehospitalId()) {

                    ThisFuwuPingzheng+=1;
                    ThisRealFuwu+=ThisRegister.getRegisterCost();

                    for (int k = 0; k < TheseBillId.size(); k++) {

                        int ThisBillId =TheseBillId.get(k);
                        bill ThisBill = BillMapper.selectByPrimaryKey(TheseBillId.get(k).intValue());
                        if(ThisRegId==ThisBill.getRegisterId()) {
                            ThisYaofeiPingzheng+=1;
                            ThisRealYaofei+=ThisBill.getBillCost();
                        }
                    }
                }
            }
            ThisTableData.setFuwuPay(ThisRealFuwu);
            ThisTableData.setFuwuPingzheng(ThisFuwuPingzheng);

            System.out.println(MoneyUtil.toBigAmt(ThisRealFuwu));
            double dd = (ThisRealFuwu-ThisOperation.getRegisterZifei());
            System.out.println(ThisRealFuwu);
            System.out.println(ThisOperation.getRegisterZifei());
            System.out.println(dd);
            ThisTableData.setBaoxiaoPay(MoneyUtil.toBigAmt(dd));
            float pro = ((float) (ThisOperation.getRegisterZifei())/ThisRealFuwu);
            float Proportion = ((float)Math.round(pro*1000)/1000);
            System.out.println(Proportion);
            ThisTableData.setProportion(Proportion);
            //  System.out.println(((float) (ThisRealFuwu-TheseOperation.get(0).getRegisterZifei())/ThisRealFuwu));

            ThisTableData.setZifeikuan(ThisOperation.getRegisterZifei());

            ThisTableData.setYaofeiPingzheng(ThisYaofeiPingzheng);
            ThisTableData.setYaofeishenbao(ThisRealYaofei);
            System.out.println(MoneyUtil.toBigAmt(ThisRealYaofei-ThisOperation.getBillZifei()));
            ThisTableData.setYaofeibaoxiaoPay(MoneyUtil.toBigAmt(ThisRealYaofei-ThisOperation.getBillZifei()));

            float Ypro = ((float) (ThisOperation.getBillZifei()))/ThisRealYaofei;
            float YaofeiProportion =  ((float)Math.round(Ypro*1000)/1000);
            ThisTableData.setYaofeiProportion(YaofeiProportion);
            ThisTableData.setRealFuwu(ThisRealFuwu);
            ThisTableData.setYaofeiZifeikuan(ThisOperation.getBillZifei());
           // tableData.add(ThisTableData);
            return  ThisTableData;
        }

        return tableData;
    }


    @PostMapping(value = "api/ConfirmRecord")
    @ResponseBody
    @CrossOrigin
    public Result ConfirmRecord(@RequestBody HashMap<String,Integer> map,HttpServletRequest request){

        int recordID = map.get("recordID");

     //   System.out.println("hello");
        record ThisRecord = RecordMapper.selectByPrimaryKey(recordID);
        ThisRecord.setRecordState(5);
        try {
            int ReturnCode = RecordMapper.updateByPrimaryKey(ThisRecord);
            System.out.println("bye");
            return new Result(ReturnCode);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(400);
        }


    }
}
