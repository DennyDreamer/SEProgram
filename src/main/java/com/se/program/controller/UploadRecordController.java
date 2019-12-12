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
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
public class UploadRecordController {

    @Autowired
    userMapper UserMapper;
    @Autowired
    billMapper BillMapper;

    @Autowired
    prescriptionMapper PrescriptionMapper;

    @Autowired
    changehospitalMapper ChangeMapper;
    @Autowired
    registerMapper RegisterMapper;
@Autowired
formMapper FormMapper;

@Autowired
recordMapper RecordMapper;

    @PostMapping(value = "api/Upload")
    @ResponseBody
    @CrossOrigin
    public Result Upload(@RequestBody paramModel param, HttpServletRequest request) {
        /**
         *   用户上传报销凭证
         */
        HttpSession session = request.getSession();
        //System.out.println("1111111111111111111111111111");
        user ThisUser =  (user) session.getAttribute("users");
     //   System.out.println(ThisUser.toString());
        //  List<zhuanzhenModel> records = new ArrayList<>();
        //  records.addAll(param.getRecordArr());
        //  System.out.println(records/);
        String waishangshuoming = param.getWaishangArr().getWaishangshuoming();
        List<zhuanzhenModel> records = param.getRecords();
      //  System.out.println("3513131313131");
      //  System.out.println(waishangshuoming);
      //  System.out.println(param.getRecords().get(0).getHosName());
     //   System.out.println((param.getRecords().get(0).getZhuangzhenImg()));
     //   System.out.println((param.getRecords().get(0).getFuwufeiArr().get(0).getYishiImg()));
     //   System.out.println((param.getRecords().get(0).getFuwufeiArr().get(0).getYaofeiArr().get(0).getChufangImg()));
     //   System.out.println((param.getRecords().get(0).getFuwufeiArr().get(0).getYaofeiArr().get(0).getYaofeiImg()));
        //  System.out.println(param.getRecordArr().get(0));
        //  System.out.println(param.getZhuanzhenDate());
        //   System.out.println(param.getRecordArr().get(0).getHosName());
        //  System.out.println(param.getRecordArr().get(0));
//        System.out.println(param.getRecordArr().get(0).getZhuanzhenDate());
       // System.out.println("1242343254353543535353535353");

        for(int i =0;i<records.size();i++){
            if("".equals(records.get(i).getHosName())||"".equals(records.get(i).getZhuangzhenImg())
            ||"".equals(records.get(i).getZhuanzhenDate())){
                System.out.println("zhuanzhendan null");
                return new Result(401);
            }
            String ThisChangeTime =records.get(i).getZhuanzhenDate();

            List<fuwufeiModel> ThisFuwu =records.get(i).getFuwufeiArr();
            for(int j=0;j<records.get(i).getFuwufeiArr().size();j++){
                if("".equals(ThisFuwu.get(j).getYishiImg())||"".equals(ThisFuwu.get(j).getOffice())||
                        "".equals(ThisFuwu.get(j).getYishiDate())||"".equals(ThisFuwu.get(j).getYishiPay())){
                    return  new Result(401);
                }
                if(ThisChangeTime.compareTo(ThisFuwu.get(j).getYishiDate())>0){
                    return new Result(402);
                }

                if(ThisFuwu.get(j).getYishiPay()<0){
                    return new Result(405);
                }
                String ThisRegisterTime = ThisFuwu.get(j).getYishiDate();
                List<yaofeiModel> ThisYaofei = ThisFuwu.get(j).getYaofeiArr();
                for(int k=0;k<records.get(i).getFuwufeiArr().get(j).getYaofeiArr().size();k++){
                    if("".equals(ThisYaofei.get(k).getChufangImg())||"".equals(ThisYaofei.get(k).getYaofeiImg())
                    ||"".equals(ThisYaofei.get(k).getYaofeiDate())||"".equals(ThisYaofei.get(k).getYaofeiPay())){
                        return new Result(401);
                    }
                    if(ThisRegisterTime.compareTo(ThisYaofei.get(k).getYaofeiDate())>0){
                        return new Result(403);
                    }
                    if(ThisYaofei.get(k).getYaofeiPay()<0){
                        return new Result(406);
                    }

                }
            }
        }

        //存 form
        form ThisForm =new form();

        //                          int ThisRecordId = RecordMapper.selectMaxCount();
        int FormId = FormMapper.selectMaxCount() + 1;
        //  int FormId =1;
        ThisForm.setFormId(FormId);
        ThisForm.setFormKind(1);//复议
        ThisForm.setFormText(waishangshuoming);

        String s=param.getWaishangArr().getGaizhangImg();
        String GaiZhangPath = null;
        if(param.getWaishangArr().getGaizhangImg()!=null &&s.length()!=0) {
            GaiZhangPath = param.getWaishangArr().getGaizhangImg().substring(27, s.length());
        }
        ThisForm.setGaizhangImg(GaiZhangPath);

        String a = param.getWaishangArr().getTeshuImg();
        String TesPath =null;
        if(param.getWaishangArr().getTeshuImg()!=null&&a.length()!=0) {
            TesPath = param.getWaishangArr().getTeshuImg().substring(27, a.length());
        }
        ThisForm.setTeshuImg(TesPath);

        ThisForm.setFormTime(new Date());// 复议
        FormMapper.insert(ThisForm);

        //存Record
      //  int ThisFormId = FormMapper.selectMaxCount()+1;
        record ThisRecord = new record();
        int ThisRecordId = RecordMapper.selectMaxCount() + 1;
        //    int RecordId =1;
        ThisRecord.setRecordId(ThisRecordId);
        ThisRecord.setFormId(FormId);
        ThisRecord.setRecordState(2);
        ThisRecord.setRecordTime(new Date()); //获取当前时间
        ThisRecord.setUserId(ThisUser.getUserId());
        RecordMapper.insert(ThisRecord);

        for (int i = 0; i < records.size(); i++) {

            String Chan=records.get(i).getZhuangzhenImg();
            int length =Chan.length();
            String ChangePath = Chan.substring(27,length);
            System.out.println(ChangePath);


            //存Change

            String ThisHospital = param.getRecords().get(i).getHosName();
            changehospital ThisChange = new changehospital();
            int changeId =ChangeMapper.selectMaxCount()+1;
            ThisChange.setChangehospitalId(changeId);
            ThisChange.setChangehospitalImage(ChangePath);
            ThisChange.setChangehospitalIn(ThisHospital);
            ThisChange.setChangehospitalOut(null);
         //   ThisChange.setChangehospitalImage("change");
            ThisChange.setFormId(FormId);
            ChangeMapper.insert(ThisChange);


          //  System.out.println(records.size());

            if (1 < 0) {
                return new Result(401);//图片没传过来

            } else {

                for (int j = 0; j < records.get(i).getFuwufeiArr().size(); j++) {//上传挂号图片

                    String Reg = records.get(i).getFuwufeiArr().get(j).getYishiImg();
                    int len = Reg.length();
                    String RegisterPath = Reg.substring(27,len);

                    String ThisDepartment = param.getRecords().get(i).getFuwufeiArr().get(j).getOffice();

                    System.out.println(RegisterPath);
                    //存Register
                    register ThisRe = new register();
                    int ThisRegisterId = (RegisterMapper.selectMaxCount() + 1);
                    ThisRe.setRegisterId(ThisRegisterId);
                    //  ThisRe.setRegisterId(1);
                   // ThisRe.setRegisterImage("Register");
                    ThisRe.setChangehospitalId(changeId);
                    ThisRe.setRegisterCost(param.getRecords().get(i).getFuwufeiArr().get(j).getYishiPay());
                    ThisRe.setRegisterHospital(ThisHospital);
                    ThisRe.setRegisterDepartment(ThisDepartment);
                    ThisRe.setRegisterImage(RegisterPath);
                    ThisRe.setFormId(FormId);
                    ThisRe.setRegisterExplaination(null);


                    RegisterMapper.insert(ThisRe);
              //      System.out.println(records.get(i).getFuwufeiArr().size());
                    for (int k = 0; k < records.get(i).getFuwufeiArr().get(j).getYaofeiArr().size(); k++) {//上传bill图片

                        String Bill1 =records.get(i).getFuwufeiArr().get(j).getYaofeiArr().get(k).getYaofeiImg();
                        int leng = Bill1.length();
                        String BillPath = Bill1.substring(27,leng);

                        String Pre =records.get(i).getFuwufeiArr().get(j).getYaofeiArr().get(k).getChufangImg();
                        int lengt = Pre.length();
                        String PrescriptionPath =Pre.substring(27,lengt);

                        System.out.println(BillPath);
                        System.out.println(PrescriptionPath);

                   //     System.out.println(records.get(i).getFuwufeiArr().get(j).getYaofeiArr().size());
                        try {

                            //存bill
                            bill ThisBill = new bill();
                            //ThisBill.setBillImage("bill");
                            ThisBill.setBillImage(BillPath);
                            ThisBill.setBillId(BillMapper.selectMaxCount() + 1);
                            ThisBill.setBillCost(records.get(i).getFuwufeiArr().get(j).getYaofeiArr().get(k).getYaofeiPay());
                            ThisBill.setBillPrescriptionImage(PrescriptionPath);
                            //  ThisBill.setBillId(1);
                            ThisBill.setFormId(FormId);
                            ThisBill.setRegisterId(ThisRegisterId);
                            BillMapper.insert(ThisBill);
//                            //存Prescription
//                            prescription ThisPe = new prescription();
//                            ThisPe.setPrescriptionId(PrescriptionMapper.selectMaxCount() + 1);
//                            //   ThisPe.setPrescriptionId(1);
//                         //   ThisPe.setPrescriptionImage("pre");
//                            ThisPe.setPrescriptionImage((PrescriptionPath));
//                            ThisPe.setFormId(FormId);
//                            PrescriptionMapper.insert(ThisPe);
                        } catch (Exception e) {
                            e.printStackTrace();
                            return new Result(402);
                        }
                    }
                }
            }

        }
        return new Result(200); //成功返回200
    }

