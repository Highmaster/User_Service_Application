package com.javaexpress.repository;

import com.javaexpress.model.Credential;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CredentialRepository  extends JpaRepository<Credential, Integer>   {
}
