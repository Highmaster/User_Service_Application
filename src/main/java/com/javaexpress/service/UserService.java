package com.javaexpress.service;

import com.javaexpress.dto.UserDto;

import java.util.List;

public interface UserService {


    UserDto save(UserDto userDto);
    UserDto findById(Integer userId);
    List<UserDto> findALl();
    UserDto update(Integer userId, UserDto userDto);
    void deleteById(Integer userId);
    UserDto findByUsername(String username);


}
