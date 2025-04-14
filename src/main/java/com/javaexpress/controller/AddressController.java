package com.javaexpress.controller;


import com.javaexpress.dto.AddressDto;
import com.javaexpress.service.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/api/address"})
@Slf4j
public class AddressController {

    private AddressService addressService;

    public AddressDto save(@RequestBody AddressDto addressDto) {
        return addressService.save(addressDto);
    }
}
