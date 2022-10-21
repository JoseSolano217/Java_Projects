package com.example.proj2.service;

import com.example.proj2.entities.PensumEntity;
import com.example.proj2.repository.PensumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PensumService {
    @Autowired
    private PensumRepository pensumRepository;

    public Optional<String> getPensumAndProgramName(Long id) {
        return pensumRepository.findPensumByName(id);
    }
}
