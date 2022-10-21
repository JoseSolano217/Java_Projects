package usta.proj5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usta.proj5.entity.FacultyEntity;
import usta.proj5.entity.FacultyEntity;
import usta.proj5.repository.FacultyRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FacultyService {
    @Autowired
    private FacultyRepository facultyRepository;

    public FacultyEntity create(FacultyEntity person) {
        return facultyRepository.save(person);
    }

    public List<FacultyEntity> listAll() {
        return facultyRepository.findAll();
    }

    public void delete(FacultyEntity person) {
        facultyRepository.delete(person);
    }

    public Optional<FacultyEntity> findByID(Long id) {
        return facultyRepository.findById(id);
    }

    public void deleteById(Long id) {
        facultyRepository.deleteById(id);
    }
}
