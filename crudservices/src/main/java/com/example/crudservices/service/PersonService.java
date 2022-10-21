package com.example.crudservices.service;

import com.example.crudservices.model.PersonEntity;
import com.example.crudservices.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<PersonEntity> getAllPersons() {
        return personRepository.findAll();
    }

    public Optional<PersonEntity> getPersonById(Long id) {
        return personRepository.findById(id);
    }

    public int countAllPeople() {
        return personRepository.countAllPeople();
    }
}
