package com.example.proj2.service;

import com.example.proj2.entities.SemesterEntity;
import com.example.proj2.repository.SemesterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SemesterService {
    @Autowired
    private SemesterRepository semesterRepository;

    public List<SemesterEntity> getAllByName(String name) {
        return semesterRepository.getByName(name);
    }
}
