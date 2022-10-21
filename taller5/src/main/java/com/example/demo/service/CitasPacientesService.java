package com.example.demo.service;

import com.example.demo.model.CitasPacientesEntity;
import com.example.demo.repository.CitasPacientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitasPacientesService {

    @Autowired
    private CitasPacientesRepository citasPacientesRepository;

    public CitasPacientesEntity create(CitasPacientesEntity citasPacientes){
        return citasPacientesRepository.save(citasPacientes);
    }
    public List<CitasPacientesEntity> getAll(){
        return citasPacientesRepository.findAll();
    }
    public Optional<CitasPacientesEntity> findById(Long id){
        return citasPacientesRepository.findById(id);
    }
    public void delete(CitasPacientesEntity citasPacientes){
        citasPacientesRepository.delete(citasPacientes);
    }
    public void deleteById(Long id){
        citasPacientesRepository.deleteById(id);
    }
}
