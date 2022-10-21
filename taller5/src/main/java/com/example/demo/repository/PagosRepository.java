package com.example.demo.repository;

import com.example.demo.model.PagosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagosRepository extends JpaRepository<PagosEntity, Long> {
}
