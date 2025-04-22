package com.banking.exmple_bank.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "banks")
public class Bank {
    @Id
    @GeneratedValue
    private UUID id;

    private String bankName;

    private String ifscCode;

    private BigDecimal withdrawalLimit;

    private BigDecimal depositLimit;

    private BigDecimal bankBalance;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private BankServiceProvided bankServiceProvided;

    private BigDecimal minimumBalanceAllowed;

    @OneToMany
    @JoinColumn(name="account_id")
    private Set<Account> accounts;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="admin_id")
    private Set<Admin> admins;

    public enum BankServiceProvided {
        PERSONAL_BANKING, INTERNATIONAL_BANKING, LOAN_SERVICES
    }
}
