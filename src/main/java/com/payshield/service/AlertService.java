package com.payshield.service;

import com.payshield.model.entity.Alert;
import com.payshield.repository.AlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlertService {

    @Autowired
    private AlertRepository alertRepository;

    public Alert saveAlert(Alert alert) {
        return alertRepository.save(alert);
    }
}
