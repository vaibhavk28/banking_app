package com.banking.exmple_bank.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "accounts")
public class Account {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(unique = true)
    private Long account_number;

    private String account_holder;

    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    private Float balance;
    private Boolean isActive;
    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(updatable = false)
    private LocalDateTime updatedAt;

    private LocalDateTime closedAt = null;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany
    @JoinColumn(name="card_id")
    private Set<Card> cards;

    public void closeAccount() {
        this.isActive = false;
        this.closedAt = LocalDateTime.now();
    }

    public enum AccountType {
        SAVINGS, CURRENT
    }
}
