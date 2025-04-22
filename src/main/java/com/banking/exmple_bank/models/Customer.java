package com.banking.exmple_bank.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="customers")
public class Customer {
    @Id
    @GeneratedValue
    private UUID id;

    private String customerName;
    private String phoneNumber;
    @Column(unique = true)
    private String aadhaar_number;
    @Column(unique = true)
    private String pan_number;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany
    @JoinColumn(name="account_id")
    private Set<Account> accounts;
}
