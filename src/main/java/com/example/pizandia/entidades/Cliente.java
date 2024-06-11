package com.example.pizandia.entidades;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Cliente")

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long clienteId;

    private String nombre;

    private String apellido;

    @Column(name = "email_contraseña", nullable = false)
    private String email;

    private String direccion;

    private int telefono;

}
