package com.crud.ProyectoEmpresa.repository;

import com.crud.ProyectoEmpresa.model.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterpriseRepository extends JpaRepository<Enterprise, Long> {



}
