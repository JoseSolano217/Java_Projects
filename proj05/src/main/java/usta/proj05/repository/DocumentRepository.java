package usta.proj05.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import usta.proj05.models.DocumentEntity;

public interface DocumentRepository extends JpaRepository<DocumentEntity, Long> {
}
