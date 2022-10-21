package com.example.proj2.repository;

import com.example.proj2.entities.SemesterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SemesterRepository extends JpaRepository<SemesterEntity, Long> {
    @Query("SELECT sem FROM SemesterEntity sem WHERE sem.name LIKE %?1%")
    public List<SemesterEntity> getByName(String name);
}
