package com.example.demo.service;

import com.example.demo.model.CitasEntity;
import com.example.demo.repository.CitasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitasService {

    @Autowired
    private CitasRepository citasRepository;

    public CitasEntity create(CitasEntity citas){
      return  citasRepository.save(citas);
    }
    public List<CitasEntity> getAll(){
        return citasRepository.findAll();
    }
    public Optional<CitasEntity> findById(Long id){
        return citasRepository.findById(id);
    }
    public void delete(CitasEntity citasEntity){
        citasRepository.delete(citasEntity);
    }
    public void deleteById(Long id){
        citasRepository.deleteById(id);
    }
}
