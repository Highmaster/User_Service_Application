package com.javaexpress.service;

import com.javaexpress.dto.AddressDto;
import com.javaexpress.repository.AddressRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AddressServiceImpl implements AddressService{

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public AddressDto save(AddressDto addressDto) {
        return null;
    }

    @Override
    public AddressDto findById(Integer addressId) {
        return null;
    }
}
