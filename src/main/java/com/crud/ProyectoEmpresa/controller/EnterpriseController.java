package com.crud.ProyectoEmpresa.controller;

import com.crud.ProyectoEmpresa.model.Enterprise;
import com.crud.ProyectoEmpresa.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

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
    public RedirectView addEnterprise(@ModelAttribute Enterprise enterprise){

        enterpriseService.addEnterprise(enterprise);
        return new RedirectView("/home/getEnterprises");
    }

    @GetMapping("/{id}")
    public Enterprise findEnterpriseById(@PathVariable Long id ){

        return enterpriseService.findEnterpriseById(id);
    }

    @PatchMapping("/{id}")
    public RedirectView updateEnterprise(@ModelAttribute Enterprise enterprise ){

        if ( enterpriseService.findEnterpriseById(enterprise.getId()) != null ){
             enterpriseService.updateEnterprise(enterprise);
             return new RedirectView("/home/getEnterprises");
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public RedirectView deleteEnterprise( @PathVariable Long id ){

        Enterprise enterprise = enterpriseService.findEnterpriseById(id);

        if( enterprise != null){
            enterpriseService.deleteEnterprise(enterprise);

            return new RedirectView("/home/getEnterprises");
        }

        return null;
    }

}
