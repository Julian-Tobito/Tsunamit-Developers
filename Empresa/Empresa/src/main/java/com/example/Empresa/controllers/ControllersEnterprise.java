package com.example.Empresa.controllers;
import org.springframework.web.bind.annotation.*;
import com.example.Empresa.entities.Enterprise;
import com.example.Empresa.services.ServicesEnterprise;

import java.util.ArrayList;

@RestController
@RequestMapping("/enterprises")
public class ControllersEnterprise {

    private ServicesEnterprise service;

    public ControllersEnterprise() {
        service=new ServicesEnterprise();
    }

    @GetMapping
    public ArrayList<Enterprise> getAllEnterprise(){

        return service.getListEnterprise();
    }

    @PostMapping
    public Enterprise addEnterprise(@RequestBody Enterprise enterprise){

        return service.addEnterprise(enterprise);
    }

   @GetMapping("/{nit}")
    public Enterprise getEnterprise(@PathVariable int nit){

        return service.findEnterprise(nit);
    }

    @PatchMapping("/{nit}")
    public Enterprise updateEnterprise(@RequestBody Enterprise enterprise){//el usuario entrega la empresa modificada

        return service.updateEnterprise(enterprise);
    }

    @DeleteMapping("/{nit}")
    public Enterprise deleteEnterprise(@PathVariable int nit){

        return service.deleteEnterprise(nit);
    }
}


