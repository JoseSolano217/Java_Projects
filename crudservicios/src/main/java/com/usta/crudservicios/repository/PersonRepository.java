package com.usta.crudservicios.repository;

import com.usta.crudservicios.model.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> {

}
