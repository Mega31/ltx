package com.ltx.in.spring.view;

import com.ltx.in.spring.model.UserDto;
import com.ltx.in.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegView {
    @Autowired
    private UserService userService;

    @RequestMapping(name = "/reg",method = RequestMethod.GET)
    public String processingRegView(Model model){
        UserDto userDto = new UserDto();
        model.addAttribute("UserDto",userDto);
        return "reg";
    }
    @RequestMapping(name = "/reg",method = RequestMethod.POST)
    public String userCreation(UserDto userDto){
        userService.saveUserData(userDto);
        return "redirect:/";
    }
}
