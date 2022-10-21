package com.example.proj2.repository;

import com.example.proj2.entities.AssignaturePensumEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AssignaturePensumRepository extends JpaRepository<AssignaturePensumEntity, Long> {
    @Query("SELECT ape.assignatureEntity.reference, ape.pensumEntity.name FROM AssignaturePensumEntity ape")
    public List<String> getReferenceAndName();

    @Query("SELECT ape.assignatureEntity.reference, ape.assignatureEntity.name, ape.semesterEntity.name FROM AssignaturePensumEntity ape")
    public List<String> getReferenceNameAndName();

    @Query("SELECT ape.assignatureEntity.name, ape.semesterEntity.name FROM AssignaturePensumEntity ape WHERE ape.id_assignature_pensum = ?1")
    public Optional<String> getNameAndNameByID(Long id);
}
