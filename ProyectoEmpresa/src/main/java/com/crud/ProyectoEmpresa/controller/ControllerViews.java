package com.crud.ProyectoEmpresa.controller;

import com.crud.ProyectoEmpresa.model.Employee;
import com.crud.ProyectoEmpresa.model.Enterprise;
import com.crud.ProyectoEmpresa.model.Transaction;
import com.crud.ProyectoEmpresa.service.EmployeeService;
import com.crud.ProyectoEmpresa.service.EnterpriseService;
import com.crud.ProyectoEmpresa.service.TransactionService;
import com.crud.ProyectoEmpresa.service.UserService;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.security.core.annotation.AuthenticationPrincipal;

import java.util.List;

@RequestMapping("/home")
@Controller
public class ControllerViews {

    private EnterpriseService enterpriseService;
    private EmployeeService employeeService;
    private TransactionService transactionService;

    private UserService userService;

    public ControllerViews(EnterpriseService enterpriseService, EmployeeService employeeService, TransactionService transactionService, UserService userService) {
        this.enterpriseService = enterpriseService;
        this.employeeService = employeeService;
        this.transactionService = transactionService;
        this.userService = userService;
    }

    @GetMapping
    public String viewIndex(Model model, @AuthenticationPrincipal OidcUser principal){
        if(principal != null){
            principal.getClaims();
            model.addAttribute("title","Pagina Principal");
            model.addAttribute("nick",principal.getClaims().get("nickname"));



            userService.saveUser(principal.getClaims());

        }
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

    @GetMapping("/{id}")
    public String updateEnterprise(@PathVariable Long id,Model model){

        model.addAttribute("title", "Editar ");
        model.addAttribute("id",id);
        Enterprise enterprise=enterpriseService.findEnterpriseById(id);
        model.addAttribute("enterprise",enterprise);

        return "updateEnterprise";
    }

    @GetMapping("/employee/{id}")
    public String updateEmployee(@PathVariable Long id,Model model){

        model.addAttribute("title", "Editar ");
        model.addAttribute("id",id);
        Employee employee=employeeService.findEmployeeById(id);
        model.addAttribute("employee",employee);
        model.addAttribute("getEnterprises", enterpriseService.getAllEnterprise());
        return "updateEmployee";
    }

    @GetMapping("/transaction/{id}")
    public String updateTransaction(@PathVariable Long id,Model model){

        model.addAttribute("title", "Editar ");
        model.addAttribute("id",id);
        Transaction transaction=transactionService.findTransactionById(id);
        model.addAttribute("transaction",transaction);
        model.addAttribute("getEmployees", employeeService.getAllEmployees());
        return "updateTransaction";
    }

    @GetMapping("/getTransactionsEnterprise/{id}")
    public String getTransactionEnterprise(@PathVariable Long id,Model model){

        model.addAttribute("title", "Egresos e Ingresos de las Empresa");
        Enterprise enterprise= enterpriseService.findEnterpriseById(id);
        model.addAttribute("enterprise",enterprise);
        model.addAttribute("transaction",transactionService.getTransactionsEnterprise(id));
        return "getTransactionsEnterprise";
    }


}
