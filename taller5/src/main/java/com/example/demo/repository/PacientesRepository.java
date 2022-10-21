package com.example.demo.repository;


import com.example.demo.model.PacientesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PacientesRepository extends JpaRepository<PacientesEntity, Long> {

    @Query("select ci.sintomas, ci.antecedentes, pa.alergias from CitasEntity ci inner join PacientesEntity  pa " +
            "on pa.medicamentos = ci.medicamentos where pa.nombres like %?1% or pa.documento like %?2% ")
    public List<String> query2(String nombre, String documento);
}
