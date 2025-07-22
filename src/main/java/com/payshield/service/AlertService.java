package com.payshield.service;

import com.payshield.model.entity.Alert;
import com.payshield.repository.AlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlertService {

    @Autowired
    private AlertRepository alertRepository;

    public Alert getAlertById(Long id){
        Optional<Alert> alert = alertRepository.findById(id);
        return alert.get();
    }

    public void deleteAlert(Long id){
        alertRepository.deleteById(id);
    }

    public Alert saveAlert(Alert alert) {
        return alertRepository.save(alert);
    }

    public List<Alert> getAllAlerts() {
        return alertRepository.findAll();
    }
}
