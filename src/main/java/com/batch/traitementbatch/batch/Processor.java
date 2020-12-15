package com.batch.traitementbatch.batch;

import com.batch.traitementbatch.bean.Compte;
import com.batch.traitementbatch.bean.Transaction;
import com.batch.traitementbatch.bean.TransactionClient;
import com.batch.traitementbatch.repo.CompteRepo;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Processor implements ItemProcessor<TransactionClient, Transaction> {
    @Autowired
    private CompteRepo compteRepo;
    @Override
    public Transaction process(TransactionClient transactionClient) throws Exception {
        Compte compteClient=this.compteRepo.findById(transactionClient.getIdCompte()).get();
        Transaction transaction=new Transaction(transactionClient);
        transaction.setCompte(compteClient);
        return transaction;
    }
}
