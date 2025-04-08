package com.javaexpress.helper;

import com.javaexpress.dto.CredentialDto;
import com.javaexpress.dto.UserDto;
import com.javaexpress.model.Credential;
import org.springframework.beans.BeanUtils;

public class CredentialMappingHelper {

    public static CredentialDto map(Credential credential) {
        CredentialDto credentialDto = new CredentialDto();
        BeanUtils.copyProperties(credential, credentialDto);

        if(credential.getUser() != null) {
            UserDto userDto = new UserDto();
            BeanUtils.copyProperties(credential.getUser(), userDto);
        }
    }
}
