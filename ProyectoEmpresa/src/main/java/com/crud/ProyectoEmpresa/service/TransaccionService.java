package com.crud.ProyectoEmpresa.service;

import com.crud.ProyectoEmpresa.model.Empleado;
import com.crud.ProyectoEmpresa.model.Empresa;
import com.crud.ProyectoEmpresa.model.Transaccion;
import com.crud.ProyectoEmpresa.repository.EmpresaRepository;
import com.crud.ProyectoEmpresa.repository.TransaccionRepository;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransaccionService {

    @Autowired // anotación para especificarle a springboot que acá estoy haciendo Inyección de Dependencias
    private TransaccionRepository transaccionRepository;

    //constructor
    public TransaccionService(TransaccionRepository transaccionRepository) {

        this.transaccionRepository = transaccionRepository;
    }

    //método para crear a partir del POST
    public Transaccion crearTransaccion(Transaccion nuevaTransaccion){

        return this.transaccionRepository.save(nuevaTransaccion);
    }

    //método para visualizar a partir del GET
    public List<Transaccion> getListaTransaccion(){

        return this.transaccionRepository.findAll();
    }

    //método para editar o actualizar a partir del PUT
    public Transaccion actualizarTransaccion(Long id, Transaccion actTransaccion){
        Transaccion transaccionActual = transaccionRepository.findById(id).orElseThrow();
        transaccionActual.setTransaccion(actTransaccion.getTransaccion());
        transaccionActual.setConcepto(actTransaccion.getConcepto());
        transaccionActual.setEmpleado(actTransaccion.getEmpleado());

        return this.transaccionRepository.save(transaccionActual);
    }

    //método para eliminar
    public Transaccion eliminarTransaccion(Long id){
        Transaccion transaccionActual = transaccionRepository.findById(id).orElseThrow();//pero ésta, muestra lo que se borró
        this.transaccionRepository.deleteById(id);//solo con ésta linea funciona
        //crearPaciente(pacienteActual);
        return transaccionActual;//ésta tampoco es necesaria, se puede retornar un "null"
    }

}
