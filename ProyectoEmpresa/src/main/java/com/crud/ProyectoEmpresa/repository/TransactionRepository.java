package com.crud.ProyectoEmpresa.repository;

import com.crud.ProyectoEmpresa.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    //obtiene todas las transacciones de una empresa
    @Query(value = "select transaction from Transaction transaction where transaction.employee.enterprise.id=:id")
    List<Transaction> getTransactionsEnterprise(Long id);
}
