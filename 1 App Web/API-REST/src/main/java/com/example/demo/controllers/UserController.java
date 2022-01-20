package com.example.demo.controllers;

import java.util.ArrayList;

import com.example.demo.models.UsuarioModel;
import com.example.demo.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/users")
public class UserController {
    @Autowired
    UsuarioService usuarioService;

    //metodo GET
    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }
    //metodo POST   
    @PostMapping()
    public UsuarioModel guardUsuarios(UsuarioModel usuario){
        return usuarioService.guardUsuarios(usuario);
    }
    //metodo DELETE
    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean existe = this.usuarioService.eliminarPorId(id);
        if(existe){
            return "Usuario eliminado";
        }else{
            return "Usuario no existe";
        }
    }
}
