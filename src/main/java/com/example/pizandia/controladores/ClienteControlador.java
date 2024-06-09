package com.example.pizandia.controladores;

import com.example.pizandia.entidades.Cliente;
import com.example.pizandia.servicios.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/clientes")

public class ClienteControlador {

    @Autowired

    private ClienteServicio clienteServicio;

    @GetMapping
    public List<Cliente> getAll() {
        return clienteServicio.getCliente();
    }

    @GetMapping("/{clienteId}")
    public Optional<Cliente> getBId(@PathVariable("clienteId")Long clienteId) {
        return clienteServicio.getCliente(clienteId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Cliente cliente) {
        clienteServicio.saveOrUpdate(cliente);
    }

    @DeleteMapping("/{clienteId}")
    public void saveUpdate(@PathVariable ("clienteId") Long clienteId) {
        clienteServicio.delete(clienteId);
    }
}




















