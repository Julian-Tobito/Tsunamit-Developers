package com.example.Empresa.controllers;


import org.springframework.web.bind.annotation.*;
import com.example.Empresa.entities.Transaction;
import com.example.Empresa.services.ServiceTransaction;

import java.util.ArrayList;

@RestController
@RequestMapping("/enterprises/movements")
public class ControllersTransaction {

    private ServiceTransaction service;

    public ControllersTransaction() {

        service= new ServiceTransaction();
    }

    @GetMapping
    public ArrayList<Transaction> getAllTransaction(){

        return service.getListTransaction();
    }

    @PostMapping
    public Transaction addTransaction(@RequestBody Transaction transaction){

        return service.addTransaction(transaction);
    }

    @GetMapping("/{id}")
    public Transaction getTransaction(@PathVariable int id){

        return service.findTransaction(id);
    }

    @PatchMapping("/{id}")
    public Transaction updateTransaction(@RequestBody Transaction transaction){

        return service.updateTransaction(transaction);
    }

    @DeleteMapping("/{id}")
    public Transaction deleteTransaction(@PathVariable int id){

        return service.deleteTransaction(id);
    }
}
