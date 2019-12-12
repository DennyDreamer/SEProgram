package com.se.program.controller;


import com.se.program.LoginTest.Result;
import com.se.program.LoginTest.myInfoForm;
import com.se.program.entities.admin;
import com.se.program.entities.user;
import com.se.program.mapper.adminMapper;
import com.se.program.mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class MyInfoController {
 @Autowired
 userMapper UserMapper;
 @Autowired
 adminMapper AdminMapper;

    @PostMapping(value = "api/UserMyInfo")
    @ResponseBody
    @CrossOrigin

    public myInfoForm userInfo(HttpServletRequest request){
        /**
         *   用户查看个人信息
         */
        HttpSession session = request.getSession();
      ///  System.out.println("1111111111111111111111111111");
        user ThisUser =  (user) session.getAttribute("users");
        int id=ThisUser.getUserId();
        user ReturnUser = UserMapper.selectByPrimaryKey(id);
     //   System.out.println(ThisUser.toString());
     //   System.out.println(ThisUser.getUserPassword());
    //    System.out.println(ThisUser.getUserId());
        myInfoForm a = new myInfoForm(ReturnUser.getUserNumber(),ReturnUser.getUserName(),ReturnUser.getUserSex(),
                ReturnUser.getUserNation(),ReturnUser.getUserIdcard(),ReturnUser.getUserPhone());
     //   System.out.println(a.getIdcard());
     //   System.out.println(a.getNumber());
        return a;
    }

    @PostMapping(value = "api/AdminMyInfo")
    @ResponseBody
    @CrossOrigin
    public admin adminInfo(HttpServletRequest request){
        /**
         *   管理员查看个人信息
         */
        HttpSession session = request.getSession();
        return (admin) session.getAttribute("admins");
    }

    @PostMapping(value = "api/ChangeUserMyInfo")
    @ResponseBody
    @CrossOrigin
    public Result ChangeUserMyInfo(@RequestBody myInfoForm MyInfoForm, HttpServletRequest request){
        /**
         *   用户修改个人信息
         */
        HttpSession session = request.getSession();
        user OldUser =  (user) session.getAttribute("users");


      //  System.out.println("111111111111wwwwwwwwwwwwww");
      //  System.out.println(OldUser.toString());
      //  System.out.println(OldUser.getUserPassword());
      //  System.out.println(OldUser.getUserId());
        System.out.println(MyInfoForm.getPhone());

        if("".equals(MyInfoForm.getPhone())||"".equals(MyInfoForm.getIdcard())||"".equals(MyInfoForm.getName())
        ||"".equals(MyInfoForm.getNation())||"".equals(MyInfoForm.getSex())){

           // System.out.println("55515151515");
            return new Result(401);
        }
//        if(MyInfoForm.getName()==null||MyInfoForm.getNation()==null||MyInfoForm.getIdcard()==null||
//                MyInfoForm.getSex()==null||MyInfoForm.getNumber()==null||MyInfoForm.getPhone()==null){
//            System.out.println("151941515");
//            return new Result(401);
//        }
        if(MyInfoForm.getIdcard().length()!=18){
            //System.out.println("44444444");
            return new Result(402);
        }
        boolean IsString = MyInfoForm.getPhone().matches("\\d+");
        if(IsString==false){
            return new Result(403);
        }
        user NewUser= new user(OldUser.getUserId(),MyInfoForm.getName(),
                MyInfoForm.getSex(),MyInfoForm.getIdcard(),
                MyInfoForm.getNation(),MyInfoForm.getPhone(),
                MyInfoForm.getNumber(),OldUser.getUserPassword(),
                OldUser.getUserState(),1,OldUser.getDepartmentId());
       // System.out.println("222222222222222222222222");
        int ResultCode = UserMapper.updateByPrimaryKey(NewUser);
      //  System.out.println(ResultCode);
      //  System.out.println("3333333333333333333333");
        return new Result(ResultCode);
    }
    @PostMapping(value = "api/ChangeAdminMyInfo")
    @ResponseBody
    @CrossOrigin
    public Result ChangeAdminMyInfo(@RequestBody admin NewAdmin, HttpServletRequest request){
        /**
         *   管理员修改个人信息
         */
      //  HttpSession session = request.getSession();
        // int id = ((user) session.getAttribute("users")).getUserId();
        int ResultCode = AdminMapper.updateByPrimaryKey(NewAdmin);
        return new Result(ResultCode);
    }


}
