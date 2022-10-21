package usta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import usta.entity.PersonEntity;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
}
