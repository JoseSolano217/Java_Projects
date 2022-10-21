package usta.project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import usta.project1.model.ProfessorEntity;
import java.util.Optional;

public interface ProfessorRepository extends JpaRepository<ProfessorEntity, Long> {
    @Query("SELECT COUNT(pro) FROM ProfessorEntity pro")
    public Integer countAllProfessors();

    @Query("SELECT pro FROM ProfessorEntity pro WHERE pro.names = ?1")
    public Optional<ProfessorEntity> findProfessorByName(String name);
}
