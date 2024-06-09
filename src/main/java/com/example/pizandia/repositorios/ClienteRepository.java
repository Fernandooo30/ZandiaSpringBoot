package com.example.pizandia.repositorios;

import com.example.pizandia.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ClienteRepository extends JpaRepository <Cliente,Long> {

}
