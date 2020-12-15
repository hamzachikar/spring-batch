package com.batch.traitementbatch.batch;

import com.batch.traitementbatch.bean.Compte;
import com.batch.traitementbatch.bean.Transaction;
import com.batch.traitementbatch.repo.CompteRepo;
import com.batch.traitementbatch.repo.TransactionRepo;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class DBWriter implements ItemWriter<Transaction> {
    @Autowired
    private TransactionRepo transactionRepo;
    @Autowired
    private CompteRepo compteRepo;
    @Override
    public void write(List<? extends Transaction> list) throws Exception {
        System.out.println("data saving writter saving ......");
        for(Transaction transaction:list){
            Compte compte=transaction.getCompte();
            compte.setSolde(compte.getSolde()-transaction.getMontant());
            this.compteRepo.save(compte);
            transaction.setCompte(compte);
            transactionRepo.save(transaction);
        }
        System.out.println("done");
    }
}
