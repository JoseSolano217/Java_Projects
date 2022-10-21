package com.example.demo.repository;


import com.example.demo.model.EstatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstatusRepository extends JpaRepository<EstatusEntity, Long> {
}
