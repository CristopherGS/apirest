package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    
    // obtengo todos los registros para estar ingresarlo al array
    public ArrayList<UsuarioModel> obtenerUsuarios() {
        return(ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel guardUsuarios(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    public boolean eliminarPorId(Long id) {
        try {
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
