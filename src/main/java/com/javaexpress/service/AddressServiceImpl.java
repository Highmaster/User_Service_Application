package com.javaexpress.service;

import com.javaexpress.dto.AddressDto;
import com.javaexpress.helper.AddressMappingHelper;
import com.javaexpress.model.Address;
import com.javaexpress.model.User;
import com.javaexpress.repository.AddressRepository;
import com.javaexpress.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AddressServiceImpl implements AddressService{

    @Autowired
    private AddressRepository addressRepository;

    private UserRepository userRepository;

    @Override
    public AddressDto save(AddressDto addressDto) {

        Integer userId = addressDto.getUserDto().getUserId();
        User dbUser =  userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User Not Found"));
        Address address = AddressMappingHelper.map(addressDto);
        address.setUser(dbUser);
        Address dbaddress = addressRepository.save(address);

        return AddressMappingHelper.map(dbaddress);

        return null;
    }

    @Override
    public AddressDto findById(Integer addressId) {
        return null;
    }
}
