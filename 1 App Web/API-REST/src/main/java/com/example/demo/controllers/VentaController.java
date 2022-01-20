package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.VentaModel;
import com.example.demo.services.VentaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/sales")
public class VentaController {
    @Autowired
    VentaService ventaService;

    //metodo GET
    @GetMapping()
    public ArrayList<VentaModel> obtenerVentas(){
        return ventaService.obtenerVentas();
    }

    //metodo POST
    @PostMapping()
    public VentaModel guardVentas(VentaModel venta){
        return ventaService.guardVentas(venta);
    }
    
    @GetMapping( path = "/{id}")
    public Optional<VentaModel> obtenerVentaid(@PathVariable("id") Long id){
        return ventaService.obtenerPorid(id);
    }

    // @GetMapping( path = "/query")
    // public ArrayList<VentaModel> obtenerVentaid(@RequestParam("usuario_id") int usuario_id){
    //     return ventaService.obtenerPorUsuario_id(usuario_id);
    // }
    
}
