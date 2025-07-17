package com.payshield.rules.impl;

import com.payshield.model.entity.Transaction;
import com.payshield.rules.engine.FraudRule;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@Component
public class NightTimeRule implements FraudRule {
    @Override
    public boolean isFraudulent(Transaction tx) {
        ZonedDateTime zdt = Instant.ofEpochMilli(tx.getTimestamp()).atZone(ZoneId.of("Asia/Kolkata"));
        int hour = zdt.getHour();
        return hour >= 1 && hour <= 4; // Unusual hours
    }

    @Override
    public String getReason() {
        return "Transaction attempted during suspicious nighttime hours.";
    }
}
