package com.example.Empresa.services;

import com.example.Empresa.entities.Enterprise;
import com.example.Empresa.entities.ListEnterprise;

import java.util.ArrayList;

public class ServicesEnterprise {

    private ListEnterprise listEnterprise;

    public ServicesEnterprise() {

        listEnterprise= new ListEnterprise();

    }

    public ArrayList<Enterprise> getListEnterprise(){

        return (ArrayList<Enterprise>) listEnterprise.getListEnterprise().clone();

    }

    public Enterprise findEnterprise(int nit){

        return listEnterprise.findEnterprise(nit);
    }

    public Enterprise addEnterprise(Enterprise enterprise){

        return listEnterprise.addEnterprise(enterprise) ? enterprise:null;
    }

    public Enterprise updateEnterprise(Enterprise enterprise){

        return listEnterprise.updateEnterprise(enterprise);
    }

    public Enterprise deleteEnterprise(int nit){

        return  listEnterprise.deleteEnterprise(listEnterprise.findEnterprise(nit));
    }

}
