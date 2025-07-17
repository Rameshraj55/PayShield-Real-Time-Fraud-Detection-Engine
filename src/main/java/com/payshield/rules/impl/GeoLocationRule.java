package com.payshield.rules.impl;

import com.payshield.model.entity.Transaction;
import com.payshield.rules.engine.FraudRule;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class GeoLocationRule implements FraudRule {
    private final List<String> riskyCountries = Arrays.asList("CountryA", "CountryB", "CountryC");

    @Override
    public boolean isFraudulent(Transaction tx) {
        return riskyCountries.contains(tx.getLocation());
    }

    @Override
    public String getReason() {
        return "Transaction originated from a high-risk country.";
    }
}
