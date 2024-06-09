package com.example.pizandia.servicios;

import com.example.pizandia.entidades.Cliente;
import com.example.pizandia.repositorios.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteServicio{
    @Autowired

    ClienteRepository clienteRepository;

    public List<Cliente> getCliente(){
        return clienteRepository.findAll();
    }

    //Buscar dato por Id
    public Optional<Cliente> getCliente(Long id){
        return clienteRepository.findById(id);
    }

    //Actualizar datos
    public void saveOrUpdate(Cliente cliente){
        clienteRepository.save(cliente);
    }

    //Eliminar datos
    public void delete(Long id){
        clienteRepository.deleteById(id);
    }
}