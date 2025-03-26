package com.javaexpress.user_service.service;

import com.javaexpress.user_service.dto.UserDto;

import java.util.List;

public interface UserService {


    UserDto save(UserDto userDto);
    UserDto findById(Integer userId);
    List<UserDto> findALl();
    UserDto update(Integer userId, UserDto userDto);
    void daleteById(Integer userId);
    UserDto findByUsername(String username);
}
