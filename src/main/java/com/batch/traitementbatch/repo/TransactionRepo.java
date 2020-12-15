package com.batch.traitementbatch.repo;

import com.batch.traitementbatch.bean.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepo extends JpaRepository<Transaction,Integer> {
}
