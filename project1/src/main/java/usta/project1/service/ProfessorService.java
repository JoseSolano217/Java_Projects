package usta.project1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usta.project1.model.ProfessorEntity;
import usta.project1.repository.ProfessorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;

    public List<ProfessorEntity> getAllProfessors() {
        return professorRepository.findAll();
    }

    public Optional<ProfessorEntity> getById(Long id) {
        return professorRepository.findById(id);
    }

    public int countAllProfessors() {
        return professorRepository.countAllProfessors();
    }

    public Optional<ProfessorEntity> getByName(String name) {
        return professorRepository.findProfessorByName(name);
    }
}
