package com.example.crudservices.rest;

import com.example.crudservices.model.PersonEntity;
import com.example.crudservices.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/person")
public class PersonRest {

    @Autowired
    private PersonService personService;

    @GetMapping("/list-all")
    private ResponseEntity<List<PersonEntity>> listEveryone() {
        return ResponseEntity.ok(personService.getAllPersons());
    }

    @GetMapping("/list-one/{id}")
    private ResponseEntity<Optional<PersonEntity>> onePersonById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(personService.getPersonById(id));
    }

    @GetMapping("/list-anyone")
    private ResponseEntity<Optional<PersonEntity>> anyone() {
        int amount = personService.countAllPeople();
        return ResponseEntity.ok(personService.getPersonById(1L + (long)(Math.random() * (amount - 1L))));
    }

    @GetMapping("/count-people")
    private ResponseEntity<String> countEveryone() {
        return ResponseEntity.ok(String.valueOf(personService.countAllPeople()));
    }
}
