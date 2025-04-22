package com.banking.exmple_bank.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Admins")
public class Admin {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    private String emailAddress;

    private String phoneNumber;

    private String aadhaarNumber;

    private String panNumber;

    @OneToOne
    @JoinColumn(name="address_id")
    private Address address;
}
