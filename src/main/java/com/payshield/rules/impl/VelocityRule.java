package com.payshield.rules.impl;

import com.payshield.model.entity.Transaction;
import com.payshield.repository.TransactionRepository;
import com.payshield.rules.engine.FraudRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VelocityRule implements FraudRule {
    @Autowired
    private TransactionRepository transactionRepository;

    private static final long TIME_WINDOW_MILLIS = 60 * 1000; // 1 minute
    private static final int MAX_TX_PER_MINUTE = 3;

    @Override
    public boolean isFraudulent(Transaction tx) {
        long currentTime = System.currentTimeMillis();
        long windowStart = currentTime - TIME_WINDOW_MILLIS;
        int count = transactionRepository.countByUserIdAndTimestampBetween(
                tx.getuserId(), windowStart, currentTime
        );
        return count >= MAX_TX_PER_MINUTE;
    }

    @Override
    public String getReason() {
        return "High frequency of transactions in a short time.";
    }
}
