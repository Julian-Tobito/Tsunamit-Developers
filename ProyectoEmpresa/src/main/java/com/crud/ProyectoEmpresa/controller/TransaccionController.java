package com.crud.ProyectoEmpresa.controller;

import com.crud.ProyectoEmpresa.model.Empresa;
import com.crud.ProyectoEmpresa.model.Transaccion;
import com.crud.ProyectoEmpresa.service.EmpresaService;
import com.crud.ProyectoEmpresa.service.TransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class TransaccionController {

    @Autowired
    TransaccionService transaccionService;

    //constructor
    public TransaccionController (TransaccionService transaccionService) {
        this.transaccionService = transaccionService;
    }

    @PostMapping("/transaccion") //hacer una petición POST
    public Transaccion crearTransaccion(@RequestBody Transaccion transaccion){
        return this.transaccionService.crearTransaccion(transaccion);
    }

    @GetMapping("/transacciones")
    public List<Transaccion> verTransacciones(){

        return this.transaccionService.getListaTransaccion();
    }

    @PutMapping("/transaccion/{id}")
    public Transaccion actualizarTransaccion(@PathVariable Long id, @RequestBody Transaccion actTransaccion){
        return this.transaccionService.actualizarTransaccion(id, actTransaccion);
    }


    @DeleteMapping("/transaccion/{id}")
    public Transaccion eliminarTransaccion(@PathVariable(value = "id") Long id){
        return this.transaccionService.eliminarTransaccion(id);

    }

}
