package com.ltx.in.spring.repo;

import com.ltx.in.spring.model.UserDto;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserDto,> {
}
