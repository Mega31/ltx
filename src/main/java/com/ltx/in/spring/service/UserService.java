package com.ltx.in.spring.service;

import com.ltx.in.spring.model.UserDto;
import com.ltx.in.spring.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public UserDto findByEmail(String email){
        return userRepo.findByEmail(email);
    }
    public void saveUserData(UserDto userDto){
        userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
        userRepo.save(userDto);
    }
}
