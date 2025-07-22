package com.payshield.service;

import com.payshield.model.dto.TransactionRequest;
import com.payshield.model.entity.Transaction;
import com.payshield.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction saveTransaction(TransactionRequest transactionRequest) {
        Transaction transaction = new Transaction();
        transaction.setAmount(transactionRequest.getAmount());
        transaction.setReceiverAccount(transactionRequest.getReceiverAccount());
        transaction.setLocation(transactionRequest.getLocation());
         return transactionRepository.save(transaction);
    }

    public Transaction getTransactionById(Long id) {
        return transactionRepository.findById(id).orElse(null);
    }
}
