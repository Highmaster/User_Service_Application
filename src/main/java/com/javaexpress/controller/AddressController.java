package com.javaexpress.controller;


import com.javaexpress.dto.AddressDto;
import com.javaexpress.service.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = {"/api/address"})
@Slf4j
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping
    public AddressDto save(@RequestBody AddressDto addressDto) {
        return addressService.save(addressDto);
    }

    public AddressDto findById(@PathVariable Integer addressId) {
        return addressService.findById(addressId);
    }
}
