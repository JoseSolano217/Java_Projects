package com.usta.crudservicios.service;

import com.usta.crudservicios.model.PersonEntity;
import com.usta.crudservicios.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<PersonEntity> getAllPersons() {
        return personRepository.findAll();
    }
}
