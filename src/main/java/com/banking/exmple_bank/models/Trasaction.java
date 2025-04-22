package com.banking.exmple_bank.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "transactions")
public class Trasaction {
    @Id
    @GeneratedValue
    private UUID transactionId;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @ManyToOne
    @JoinColumn(name = "from_account_id")
    private Account fromAccount;

    @ManyToOne
    @JoinColumn(name = "to_account_id")
    private Account toAccount;

    private LocalDateTime transactionTimeStamp;

    private String issuer;

    private BigDecimal transactionAmount;

    private String transactionMode;

    @Enumerated(EnumType.STRING)
    private TransactionStatus transactionStatus;

    public enum TransactionType {
        DEPOSIT, WITHDRAWAL, TRANSFER, PAYMENT, REFUND
    }

    public enum TransactionStatus {
        PENDING, COMPLETED, FAILED, CANCELED, REVERSED
    }
}
