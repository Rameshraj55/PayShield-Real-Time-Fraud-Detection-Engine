package com.payshield.model.entity;

import com.payshield.model.enums.AlertStatus;

public class Alert {
    private Long id;
    private Long transactionId;
    private String reason;
    private AlertStatus status;
    private long createdAt;

    public Alert() {}

    // Getters & Setters
}
