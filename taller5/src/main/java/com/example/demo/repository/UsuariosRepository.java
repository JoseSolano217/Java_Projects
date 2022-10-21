package com.example.demo.repository;

import com.example.demo.model.PacientesEntity;
import com.example.demo.model.UsuariosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuariosRepository extends JpaRepository<UsuariosEntity, Long> {

    @Query("select pa from PacientesEntity pa inner join UsuariosEntity usu " +
            "on usu.idusuario = pa.usuario.idusuario where usu.username like %?1% and usu.password like %?2%")
    public List<PacientesEntity> query3(String usuario, String password);
}
