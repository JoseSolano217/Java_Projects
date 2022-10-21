package com.example.demo.service;

import com.example.demo.model.PacientesEntity;
import com.example.demo.model.UsuariosEntity;
import com.example.demo.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    public UsuariosEntity create(UsuariosEntity usuarios){
        return usuariosRepository.save(usuarios);
    }
    public List<UsuariosEntity> getAll(){
        return usuariosRepository.findAll();
    }
    public Optional<UsuariosEntity> findById(Long id){
        return usuariosRepository.findById(id);
    }
    public void delete(UsuariosEntity usuarios){
        usuariosRepository.delete(usuarios);
    }
    public void deleteById(Long id){
        usuariosRepository.deleteById(id);
    }

    public List<PacientesEntity> query3(String usuario, String password){
        return usuariosRepository.query3(usuario,password);
    }
}
