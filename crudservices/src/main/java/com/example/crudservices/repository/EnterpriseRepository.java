package com.example.crudservices.repository;

import com.example.crudservices.model.EnterpriseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnterpriseRepository extends JpaRepository<EnterpriseEntity, Long> {
}
