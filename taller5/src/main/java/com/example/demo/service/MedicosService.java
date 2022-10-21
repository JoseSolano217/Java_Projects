package com.example.demo.service;

import com.example.demo.model.MedicosEntity;
import com.example.demo.repository.MedicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicosService {

    @Autowired
    private MedicosRepository medicosRepository;

    public MedicosEntity create(MedicosEntity medicos){
       return medicosRepository.save(medicos);
    }
    public List<MedicosEntity> getAll(){
        return medicosRepository.findAll();
    }
    public Optional<MedicosEntity> findById(Long id){
        return medicosRepository.findById(id);
    }
    public void delete(MedicosEntity medicos){
        medicosRepository.delete(medicos);
    }
    public void deleteById(Long id){
        medicosRepository.deleteById(id);
    }

    public List<String> query1(String nombre, String telefono){
        return medicosRepository.query1(nombre,telefono);
    }
    public List<MedicosEntity> query4(String nombre){
        return medicosRepository.query4(nombre);
    }
}
