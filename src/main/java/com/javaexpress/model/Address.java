package com.javaexpress.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Builder
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String fullAddress;
    private String postalCode;
    private String city;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
