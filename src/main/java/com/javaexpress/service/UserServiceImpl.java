package com.javaexpress.service;

import com.javaexpress.dto.UserDto;
import com.javaexpress.helper.UserMappingHelper;
import com.javaexpress.model.User;
import com.javaexpress.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto save(UserDto userDto)   {
        User user = UserMappingHelper.map(userDto);
        log.info("user {}", user);
        User dbuser = userRepository.save(user);
       // UserDto result = UserMappingHelper.map(dbuser);
        return null;
    }

    @Override
    public UserDto findById(Integer userId) {
        return userRepository.findById(userId)
                .map(UserMappingHelper::map)
                .orElseThrow(()-> new RuntimeException("User not found in Db"));
    }

    @Override
    public List<UserDto> findALl() {
        return userRepository.findAll().stream()
                .map(UserMappingHelper::map)
                .sorted(Comparator.comparing(UserDto::getUserId))
                .collect((Collectors.toList()));
    }

    @Override
    public UserDto update(Integer userId, UserDto userDto) {
        return null;
    }

    @Override
    public void deleteById(Integer userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public UserDto findByUsername(String username) {
        return null;
    }
}