    @PostMapping(value = "api/UploadImgZ")
    @ResponseBody
    @CrossOrigin
    public String UploadImgZ(@RequestBody MultipartFile file) throws Exception{

        System.out.println("UploadImgZ-ing");
        if(file!=null) {
            String suffix = file.getContentType().toLowerCase();
            suffix = suffix.substring(suffix.lastIndexOf("/") + 1);
            //找到文件后缀

            String fileName = UUID.randomUUID().toString().replaceAll("-", "")
                    + "." + suffix;
            String ImgFilePath = "D:\\a\\SEProgram\\src\\main\\resources\\static\\img\\zhuanzhendan\\";
            String ImgFilePath2 = "D:\\img\\zhuanzhendan\\";

            Path BillPath = Paths.get(ImgFilePath + fileName);
            file.transferTo(BillPath);
            System.out.println("http://localhost:8888/img/zhuanzhendan/"+fileName);
            return  ("http://localhost:8888/img/zhuanzhendan/"+fileName);
        }
        return null;

    }


    @PostMapping(value = "api/UploadImgF")
    @ResponseBody
    @CrossOrigin
    public String UploadImgF(@RequestBody MultipartFile file) throws Exception{

        System.out.println("UploadImgF-ing");
        if(file!=null) {
            String suffix = file.getContentType().toLowerCase();
            suffix = suffix.substring(suffix.lastIndexOf("/") + 1);
            //找到文件后缀

            String fileName = UUID.randomUUID().toString().replaceAll("-", "")
                    + "." + suffix;
            String ImgFilePath = "D:\\img\\fuwufei\\";


            try {
                Path BillPath = Paths.get(ImgFilePath + fileName);
                file.transferTo(BillPath);
                System.out.println("UploadF successful");
                return (ImgFilePath+fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return  null;
    }


    @PostMapping(value = "api/UploadImgC")
    @ResponseBody
    @CrossOrigin
    public String UploadImgC(@RequestBody MultipartFile file) throws Exception{

        System.out.println("UploadImgC-ing");
        if(file!=null) {


            String suffix = file.getContentType().toLowerCase();
            suffix = suffix.substring(suffix.lastIndexOf("/") + 1);
            //找到文件后缀

            String fileName = UUID.randomUUID().toString().replaceAll("-", "")
                    + "." + suffix;
            String ImgFilePath = "D:\\img\\chufang\\";


            Path BillPath = Paths.get(ImgFilePath + fileName);
            file.transferTo(BillPath);
            return  (ImgFilePath+fileName);
        }
        return null;
    }


    @PostMapping(value = "api/UploadImgY")
    @ResponseBody
    @CrossOrigin
    public String UploadImgY(@RequestBody MultipartFile file) throws Exception{

        System.out.println("UploadImgY-ing");
        if(file!=null) {
            String suffix = file.getContentType().toLowerCase();
            suffix = suffix.substring(suffix.lastIndexOf("/") + 1);
            //找到文件后缀

            String fileName = UUID.randomUUID().toString().replaceAll("-", "")
                    + "." + suffix;
            String ImgFilePath = "D:\\img\\yaofei\\";


            Path BillPath = Paths.get(ImgFilePath + fileName);
            file.transferTo(BillPath);
            return  (ImgFilePath+fileName);
        }
        return null;
    }

    @PostMapping(value = "api/UploadImgG")
    @ResponseBody
    @CrossOrigin
    public String UploadImgG(@RequestBody MultipartFile file) throws Exception{

        System.out.println("UploadImgG-ing");
        if(file!=null) {
            String suffix = file.getContentType().toLowerCase();
            suffix = suffix.substring(suffix.lastIndexOf("/") + 1);
            //找到文件后缀

            String fileName = UUID.randomUUID().toString().replaceAll("-", "")
                    + "." + suffix;
            String ImgFilePath = "D:\\img\\gaizhang\\";


            try {
                Path BillPath = Paths.get(ImgFilePath + fileName);
                System.out.println(BillPath);
                System.out.println(ImgFilePath+fileName);
                System.out.println("1231515151515");
                file.transferTo(BillPath);
                System.out.println("UploadG successful");
                return  (ImgFilePath+fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return  null;
    }

    @PostMapping(value = "api/UploadImgT")
    @ResponseBody
    @CrossOrigin
    public String UploadImgT(@RequestBody MultipartFile file) throws Exception{

        System.out.println("UploadImgT-ing");
        if(file!=null) {
            String suffix = file.getContentType().toLowerCase();
            suffix = suffix.substring(suffix.lastIndexOf("/") + 1);
            //找到文件后缀

            String fileName = UUID.randomUUID().toString().replaceAll("-", "")
                    + "." + suffix;
            String ImgFilePath = "D:\\img\\teshu\\";


            try {
                Path BillPath = Paths.get(ImgFilePath + fileName);
                file.transferTo(BillPath);
                System.out.println("UploadT successful");
                return  (ImgFilePath+fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return  null;
    }

    @PostMapping(value = "api/TemporaryUpload")
    @ResponseBody
    @CrossOrigin
    public Result TemporaryUpload(@RequestBody paramModel param, HttpServletRequest request) {
        /**
         *   用户暂存报销凭证
         */
        HttpSession session = request.getSession();
        user ThisUser =  (user) session.getAttribute("users");
        System.out.println(ThisUser.toString());
        String waishangshuoming = param.getWaishangArr().getWaishangshuoming();
        List<zhuanzhenModel> records = param.getRecords();
        System.out.println(waishangshuoming);
        System.out.println(param.getRecords().get(0).getHosName());
        System.out.println((param.getRecords().get(0).getZhuangzhenImg()));
        System.out.println((param.getRecords().get(0).getFuwufeiArr().get(0).getYishiImg()));
        System.out.println((param.getRecords().get(0).getFuwufeiArr().get(0).getYaofeiArr().get(0).getChufangImg()));
        System.out.println((param.getRecords().get(0).getFuwufeiArr().get(0).getYaofeiArr().get(0).getYaofeiImg()));
     //   int ThisFormId = FormMapper.selectMaxCount()+1;

     //   System.out.println(ThisFormId);


        //存 form
        form ThisForm = new form();
        int FormId = FormMapper.selectMaxCount() + 1;
        ThisForm.setFormId(FormId);
        ThisForm.setFormKind(1);//复议
        ThisForm.setFormText(waishangshuoming);
        String s=param.getWaishangArr().getGaizhangImg();
      //  int L = s.length();
        String GaiZhang = null;
        if(param.getWaishangArr().getGaizhangImg()!=null &&s.length()!=0) {
             GaiZhang = param.getWaishangArr().getGaizhangImg().substring(27, s.length());
        }
        ThisForm.setGaizhangImg(GaiZhang);

        String a = param.getWaishangArr().getTeshuImg();
        //int l = a.length();
        String TesPath =null;
        if(param.getWaishangArr().getTeshuImg()!=null&&a.length()!=0) {
            TesPath = param.getWaishangArr().getTeshuImg().substring(27, a.length());
        }
        ThisForm.setTeshuImg(TesPath);
     //   ThisForm.setHospital(records.get(i).getHosName());
     //   ThisForm.setHospitalDepartment("none");
        ThisForm.setFormTime(new Date());// 复议
        FormMapper.insert(ThisForm);

        //存Record
        //  int ThisFormId = FormMapper.selectMaxCount()+1;
        record ThisRecord = new record();
        int ThisRecordId = RecordMapper.selectMaxCount() + 1;
        //    int RecordId =1;
        ThisRecord.setRecordId(ThisRecordId);
        ThisRecord.setFormId(FormId);
        ThisRecord.setRecordState(1);
        ThisRecord.setRecordTime(new Date()); //获取当前时间
        ThisRecord.setUserId(ThisUser.getUserId());
        RecordMapper.insert(ThisRecord);

        for (int i = 0; i < records.size(); i++) {
            String ChangePath =null;

            String Chan=records.get(i).getZhuangzhenImg();
            if(Chan!=null&&Chan.length()!=0) {
                int length =Chan.length();
                System.out.println(Chan);
                ChangePath = Chan.substring(27, length);
                System.out.println(ChangePath);
            }
            //存Change
            changehospital ThisChange = new changehospital();
            int changeId = ChangeMapper.selectMaxCount() + 1;
            ThisChange.setChangehospitalIn(param.getRecords().get(i).getHosName());
            ThisChange.setChangehospitalOut(null);
            ThisChange.setChangehospitalId(changeId);
            ThisChange.setChangehospitalImage(ChangePath);

            ThisChange.setFormId(FormId);
            ChangeMapper.insert(ThisChange);

            if (1 < 0) {
                return new Result(401);//图片没传过来

            } else {
                for (int j = 0; j < records.get(i).getFuwufeiArr().size(); j++) {//上传挂号图片
                    String Reg = records.get(i).getFuwufeiArr().get(j).getYishiImg();
                    register ThisRe = new register();
                    int ThisRegiserId = (RegisterMapper.selectMaxCount() + 1);
                    ThisRe.setRegisterId(ThisRegiserId);
                    ThisRe.setChangehospitalId(changeId);
                    ThisRe.setRegisterHospital(param.getRecords().get(i).getHosName());
                    ThisRe.setRegisterExplaination(null);
                    ThisRe.setRegisterDepartment(param.getRecords().get(i).getFuwufeiArr().get(j).getOffice());
                    ThisRe.setFormId(FormId);
                    ThisRe.setRegisterCost(param.getRecords().get(i).getFuwufeiArr().get(j).getYishiPay());
                    if(Reg!=null&&Reg.length()!=0) {
                        int len = Reg.length();
                        String RegisterPath = Reg.substring(27, len);
                        System.out.println(RegisterPath);
                        //存Register
                        ThisRe.setRegisterImage(RegisterPath);
                        RegisterMapper.insert(ThisRe);
                    }
                    else{
                        ThisRe.setRegisterImage(null);
                        RegisterMapper.insert(ThisRe);
                    }

                    for (int k = 0; k < records.get(i).getFuwufeiArr().get(j).getYaofeiArr().size(); k++) {//上传bill图片

                        String Bill1 =records.get(i).getFuwufeiArr().get(j).getYaofeiArr().get(k).getYaofeiImg();

                        String BillPath =null;
                        if(Bill1!=null&&Bill1.length()!=0) {
                            int leng = Bill1.length();
                            BillPath = Bill1.substring(27, leng);
                        }

                        String Pre =records.get(i).getFuwufeiArr().get(j).getYaofeiArr().get(k).getChufangImg();
                        String PrescriptionPath =null;

                        if (Pre!=null&&Pre.length()!=0) {
                            int lengt = Pre.length();
                            PrescriptionPath = Pre.substring(27, lengt);
                        }
                        System.out.println(BillPath);
                        System.out.println(PrescriptionPath);
                        try {
                            //存bill
                            bill ThisBill = new bill();
                            ThisBill.setRegisterId(ThisRegiserId);
                            ThisBill.setBillCost(param.getRecords().get(i).getFuwufeiArr().get(j).getYaofeiArr().get(k).getYaofeiPay());
                            ThisBill.setBillPrescriptionImage(PrescriptionPath);
                            ThisBill.setBillImage(BillPath);
                            ThisBill.setBillId(BillMapper.selectMaxCount() + 1);
                            ThisBill.setFormId(FormId);
                            BillMapper.insert(ThisBill);
//                            //存Prescription
//                            prescription ThisPe = new prescription();
//                            ThisPe.setPrescriptionId(PrescriptionMapper.selectMaxCount() + 1);
//                            ThisPe.setPrescriptionImage((PrescriptionPath));
//                            ThisPe.setFormId(FormId);
//                            PrescriptionMapper.insert(ThisPe);
                        } catch (Exception e) {
                            e.printStackTrace();
                            return new Result(402);
                        }
                    }
                }
            }

        }
        return new Result(200); //成功返回200
    }

}
