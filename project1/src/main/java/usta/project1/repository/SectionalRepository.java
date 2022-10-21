package usta.project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import usta.project1.model.SectionalEntity;

public interface SectionalRepository extends JpaRepository<SectionalEntity, Long> {
    @Query("SELECT COUNT(sec) FROM SectionalEntity sec")
    public Integer countAllSectionals();
}
