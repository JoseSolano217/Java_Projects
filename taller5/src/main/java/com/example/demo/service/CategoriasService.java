package com.example.demo.service;

import com.example.demo.model.CategoriasEntity;
import com.example.demo.repository.CategoriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriasService {

    @Autowired
    private CategoriasRepository categoriasRepository;

    public CategoriasEntity create(CategoriasEntity categorias){
        return categoriasRepository.save(categorias);
    }
    public List<CategoriasEntity> getAll(){
        return categoriasRepository.findAll();
    }
    public Optional<CategoriasEntity> findById(Long id){
      return  categoriasRepository.findById(id);
    }
    public void delete(CategoriasEntity categorias){
        categoriasRepository.delete(categorias);
    }
    public void deleteById(Long id){
        categoriasRepository.deleteById(id);
    }
}
