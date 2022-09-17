package com.crud.ProyectoEmpresa.service;

import com.crud.ProyectoEmpresa.model.Empresa;
import com.crud.ProyectoEmpresa.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService {

    @Autowired // anotación para especificarle a springboot que acá estoy haciendo Inyección de Dependencias
    private EmpresaRepository empresaRepository;


    //constructor
    public EmpresaService(EmpresaRepository empresaRepository) {

        this.empresaRepository = empresaRepository;
    }

    //método para visualizar a partir del GET
    public List<Empresa> getListaEmpresa(){

        return this.empresaRepository.findAll();
    }

    //método para crear a partir del POST
    public Empresa crearEmpresa(Empresa nuevaEmpresa){

        return this.empresaRepository.save(nuevaEmpresa);
    }

    //método para editar o actualizar a partir del PUT
    public Empresa actualizarEmpresa(Long id, Empresa actEmpresa){
        Empresa empresaActual = empresaRepository.findById(id).orElseThrow();
        empresaActual.setNombre(actEmpresa.getNombre());
        empresaActual.setDireccion(actEmpresa.getDireccion());
        empresaActual.setNit(actEmpresa.getNit());
        empresaActual.setTelefono(actEmpresa.getTelefono());

        return this.empresaRepository.save(empresaActual);
    }


    //método para eliminar
    public Empresa eliminarEmpresa(Long id){
        Empresa empresaActual = empresaRepository.findById(id).orElseThrow();//pero ésta, muestra lo que se borró
        this.empresaRepository.deleteById(id);//solo con ésta linea funciona
        //crearPaciente(pacienteActual);
        return empresaActual;//ésta tampoco es necesaria, se puede retornar un "null"
    }

}
