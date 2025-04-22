package com.banking.exmple_bank.repositories;

import com.banking.exmple_bank.models.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CardRepo extends JpaRepository<Card, UUID> {
}
