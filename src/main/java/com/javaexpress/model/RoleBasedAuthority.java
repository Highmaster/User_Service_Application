package com.javaexpress.model;

import lombok.Getter;

@Getter



public enum RoleBasedAuthority {

    ROLE_USER("USER"),
    ROLE_ADMIN("ADMIN");

    private final String role;

    RoleBasedAuthority(String role) {
        this.role = role;
    }

}
