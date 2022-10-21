package com.example.demo.service;

import com.example.demo.model.PagosEntity;
import com.example.demo.repository.PagosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagosService {

    @Autowired
    private PagosRepository pagosRepository;

    public PagosEntity create(PagosEntity pagos){
        return pagosRepository.save(pagos);
    }
    public List<PagosEntity> getAll(){
        return pagosRepository.findAll();
    }
    public Optional<PagosEntity> findById(Long id){
        return pagosRepository.findById(id);
    }
    public void delete(PagosEntity pagos){
        pagosRepository.delete(pagos);
    }
    public void deleteById(Long id){
        pagosRepository.deleteById(id);
    }
}
