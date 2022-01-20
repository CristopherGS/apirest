package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Ventas")

public class VentaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    private String nombreProduto;
    private int cantidad;
    private int usuario_id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreProduto() {
        return nombreProduto;
    }

    public void setNombreProduto(String nombreProduto) {
        this.nombreProduto = nombreProduto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    
}
