package com.javaexpress.service;

import com.javaexpress.dto.CredentialDto;
import com.javaexpress.helper.CredentialMappingHelper;
import com.javaexpress.model.Credential;
import com.javaexpress.repository.CredentialRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
 @Slf4j

public class CredentialServiceImpl {

    @Autowired
    private CredentialRepository credentialRepository;

    public CredentialDto findByUsername(String username) {
        Optional<Credential> optional = credentialRepository.findByUsername(username);
        if(optional.isPresent()) {
            Credential dbCredential = optional.get();
            return CredentialMappingHelper.map(dbCredential);
        } else {
            throw new RuntimeException("Username not found in Db");
        }
    }
}
