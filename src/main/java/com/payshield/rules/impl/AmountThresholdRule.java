package com.payshield.rules.impl;

import com.payshield.model.entity.Transaction;
import com.payshield.rules.engine.FraudRule;
import org.springframework.stereotype.Component;

@Component
public class AmountThresholdRule implements FraudRule {

    private static final double MAX_ALLOWED_AMOUNT = 100000.00;

    @Override
    public boolean isFraudulent(Transaction tx) {
        return tx.getAmount() > MAX_ALLOWED_AMOUNT;
    }

    @Override
    public String getReason() {
        return "Transaction amount exceeds the permitted threshold.";
    }
}
