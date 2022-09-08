package udea.sprint3.demo.controllers;


import org.springframework.web.bind.annotation.*;
import udea.sprint3.demo.entities.Transaction;
import udea.sprint3.demo.services.ServiceTransaction;

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
