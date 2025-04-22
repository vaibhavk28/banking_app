package com.banking.exmple_bank.repositories;

import com.banking.exmple_bank.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AccountRepo extends JpaRepository<Account, UUID> {
}
