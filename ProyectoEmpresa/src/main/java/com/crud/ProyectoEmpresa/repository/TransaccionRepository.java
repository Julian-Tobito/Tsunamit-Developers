package com.crud.ProyectoEmpresa.repository;

import com.crud.ProyectoEmpresa.model.Empresa;
import com.crud.ProyectoEmpresa.model.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaccionRepository extends JpaRepository<Transaccion, Long> {


}
