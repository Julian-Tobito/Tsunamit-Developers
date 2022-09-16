package com.example.Empresa.services;

import com.example.Empresa.entities.ListTransaction;
import com.example.Empresa.entities.Transaction;

import java.util.ArrayList;

public class ServiceTransaction {

    private ListTransaction listTransaction;

    public ServiceTransaction() {

        listTransaction=new ListTransaction();
    }

    public ArrayList<Transaction> getListTransaction(){

        return (ArrayList<Transaction>) listTransaction.getListTransaction().clone();

    }

    public Transaction findTransaction(int id){

        return listTransaction.findTrasaction(id);
    }

    public Transaction addTransaction(Transaction transaction){

        return listTransaction.addTransaction(transaction) ? transaction:null;
    }

    public Transaction updateTransaction(Transaction transaction){

        return listTransaction.updateTransaction(transaction);
    }

   public Transaction deleteTransaction(int id){

        return  listTransaction.deleteTransaction(listTransaction.findTrasaction(id));
    }
}
