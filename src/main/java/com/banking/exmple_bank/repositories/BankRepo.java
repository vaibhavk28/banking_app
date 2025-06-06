package com.banking.exmple_bank.repositories;

import com.banking.exmple_bank.models.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BankRepo extends JpaRepository<Bank, UUID> {
}
