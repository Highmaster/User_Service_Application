package com.javaexpress.user_service.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Builder
public class Address {

    private Integer addressId;
    private String fullAddress;
    private String postalCode;
    private String city;
}
