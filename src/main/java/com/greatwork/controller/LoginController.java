package com.greatwork.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("prototype")
public class LoginController {

    @RequestMapping("/login")
    public String login(Model model){
        System.out.println("进入controller中的demo方法！");
        return "Login.html";
    }
}
