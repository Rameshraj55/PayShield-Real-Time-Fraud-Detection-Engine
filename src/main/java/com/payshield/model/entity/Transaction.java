package com.payshield.model.entity;

import com.payshield.model.enums.PaymentMethod;

public class Transaction {
    private Long id;
    private String senderAccount;
    private String receiverAccount;
    private double amount;
    private PaymentMethod paymentMethod;
    private String location;
    private long timestamp;

    public Transaction() {}

    // Getters & Setters
}
