package com.example.demo.service;

import com.example.demo.model.PacientesEntity;
import com.example.demo.repository.PacientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacientesService {

    @Autowired
    private PacientesRepository pacientesRepository;

    public PacientesEntity create(PacientesEntity pacientes){
        return pacientesRepository.save(pacientes);
    }
    public List<PacientesEntity> getAll(){
        return pacientesRepository.findAll();
    }
    public Optional<PacientesEntity> findById(Long id){
        return pacientesRepository.findById(id);
    }
    public void delete(PacientesEntity pacientes){
        pacientesRepository.delete(pacientes);
    }
    public void deleteById(Long id){
        pacientesRepository.deleteById(id);
    }

    public List<String> query2(String nombre, String documento){
        return pacientesRepository.query2(nombre, documento);
    }
}
