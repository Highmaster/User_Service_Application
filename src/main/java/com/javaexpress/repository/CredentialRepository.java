package com.javaexpress.repository;

import com.javaexpress.model.Credential;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CredentialRepository  extends JpaRepository<Credential, Integer>   {

   // @Override
    Optional<Credential> findByUsername(String username);
}
