package usta.project1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usta.project1.model.FacultyEntity;
import usta.project1.repository.FacultyRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FacultyService {
    @Autowired
    private FacultyRepository facultyRepository;

    public List<FacultyEntity> getAllFaculties() {
        return facultyRepository.findAll();
    }

    public Optional<FacultyEntity> getById(Long id) {
        return facultyRepository.findById(id);
    }

    public int countAllFaculties() {
        return facultyRepository.countAllFaculties();
    }
}
