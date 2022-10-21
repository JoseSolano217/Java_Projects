package usta.project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import usta.project1.model.FacultyEntity;

public interface FacultyRepository extends JpaRepository<FacultyEntity, Long> {
    @Query("SELECT COUNT(fac) FROM FacultyEntity fac")
    public Integer countAllFaculties();
}
