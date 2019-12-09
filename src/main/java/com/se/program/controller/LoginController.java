package com.se.program.controller;


import com.se.program.LoginTest.LoginUsers;
import com.se.program.LoginTest.Result;
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
public class LoginController {

    @Autowired
    userMapper UserMapper;
    @Autowired
    adminMapper AdminMapper;

    @PostMapping(value = "api/login")
    @ResponseBody
    @CrossOrigin
    public Result login(@RequestBody LoginUsers LoginUser, HttpServletRequest request) {
        /**
         *   用户登录
         */
        HttpSession session = request.getSession(true);
        String number = (LoginUser.getUsername());
        String password = LoginUser.getPassword();
        int admin_id = Integer.parseInt(number);

        int id = UserMapper.selectIdByUserNumber(number);

        //   System.out.println(UserMapper.selectByPrimaryKey(1).getPassword());

        user User = UserMapper.selectByPrimaryKey(id);
        admin Admin = AdminMapper.selectByPrimaryKey(admin_id);
        if ( Admin== null) {
            if (User == null) {
                return new Result(400);
                //用户不存在
            } else {
                if(User.getUserPassword().equals(password)) {
                    session.setAttribute("users",User);
                    user ThisUser =  (user) session.getAttribute("users");
                    System.out.println(ThisUser.toString());

              //      System.out.println(ThisUser.getUserId());
                    return new Result(200); //用户登录成功，返回201
                }
                else {
                    return new Result(300); //用户名密码错误
                }
            }
        }
        else {
            if(Admin.getAdminPassword().equals(password)) {
                session.setAttribute("admins",Admin);
                switch (Admin.getAdminPermission()) {
                    //  管理员用户密码正确，查看权限
                    case 1: //系统管理员
                        return new Result(201);
                    case 2: //审核负责人
                        return new Result(203);
                    case 3: //审核人
                        return new Result(202);
                    case 4: //收单员
                        return new Result(204);
                    default: //其他，返回错误
                        return new Result(600);
                }
            }

            else {
                return new Result(300); //管理员用户密码错误
            }
        }
    }
}
