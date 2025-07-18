package com.payshield.repository;

import com.payshield.model.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    int countByUserIdAndTimestampBetween(Long userId, Long from, Long to);


}
