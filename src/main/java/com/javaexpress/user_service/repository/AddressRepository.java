package com.javaexpress.user_service.repository;

import com.javaexpress.user_service.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository  extends JpaRepository<Address, Integer> {
}
