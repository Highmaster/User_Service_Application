package com.javaexpress.user_service.model;

public enum RoleBasedAuthority {
    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER");

    private final String role;

    // Constructor to accept the role string
    RoleBasedAuthority(String role) {
        this.role = role;
    }

    // Getter to retrieve the role
    public String getRole() {
        return role;
    }
}
