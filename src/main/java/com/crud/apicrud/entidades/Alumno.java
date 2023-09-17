package com.crud.apicrud.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name = "tbl_alumno")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long alumnoId;

    private String nombre;

    private String apellido;

    private String correo;

}
