package usta.project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import usta.project1.model.UniversityEntity;

public interface UniversityRepository extends JpaRepository<UniversityEntity, Long> {
    @Query("SELECT COUNT(uni) FROM UniversityEntity uni")
    public Integer countAllUniversities();
}
