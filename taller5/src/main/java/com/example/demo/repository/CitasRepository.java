package com.example.demo.repository;

import com.example.demo.model.CitasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitasRepository extends JpaRepository<CitasEntity, Long> {
}
