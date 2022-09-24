package com.crud.ProyectoEmpresa.controller;

import com.crud.ProyectoEmpresa.model.Employee;
import com.crud.ProyectoEmpresa.model.Enterprise;
import com.crud.ProyectoEmpresa.model.Transaction;
import com.crud.ProyectoEmpresa.service.EmployeeService;
import com.crud.ProyectoEmpresa.service.EnterpriseService;
import com.crud.ProyectoEmpresa.service.TransactionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/home")
@Controller
public class ControllerViews {

    private EnterpriseService enterpriseService;
    private EmployeeService employeeService;
    private TransactionService transactionService;

    public ControllerViews(EnterpriseService enterpriseService, EmployeeService employeeService, TransactionService transactionService) {
        this.enterpriseService = enterpriseService;
        this.employeeService = employeeService;
        this.transactionService = transactionService;
    }

    @GetMapping
    public String viewIndex(Model model){

        return "index";
    }

    @GetMapping("/getEnterprises")
    public String getEnterprise(Model model){
        model.addAttribute("title","Gestión de Empresas");
        model.addAttribute("getEnterprises", enterpriseService.getAllEnterprise());
        return "enterprise";
    }

    @GetMapping("/getEmployees")
    public String getEmployee(Model model){
        model.addAttribute("title","Gestión de Empleados");
        model.addAttribute("getEmployees", employeeService.getAllEmployees());
        return "employee";
    }

    @GetMapping("/getTransactions")
    public String getTransaccions(Model model){
        model.addAttribute("title","Gestión de Movimientos de Dinero");
        model.addAttribute("getTransactions", transactionService.getAllTransactions());
        return "transaction";
    }

    @GetMapping("/newEnterprise")
    public String newEnterprise(Model model){

        model.addAttribute("title", "Crear Empresa");
        model.addAttribute("enterprise",new Enterprise());

        return "newEnterprise";
    }

    @GetMapping("/newEmployee")
    public String newEmployee(Model model){

        model.addAttribute("title", "Crear Empleado");
        model.addAttribute("employee",new Employee());
        model.addAttribute("getEnterprises", enterpriseService.getAllEnterprise());
        return "newEmployee";
    }

    @GetMapping("/newTransaction")
    public String newTransaccion(Model model){

        model.addAttribute("title", "Crear Movimiento de Dinero");
        model.addAttribute("transaction",new Transaction());
        model.addAttribute("getEmployees", employeeService.getAllEmployees());
        return "newTransaction";
    }

    @GetMapping("/updateEnterprise")
    public String updateEnterprise(Model model){

        model.addAttribute("title", "Editar Empresa");
        model.addAttribute("enterprise",new Enterprise());
        model.addAttribute("getEnterprise",enterpriseService.getAllEnterprise());

        return "updateEnterprise";
    }


}
