package com.crud.ProyectoEmpresa.repository;

import com.crud.ProyectoEmpresa.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository <Empleado, Long>{



}
