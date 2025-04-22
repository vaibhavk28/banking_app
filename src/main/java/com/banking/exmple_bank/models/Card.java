package com.banking.exmple_bank.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="cards")
public class Card {
    @Id
    @GeneratedValue
    private UUID id;
    private String cardName;
    private String cardNumber;
    private String cvv;
    private LocalDate expDate;
    private LocalDate issueDate;
    private String pin;
    private BigDecimal withdrawalLimit;
    private BigDecimal spendLimit;

    @Enumerated(EnumType.STRING)
    private CardType cardType;

    public enum CardType {
        DEBIT, CREDIT
    }
}

