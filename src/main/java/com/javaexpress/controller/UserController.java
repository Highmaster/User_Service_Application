package com.javaexpress.controller;

import com.javaexpress.dto.UserDto;
import com.javaexpress.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value ="/api/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserDto> save(@RequestBody UserDto userDto) {
        log.info("UserController :: save");
        UserDto dbUser = userService.save(userDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(dbUser);
    }

    @GetMapping("{userId}")
    public ResponseEntity<UserDto> findById(@PathVariable Integer userId) {
        log.info("UserController :: fetch user details");
        return ResponseEntity.ok(userService.findById(userId));
    }
}
