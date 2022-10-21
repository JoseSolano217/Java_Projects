package usta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usta.entity.PersonEntity;
import usta.repository.PersonRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public PersonEntity create(PersonEntity person) {
        return personRepository.save(person);
    }

    public List<PersonEntity> listAll() {
        return personRepository.findAll();
    }

    public void delete(PersonEntity person) {
        personRepository.delete(person);
    }

    public Optional<PersonEntity> findByID(Long id) {
        return personRepository.findById(id);
    }

    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }
}
