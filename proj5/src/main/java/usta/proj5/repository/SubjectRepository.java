package usta.proj5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import usta.proj5.entity.SubjectEntity;

import java.util.List;

public interface SubjectRepository extends JpaRepository<SubjectEntity, Long> {
    @Query("SELECT COUNT(sub) FROM SubjectEntity sub")
    public Integer countAllSubjects();

    @Query("SELECT sub FROM SubjectEntity sub WHERE sub.name LIKE %?1%")
    public List<SubjectEntity> findSubjectByName(String name);
}
