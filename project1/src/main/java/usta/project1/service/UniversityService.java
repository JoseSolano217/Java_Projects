package usta.project1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usta.project1.model.UniversityEntity;
import usta.project1.repository.UniversityRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UniversityService {
    @Autowired
    private UniversityRepository universityRepository;

    public List<UniversityEntity> getAllUniversities() {
        return universityRepository.findAll();
    }

    public Optional<UniversityEntity> getById(Long id) {
        return universityRepository.findById(id);
    }

    public int countAllUniversities() {
        return universityRepository.countAllUniversities();
    }
}
