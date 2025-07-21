package com.payshield.controller;

import com.payshield.model.dto.TransactionRequest;
import com.payshield.model.entity.Transaction;
import com.payshield.service.FraudDetectionService;
import com.payshield.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @Autowired
    private FraudDetectionService fraudDetectionService;

    @PostMapping
    public ResponseEntity<?> processTransaction(@RequestBody TransactionRequest request) {
        Transaction savedTx = transactionService.saveTransaction(request);
        boolean isFraud = fraudDetectionService.evaluateTransaction(savedTx);
        return ResponseEntity.ok("Transaction processed. Fraud status: " + isFraud);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transaction> getTransactionById(@PathVariable Long id) {
        return ResponseEntity.ok(transactionService.getTransactionById(id));
    }

}
