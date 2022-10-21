package com.example.proj2.repository;

import com.example.proj2.entities.PensumEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PensumRepository extends JpaRepository<PensumEntity, Long> {
    @Query("SELECT pen.name, prog.name " +
            "FROM PensumEntity pen INNER JOIN ProgramEntity prog " +
            "ON pen.programEntity.id_program = prog.id_program WHERE pen.id_pensum = ?1")
    public Optional<String> findPensumByName(Long id);
}
