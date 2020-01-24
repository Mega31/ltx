package com.ltx.in.spring.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginView {
    @RequestMapping("/login")
    public String loginView(){
        return "login";
    }
}
