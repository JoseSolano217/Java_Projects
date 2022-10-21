package com.example.proj2.repository;

import com.example.proj2.entities.AssignatureEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AssignatureRepository extends JpaRepository<AssignatureEntity, Long> {
    @Query("SELECT ass FROM AssignatureEntity ass WHERE ass.name like %?1%")
    public List<AssignatureEntity> findAssignatureByName(String name);
}
