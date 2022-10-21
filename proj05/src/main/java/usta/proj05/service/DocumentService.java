package usta.proj05.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usta.proj05.models.DocumentEntity;
import usta.proj05.repository.DocumentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentService {
    @Autowired
    private DocumentRepository documentRepository;

    public DocumentEntity create(DocumentEntity document) {
        return documentRepository.save(document);
    }

    public List<DocumentEntity> listAll() {
        return documentRepository.findAll();
    }

    public void delete(DocumentEntity document) {
        documentRepository.delete(document);
    }

    public Optional<DocumentEntity> findByID(Long id) {
        return documentRepository.findById(id);
    }

    public void deleteById(Long id) {
        documentRepository.deleteById(id);
    }
}
