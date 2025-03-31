package com.javaexpress.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class UserDto {

    private Integer userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    @JsonProperty("credential")
    @JsonInclude(value= JsonInclude.Include.NON_NULL)
    private CredentialDto credentialDto;

}
