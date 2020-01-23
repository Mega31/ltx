package com.ltx.in.spring.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeView {
    @RequestMapping("/")
    public String homeView(){
        return "test";
    }

}
