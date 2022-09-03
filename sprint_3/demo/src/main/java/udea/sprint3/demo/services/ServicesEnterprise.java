package udea.sprint3.demo.services;

import udea.sprint3.demo.entities.Enterprise;
import udea.sprint3.demo.entities.ListEnterprise;

import java.util.ArrayList;

public class ServicesEnterprise {

    private ListEnterprise listEnterprise;

    public ServicesEnterprise() {

        listEnterprise= new ListEnterprise();

        listEnterprise.addEnterprise(new Enterprise("Coca Cola", "cra 45 #13-12","3106492044",1234));
        listEnterprise.addEnterprise(new Enterprise("AMB","cra 33 #21-34","3013509915",8987));
    }

    public ArrayList<Enterprise> getListEnterprise(){

        return (ArrayList<Enterprise>) listEnterprise.getListEnterprise().clone();

    }

    public Enterprise findEnterprise(int nit){

        return listEnterprise.findEnterprise(nit);
    }

}
