package com.batch.traitementbatch.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Transaction {
    @Id
    private int idTransaction;
    private double montant;
    private Date dateTransaction;
    private Date dateDebit;
    @ManyToOne
    private Compte compte;

    public Transaction() {
    }

    public Transaction(int idTransaction, double montant, Date dateTransaction, Date dateDebit, Compte compte) {
        this.idTransaction = idTransaction;
        this.montant = montant;
        this.dateTransaction = dateTransaction;
        this.dateDebit = dateDebit;
        this.compte = compte;
    }

    public Transaction(TransactionClient transactionClient) {
        this.idTransaction = transactionClient.getIdTransaction();
        this.montant = transactionClient.getMontant();
        this.dateTransaction = transactionClient.getDateTransaction();
        this.dateDebit =new Date();
    }

    public int getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(int idTransaction) {
        this.idTransaction = idTransaction;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(Date dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public Date getDateDebit() {
        return dateDebit;
    }

    public void setDateDebit(Date dateDebit) {
        this.dateDebit = dateDebit;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }
}
