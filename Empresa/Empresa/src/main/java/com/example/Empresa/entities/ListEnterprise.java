package com.example.Empresa.entities;

import java.util.ArrayList;

public class ListEnterprise {

    private ArrayList<Enterprise> listEnterprise;

    public ListEnterprise() {

        listEnterprise= new ArrayList<>();
    }

    public Enterprise findEnterprise(int nit){

        for(Enterprise enterprise:listEnterprise){
            if(Integer.compare(enterprise.getNit(),nit)==0){//da cero si son iguales
                return enterprise;
            }
        }
        return null;
    }

    public boolean addEnterprise(Enterprise enterprise){

        if(findEnterprise(enterprise.getNit())==null){

            listEnterprise.add(enterprise);
            return true;
        }
        return false;
    }

    public Enterprise updateEnterprise(Enterprise enterprise){

        Enterprise enterpriseaux= findEnterprise(enterprise.getNit());

        if(enterpriseaux!=null){

            listEnterprise.set(listEnterprise.indexOf(enterpriseaux),enterprise);
            return listEnterprise.get(listEnterprise.indexOf(enterprise));
        }
        return null;
    }

    public Enterprise deleteEnterprise(Enterprise enterprise){

        if(listEnterprise.contains(enterprise)){

            listEnterprise.remove(enterprise);
            return enterprise;
        }

        return null;
    }

    public ArrayList<Enterprise> getListEnterprise() {
        return (ArrayList<Enterprise>) listEnterprise.clone();
    }
}
