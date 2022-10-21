package com.example.proj2.service;

import com.example.proj2.entities.ProgramEntity;
import com.example.proj2.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramService {
    @Autowired
    private ProgramRepository programRepository;

    public List<ProgramEntity> getAllPrograms() {
        return programRepository.findAll();
    }
}
