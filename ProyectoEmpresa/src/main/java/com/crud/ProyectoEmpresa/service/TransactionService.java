package com.crud.ProyectoEmpresa.service;

import com.crud.ProyectoEmpresa.model.Transaction;
import com.crud.ProyectoEmpresa.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired // anotación para especificarle a springboot que acá estoy haciendo Inyección de Dependencias
    private TransactionRepository transactionRepository;

    //constructor
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    //método para visualizar a partir del GET
    public List<Transaction> getAllTransactions(){

        return transactionRepository.findAll();
    }

    //método para crear a partir del POST
    public Transaction addTransaction(Transaction transaction){

        return transactionRepository.save(transaction);
    }

    //GET para una sola transacción
    public Transaction findTransactionById(Long id ){
        Optional<Transaction> optTransaction = transactionRepository.findById(id);
        if( optTransaction.isPresent()){

            return optTransaction.get();
        }

        return null;
    }

    //método para editar o actualizar a partir del PATCH
    /***
     * Permite actualizar un objeto
     * Precondicion: El objeto existe
     * Poscondicion: si existe se modifica
     * @param transaction referencia del objeto que se actualiza
     * @return objeto actualizado
     */
    public Transaction updateTransaction( Transaction transaction ){
        return transactionRepository.save(transaction);
    }

    //método para eliminar
    /***
     * Permite eliminar un objeto
     * precondicion: el objeto existe
     * Poscondicion: si existe se elimina
     * @param transaction referencia del objeto que se elimina
     * @return objeto eliminado
     */

    public void deleteTransaction( Transaction transaction){

        transactionRepository.delete(transaction);
    }

    public List<Transaction> getTransactionsEnterprise(Long id){

        return transactionRepository.getTransactionsEnterprise(id);
    }

}
