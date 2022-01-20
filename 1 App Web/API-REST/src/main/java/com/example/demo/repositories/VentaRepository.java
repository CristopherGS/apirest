package com.example.demo.repositories;


import com.example.demo.models.VentaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends CrudRepository<VentaModel, Long> {
    //public abstract ArrayList<VentaModel> findbyusuario_id(int usuario_id);
}
