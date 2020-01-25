package com.ltx.in.spring.controller;

import com.ltx.in.spring.model.UserEntity;
import com.ltx.in.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/reg",method = RequestMethod.GET)
    public String processingRegView(Model model){
        UserEntity userEntity = new UserEntity();
        model.addAttribute("UserEntity",userEntity);
        return "reg";
    }
    @RequestMapping(value = "/reg",method = RequestMethod.POST)
    public String userCreation(UserEntity userEntity){
        userService.saveUserData(userEntity);
        return "redirect:/";
    }
}
