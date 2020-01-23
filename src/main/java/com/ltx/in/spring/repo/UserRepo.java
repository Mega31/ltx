package com.ltx.in.spring.repo;

import com.ltx.in.spring.model.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserDto, Integer> {
    UserDto findByEmail(String email);
}
