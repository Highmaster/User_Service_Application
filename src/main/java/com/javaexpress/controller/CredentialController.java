package com.javaexpress.controller;

import com.javaexpress.dto.CredentialDto;
import com.javaexpress.service.CredentialServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/credentials")
public class CredentialController {

    @Autowired
    private CredentialServiceImpl credentialServiceImpl;

    @GetMapping("username/{uname}")
//    @ResponseStatus(code = HttpStatus.OK)
    public ResponseEntity<CredentialDto> findByUsername(@PathVariable("uname") String username){
        CredentialDto result = credentialServiceImpl.findByUsername(username);
        return ResponseEntity.ok(result);

    }
}
