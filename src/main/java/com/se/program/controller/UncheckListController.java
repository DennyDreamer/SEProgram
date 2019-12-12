package com.se.program.controller;

import org.springframework.stereotype.Controller;


@Controller
public class UncheckListController {
//    @Autowired
//    userMapper UserMapper;
//    @Autowired
//    billMapper BillMapper;
//    @Autowired
//    prescriptionMapper PrescriptionMapper;
//    @Autowired
//    changehospitalMapper ChangeMapper;
//    @Autowired
//    registerMapper RegisterMapper;
//    @Autowired
//    formMapper FormMapper;
//    @Autowired
//    recordMapper RecordMapper;
//
//
//    @PostMapping(value = "api/ViewStuList")
//    @ResponseBody
//    @CrossOrigin
//    public List<UncheckStuList> ViewStuList(){
//        /**
//         *  查看审核学生列表
//         */
//        List<user> StuList = null;
//        StuList.addAll(UserMapper.selectByUserState(1));
//
//        List<UncheckStuList> UnStuList=null;
//        int ThisId;
//      //  String ThisRecordTime;
//      //  String ThisRecordState;
//      //  int ThisFormId;
//
//        for(int i=0;i<StuList.size();i++){
//            ThisId = StuList.get(i).getUserId();
//            List<record> RecordList = null;
//            RecordList.addAll(RecordMapper.selectByUserId(ThisId));
//            for(int j =0;j<RecordList.size();j++){
//                if(RecordList.get(j).getRecordState()==0){ // 0 为未审核
//                UncheckStuList stu =new UncheckStuList(StuList.get(i).getUserName(),StuList.get(i).getUserNumber(),
//                        RecordList.get(j).getFormId(),ThisId,
//                        RecordList.get(j).getRecordTime(),RecordList.get(j).getRecordState());
//                UnStuList.add(stu);
//            }
//                else {
//                    continue;
//                }
//            }
//        }
//
//        return UnStuList;
//
//    }
//
//    @PostMapping(value = "api/CheckStuList")
//    @ResponseBody
//    @CrossOrigin
//    public CheckInfo CheckStuList(int formId){
//        /**
//         *  点击审核按钮
//         */
//        int ThisId=RecordMapper.selectUserIdByFormId(formId);
//        user ThisUser=UserMapper.selectByPrimaryKey(ThisId);
//        form ThisForm =FormMapper.selectByPrimaryKey(formId);
//        String BillImgPath=BillMapper.selectBillImgByFormId(formId);
//        String ChangeImgPath = ChangeMapper.selectChangeImgByFormId(formId);
//        String PrescriptionImgPath = PrescriptionMapper.selectPrescriptionImgByFormId(formId);
//        String RegisterImgPath = RegisterMapper.selectRegisterImgByFormId(formId);
//
//        return new CheckInfo(ThisUser.getUserName(),ThisUser.getUserNumber(),ThisUser.getUserState(),
//                ThisForm.getFormTime(),ThisForm.getFormKind(),ThisForm.getHospital(),
//                ThisForm.getFormText(),ThisForm.getHospitalDepartment(),BillImgPath,
//                ChangeImgPath,PrescriptionImgPath,RegisterImgPath);
//
//    }
//
//    @PostMapping(value = "api/SubmitCheckResult")
//    @ResponseBody
//    @CrossOrigin
//    public Result SubmitCheckResult(CheckResult CR){
//        /**
//         *  提交审核结果
//         */
//        //复议
//        return new Result(200);
//
//    }
//
//    @PostMapping(value = "api/ViewCheckedStuList")
//    @ResponseBody
//    @CrossOrigin
//    public List<CheckedStuList> ViewCheckedStuList(){
//        /**
//         *  查看已审核学生列表
//         */
//        List<user> CheckedStuList = null;
//        CheckedStuList.addAll(UserMapper.selectByUserState(1));
//
//        List<CheckedStuList> CdStuList=null;
//        int ThisId;
//        //  String ThisRecordTime;
//        //  String ThisRecordState;
//        //  int ThisFormId;
//
//        for(int i=0;i<CheckedStuList.size();i++){
//            ThisId = CheckedStuList.get(i).getUserId();
//            List<record> RecordList1 = null;
//            RecordList1.addAll(RecordMapper.selectByUserId(ThisId));
//            for(int j =0;j<RecordList1.size();j++){
//                if(RecordList1.get(j).getRecordState()==0){ // 0 为未审核
//                    continue;
//                }
//                else {
//                    CheckedStuList stu1 =new CheckedStuList(CheckedStuList.get(i).getUserName(),CheckedStuList.get(i).getUserNumber(),
//                            RecordList1.get(j).getFormId(),ThisId,
//                            RecordList1.get(j).getRecordTime(),RecordList1.get(j).getRecordState());
//                    CdStuList.add(stu1);
//                }
//            }
//        }
//
//        return CdStuList;
//
//    }
}
