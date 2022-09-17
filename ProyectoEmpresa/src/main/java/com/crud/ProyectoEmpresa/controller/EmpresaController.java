package com.crud.ProyectoEmpresa.controller;

import com.crud.ProyectoEmpresa.model.Empresa;
import com.crud.ProyectoEmpresa.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    //constructor
    public EmpresaController(EmpresaService empresaService) {

        this.empresaService = empresaService;
    }

    @PostMapping("/empresa") //hacer una petición POST
    public Empresa crearEmpresa(@RequestBody Empresa empresa){

        return this.empresaService.crearEmpresa(empresa);
    }


    @GetMapping("/empresas")
    public List<Empresa> verEmpresas(){

        return this.empresaService.getListaEmpresa();
    }


    @DeleteMapping("/empresa/{id}")
    public Empresa eliminarEmpresa(@PathVariable(value = "id") Long id){
        return this.empresaService.eliminarEmpresa(id);

    }

    @PutMapping("/empresa/{id}")
    public Empresa actualizarEmpresa(@PathVariable Long id, @RequestBody Empresa actEmpresa){
        return this.empresaService.actualizarEmpresa(id, actEmpresa);
    }

}
