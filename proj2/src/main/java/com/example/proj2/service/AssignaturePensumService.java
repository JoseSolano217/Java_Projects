package com.example.proj2.service;

import com.example.proj2.entities.AssignaturePensumEntity;
import com.example.proj2.repository.AssignaturePensumRepository;
import com.example.proj2.repository.AssignatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssignaturePensumService {
    @Autowired
    private AssignaturePensumRepository assignaturePensumRepository;

    public List<String> getFirstExercise() {
        return assignaturePensumRepository.getReferenceAndName();
    }

    public List<String> getSecondExercise() {
        return assignaturePensumRepository.getReferenceNameAndName();
    }

    public List<AssignaturePensumEntity> getAll() {
        return assignaturePensumRepository.findAll();
    }

    public Optional<String> getNamesByID(Long id) {
        return assignaturePensumRepository.getNameAndNameByID(id);
    }
}
