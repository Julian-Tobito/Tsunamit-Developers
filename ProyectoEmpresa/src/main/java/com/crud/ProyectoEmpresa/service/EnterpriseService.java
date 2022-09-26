package com.crud.ProyectoEmpresa.service;

import com.crud.ProyectoEmpresa.model.Enterprise;
import com.crud.ProyectoEmpresa.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnterpriseService {

    @Autowired // anotación para especificarle a springboot que acá estoy haciendo Inyección de Dependencias
    private EnterpriseRepository enterpriseRepository;

    //constructor
    public EnterpriseService(EnterpriseRepository enterpriseRepository) {

        this.enterpriseRepository=enterpriseRepository;
    }

    //método para visualizar a partir del GET
    public List<Enterprise> getAllEnterprise(){

        return enterpriseRepository.findAll();
    }

    //método para crear a partir del POST
    public Enterprise addEnterprise(Enterprise enterprise){

        return enterpriseRepository.save(enterprise);
    }

    //GET para una sola empresa
    public Enterprise findEnterpriseById(Long id ){
        Optional<Enterprise> optEnterprise = enterpriseRepository.findById(id);
        if( optEnterprise.isPresent()){

            return optEnterprise.get();
        }

        return null;
    }

    //método para editar o actualizar a partir del PATCH
    /***
     * Permite actualizar un objeto
     * Precondicion: El objeto existe
     * Poscondicion: si existe se modifica
     * @param enterprise referencia del objeto que se actualiza
     * @return objeto actualizado
     */
    public Enterprise updateEnterprise( Enterprise enterprise ){
        return enterpriseRepository.save(enterprise);
    }

    //método para eliminar
    /***
     * Permite eliminar un objeto
     * precondicion: el objeto existe
     * Poscondicion: si existe se elimina
     * @param enterprise referencia del objeto que se elimina
     * @return objeto eliminado
     */

    public void deleteEnterprise( Enterprise enterprise ){

        enterpriseRepository.delete(enterprise);
    }

}
