package usta.project1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usta.project1.model.AssignatureEntity;
import usta.project1.repository.AssignatureRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AssignatureService {
    @Autowired
    private AssignatureRepository assignatureRepository;

    public List<AssignatureEntity> getAllAssignatures() {
        return assignatureRepository.findAll();
    }

    public Optional<AssignatureEntity> getById(Long id) {
        return assignatureRepository.findById(id);
    }

    public int countAllAssignatures() {
        return assignatureRepository.countAllAssignatures();
    }

    public List<AssignatureEntity> getByName(String name) {
        return assignatureRepository.findAssignatureByName(name);
    }
}
