package udea.sprint3.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import udea.sprint3.demo.services.ServicesEnterprise;

@RestController
public class ControllersEmpresa {

    private ServicesEnterprise service;

    @GetMapping("/getTodas")
    public String getAllEnterprise(){

        service=new ServicesEnterprise();

        return service.getListEnterprise().toString();
    }

    @GetMapping("/getUna")
    public String getEnterprise(int nit){

        service= new ServicesEnterprise();
        return service.findEnterprise(nit).toString();
    }
}
