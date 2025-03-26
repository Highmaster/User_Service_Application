package com.javaexpress.user_service.repository;

import com.javaexpress.user_service.model.Credential;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CredentialRepository  extends JpaRepository<Credential, Integer>   {
}
