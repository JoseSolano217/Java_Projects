package usta.proj5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import usta.proj5.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}
