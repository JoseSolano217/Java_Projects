package com.usta.crudservicios.rest;

import com.usta.crudservicios.model.PersonEntity;
import com.usta.crudservicios.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonRest {

    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.GET)
    private ResponseEntity<List<PersonEntity>> listEveryone() {
        return ResponseEntity.ok(personService.getAllPersons());
    }
}
