package com.banking.exmple_bank.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="addresses")
public class Address {
    @Id
    @GeneratedValue
    private UUID id;

    private String address_name;
    private String street_name;
    private String city_name;
    private String state_name;
    private String country_name;
    private Integer pin_code;

}
