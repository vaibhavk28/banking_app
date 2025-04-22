package com.banking.exmple_bank.DTO;

import com.banking.exmple_bank.models.Account;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Data
public class AccountDTO {

    private UUID id;

    private Long account_number;

    private String account_holder;

    private Account.AccountType accountType;

    private Float balance;
    private Boolean isActive;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime closedAt = null;

    private CustomerDTO customer;

    private Set<CardDTO> cards;
}
