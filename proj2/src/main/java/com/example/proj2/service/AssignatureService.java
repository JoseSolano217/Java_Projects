package com.example.proj2.service;

import com.example.proj2.entities.AssignatureEntity;
import com.example.proj2.repository.AssignatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignatureService {
    @Autowired
    private AssignatureRepository assignatureRepository;

    public List<AssignatureEntity> getByName(String name) {
        return assignatureRepository.findAssignatureByName(name);
    }
}
