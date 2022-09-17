package com.crud.ProyectoEmpresa.controller;

import com.crud.ProyectoEmpresa.model.Empleado;
import com.crud.ProyectoEmpresa.model.Empresa;
import com.crud.ProyectoEmpresa.service.EmpleadoService;
import com.crud.ProyectoEmpresa.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    //constructor
    public EmpleadoController(EmpleadoService empleadoService) {

        this.empleadoService = empleadoService;
    }

    @PostMapping("/empleado") //hacer una petición POST
    public Empleado crearEmpleado(@RequestBody Empleado empleado){
        return this.empleadoService.crearEmpleado(empleado);
    }


    @GetMapping("/empleados")
    public List<Empleado> verEmpleados(){

        return this.empleadoService.getListaEmpleado();
    }

    @PutMapping("/empleado/{id}")
    public Empleado actualizarEmpleado(@PathVariable Long id, @RequestBody Empleado actEmpleado){
        return this.empleadoService.actualizarEmpleado(id, actEmpleado);
    }


    @DeleteMapping("/empleado/{id}")
    public Empleado eliminarEmpleado(@PathVariable(value = "id") Long id){
        return this.empleadoService.eliminarEmpleado(id);

    }


}
