package com.javaexpress.user_service.service;

import com.javaexpress.user_service.dto.UserDto;
import com.javaexpress.user_service.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;

    @Override
    public UserDto save(UserDto userDto) {
        return null;
    }

    @Override
    public UserDto findById(Integer userId) {
        return null;
    }

    @Override
    public List<UserDto> findALl() {
        return List.of();
    }

    @Override
    public UserDto update(Integer userId, UserDto userDto) {
        return null;
    }

    @Override
    public void daleteById(Integer userId) {

    }

    @Override
    public UserDto findByUsername(String username) {
        return null;
    }
}
