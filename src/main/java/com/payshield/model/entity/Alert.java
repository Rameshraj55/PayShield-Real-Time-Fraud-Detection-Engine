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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public AlertStatus getStatus() {
        return status;
    }

    public void setStatus(AlertStatus status) {
        this.status = status;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }
}
