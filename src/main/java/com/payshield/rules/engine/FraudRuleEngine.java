package com.payshield.rules.engine;

import com.payshield.model.entity.Alert;
import com.payshield.model.entity.Transaction;
import com.payshield.model.enums.AlertStatus;
import com.payshield.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FraudRuleEngine {

    @Autowired
    private List<FraudRule> fraudRules;

    @Autowired
    private AlertService alertService;

    public void evaluate(Transaction transaction) {
        for (FraudRule rule: fraudRules) {
            if (rule.isFraudulent(transaction)){
                Alert alert = new Alert();
                alert.setTransactionId(transaction.getuserId());
                alert.setReason(rule.getReason());
                alert.setStatus(AlertStatus.PENDING);
                alert.setCreatedAt(System.currentTimeMillis());
                alertService.saveAlert(alert);
                break; // Stop on first fraud detected
            }
        }
    }
}
