package com.banking.exmple_bank.repositories;

import com.banking.exmple_bank.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AddressRepo extends JpaRepository<Address, UUID> {
}
