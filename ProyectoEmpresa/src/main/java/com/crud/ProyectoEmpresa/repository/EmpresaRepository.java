package com.crud.ProyectoEmpresa.repository;

import com.crud.ProyectoEmpresa.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {



}
