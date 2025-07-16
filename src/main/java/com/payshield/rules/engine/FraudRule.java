package com.payshield.rules.engine;

import com.payshield.model.entity.Transaction;

public interface FraudRule {
    boolean isFraudulent(Transaction transaction);
    String getReason();  // Reason for alert if fraud detected
}
