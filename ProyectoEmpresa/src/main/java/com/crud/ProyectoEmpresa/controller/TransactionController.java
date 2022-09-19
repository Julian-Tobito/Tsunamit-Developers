package com.crud.ProyectoEmpresa.controller;

import com.crud.ProyectoEmpresa.model.Transaction;
import com.crud.ProyectoEmpresa.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/transaction")
@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    //constructor

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public List<Transaction> getAllTransactions(){
        return transactionService.getAllTransactions();
    }

    @PostMapping
    public Transaction addTransaction(@RequestBody Transaction transaction){

        return transactionService.addTransaction(transaction);
    }

    @GetMapping("/{id}")
    public Transaction findTransactionById(@PathVariable Long id ){

        return transactionService.findTransactionById(id);
    }

    @PatchMapping("/{id}")
    public Transaction updateTransaction(@RequestBody Transaction transaction){

        if ( transactionService.findTransactionById(transaction.getId()) != null ){
            return transactionService.updateTransaction(transaction);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public Transaction deleteTransaction( @PathVariable Long id ){

        Transaction transaction = transactionService.findTransactionById(id);

        if( transaction != null){
            transactionService.deleteTransaction(transaction);

            return transaction;
        }

        return null;
    }

    @GetMapping("/getTransactionsEnterprise/{id}")
    public List<Transaction> getTransactionsEnterprise(@PathVariable Long id){

        return transactionService.getTransactionsEnterprise(id);
    }

}
