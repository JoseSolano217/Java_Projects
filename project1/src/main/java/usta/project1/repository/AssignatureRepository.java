package usta.project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import usta.project1.model.AssignatureEntity;

import java.util.List;
import java.util.Optional;

public interface AssignatureRepository extends JpaRepository<AssignatureEntity, Long> {
    // Yes, this is intentional
    @Query("SELECT COUNT(ass) FROM AssignatureEntity ass")
    public Integer countAllAssignatures();

    @Query("SELECT ass FROM AssignatureEntity ass WHERE ass.name LIKE %?1%")
    public List<AssignatureEntity> findAssignatureByName(String name);
}
