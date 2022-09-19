package com.crud.ProyectoEmpresa.controller;

import com.crud.ProyectoEmpresa.model.Enterprise;
import com.crud.ProyectoEmpresa.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/enterprises")
@RestController
public class EnterpriseController {

    @Autowired
    EnterpriseService enterpriseService;

    //constructor

    public EnterpriseController(EnterpriseService enterpriseService) {
        this.enterpriseService = enterpriseService;
    }

    @GetMapping
    public List<Enterprise> getAllEnterprises(){
        return enterpriseService.getAllEnterprise();
    }

    @PostMapping
    public Enterprise addEnterprise(@RequestBody Enterprise enterprise){

        return enterpriseService.addEnterprise(enterprise);
    }

    @GetMapping("/{id}")
    public Enterprise findEnterpriseById(@PathVariable Long id ){

        return enterpriseService.findEnterpriseById(id);
    }

    @PatchMapping("/{id}")
    public Enterprise updateEnterprise(@RequestBody Enterprise enterprise ){

        if ( enterpriseService.findEnterpriseById(enterprise.getId()) != null ){
            return enterpriseService.updateEnterprise(enterprise);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public Enterprise deleteEnterprise( @PathVariable Long id ){

        Enterprise enterprise = enterpriseService.findEnterpriseById(id);

        if( enterprise != null){
            enterpriseService.deleteEnterprise(enterprise);

            return enterprise;
        }

        return null;
    }

}
