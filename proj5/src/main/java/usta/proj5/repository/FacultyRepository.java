package usta.proj5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import usta.proj5.entity.FacultyEntity;

public interface FacultyRepository extends JpaRepository<FacultyEntity, Long> {
    @Query("SELECT COUNT(fac) FROM FacultyEntity fac")
    public Integer countAllFaculties();
}
