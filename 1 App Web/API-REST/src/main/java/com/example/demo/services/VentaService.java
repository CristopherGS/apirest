package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.VentaModel;
import com.example.demo.repositories.VentaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService {
    @Autowired
    VentaRepository ventaRespository;
    
    // obtengo todos los registros para estar ingresarlo al array
    public ArrayList<VentaModel> obtenerVentas() {
        return(ArrayList<VentaModel>) ventaRespository.findAll();
    }

    public VentaModel guardVentas(VentaModel usuario) {
        return ventaRespository.save(usuario);
    }
    
    public Optional<VentaModel> obtenerPorid(Long id){
        return ventaRespository.findById(id);
    }

    // public ArrayList<VentaModel> obtenerPorUsuario_id (int usuario_id) {
    //     return ventaRespository.findbyusuario_id(usuario_id);
    // }
}
