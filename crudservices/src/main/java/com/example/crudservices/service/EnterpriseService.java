package com.example.crudservices.service;

import com.example.crudservices.model.EnterpriseEntity;
import com.example.crudservices.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterpriseService {

    @Autowired
    private EnterpriseRepository enterpriseRepository;

    public List<EnterpriseEntity> getAllEnterprises() {
        return enterpriseRepository.findAll();
    }
}
