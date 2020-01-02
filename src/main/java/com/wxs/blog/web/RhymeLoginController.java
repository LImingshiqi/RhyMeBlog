package com.wxs.blog.web;

import com.wxs.blog.entity.RhymeUser;
import com.wxs.blog.server.RhymeLoginServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Controller
public class RhymeLoginController {

    @Autowired
    RhymeLoginServer rhymeLoginServer;


    @RequestMapping("login")
    public String login(HttpServletRequest request, HttpServletResponse response,
                        @RequestParam String phone, @RequestParam String password){
        RhymeUser user = rhymeLoginServer.findUserTologin(phone, password);
        if (user!=null){
            request.getSession().setAttribute("userList",user);
            return "index";
        }else {
            log.info("用户不存在");
            return "";
        }
    }

    

}
