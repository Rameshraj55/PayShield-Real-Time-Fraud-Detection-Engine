package com.payshield.service;

import com.payshield.model.entity.Alert;
import com.payshield.model.entity.Transaction;
import com.payshield.model.enums.AlertStatus;
import com.payshield.rules.engine.FraudRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraudDetectionService {

    @Autowired
    private List<FraudRule> fraudRules;

    @Autowired
    private AlertService alertService;

    public void evaluateTransaction(Transaction transaction) {
        for (FraudRule rule : fraudRules) {
            if (rule.isFraudulent(transaction)) {
                Alert alert = new Alert();
                alert.setTransactionId(transaction.getId());
                alert.setReason(rule.getReason());
                alert.setStatus(AlertStatus.PENDING);
                alert.setCreatedAt(System.currentTimeMillis());
                alertService.saveAlert(alert);
                break;
            }
        }
    }
}
