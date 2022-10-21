package usta.proj5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usta.proj5.entity.SubjectEntity;
import usta.proj5.repository.SubjectRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public SubjectEntity create(SubjectEntity person) {
        return subjectRepository.save(person);
    }

    public List<SubjectEntity> listAll() {
        return subjectRepository.findAll();
    }

    public void delete(SubjectEntity person) {
        subjectRepository.delete(person);
    }

    public Optional<SubjectEntity> findByID(Long id) {
        return subjectRepository.findById(id);
    }

    public void deleteById(Long id) {
        subjectRepository.deleteById(id);
    }
}
