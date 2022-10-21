package com.example.proj2.repository;

import com.example.proj2.entities.PensumEntity;
import com.example.proj2.entities.ProgramEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface ProgramRepository extends JpaRepository<ProgramEntity, Long> {
}
