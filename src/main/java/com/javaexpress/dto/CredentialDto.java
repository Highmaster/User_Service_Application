package com.javaexpress.user_service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.javaexpress.user_service.model.RoleBasedAuthority;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class CredentialDto {

    private Integer credentialId;
    private String username;
    private String password;
    private RoleBasedAuthority roleBasedAuthority;
    private Boolean isEnabled;
    private Boolean isAccountNonExpired;
    private Boolean isAccountNonLocked;
    private Boolean isCredentialsNonExpired;

    @JsonProperty("User")
    private UserDto userDto;
}
