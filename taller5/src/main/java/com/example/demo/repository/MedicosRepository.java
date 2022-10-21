package com.example.demo.repository;


import com.example.demo.model.MedicosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MedicosRepository extends JpaRepository<MedicosEntity, Long> {

    @Query("select ci.titulo, ci.antecedentes, me.email from CitasEntity ci inner join MedicosEntity me " +
            "ON me.idmedico = ci.medicosEntity.idmedico where me.nombres like %?1% and me.telefono like %?2%")
    public List<String> query1(String nombre, String telefono);

    @Query("select me from MedicosEntity me inner join CategoriasEntity ca "+
            "on ca.idcategoria = me.categoriasEntity.idcategoria where ca.nombrecategoria like %?1%")
    public List<MedicosEntity> query4(String nombre);



}
