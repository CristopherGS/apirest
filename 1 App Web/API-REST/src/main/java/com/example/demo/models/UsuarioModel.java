package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Usuario")

public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;


    private String nombre;
    private String direccion;
    private String fechadenacimiento;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getdireccion() {
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechadenacimiento() {
        return fechadenacimiento;
    }

    public void setFechadenacimiento(String fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

}


