package com.example.demo.service;

import com.example.demo.model.EstatusEntity;
import com.example.demo.repository.EstatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstatusService {

    @Autowired
    private EstatusRepository estatusRepository;

    public EstatusEntity create(EstatusEntity estatus){
        return estatusRepository.save(estatus);
    }
    public List<EstatusEntity> getAll(){
       return estatusRepository.findAll();
    }
    public Optional<EstatusEntity> findById(Long id){
       return estatusRepository.findById(id);
    }
    public void delete(EstatusEntity estatus){
        estatusRepository.delete(estatus);
    }
    public void deleteById(Long id){
        estatusRepository.deleteById(id);
    }
}
