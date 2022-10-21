package com.example.crudservices.repository;

import com.example.crudservices.model.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
    @Query("SELECT COUNT(per) FROM PersonEntity per")
    public Integer countAllPeople();
}
