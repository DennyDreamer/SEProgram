package com.se.program.controller;


import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @PostMapping(value = "????")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session){
        if(!StringUtils.isEmpty(username)&&(true)){//查询数据库中是否有该用户

            map.put("msg","该用户不存在");
            return"login";
        }

        else if(!StringUtils.isEmpty((username))&& password.equals("000000"))
        {//查询数据库中用户密码
        map.put("msg","用户名密码错误");
        return "login";
        }

        else{
            session.setAttribute("loginUser",username);
            session.setAttribute("User_pri",username);//读取用户权限。
            switch (username){//从数据库中读取用户权限
                case "user":
                    return"redirect:/user.html";
                case "checker":
                    return "redirect:/checker.html";
                case "receiver":
                    return "redirect:/receiver.html";
                case "checker_admin":
                    return "redirect:/checker_admin.html";
                case "admin":
                    return "redirect:/admin.html";
                default:
                    return "redirect:/user.html";
            }

        }
    }
}
