package usta.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import usta.entity.PersonEntity;
import usta.service.PersonService;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonRest {
    @Autowired
    private PersonService personService;

    @PostMapping("/create")
    private ResponseEntity<PersonEntity> save(@RequestBody PersonEntity person) {
        PersonEntity temp = personService.create(person);
        try {
            return ResponseEntity.created(new URI("person/" + temp.getId_person())).body(temp);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/list-all")
    private ResponseEntity<List<PersonEntity>> listAll() {
        return ResponseEntity.ok(personService.listAll());
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Void> deletePerson(@RequestBody PersonEntity person) {
        personService.delete(person);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get-by-id/{id}")
    private ResponseEntity<Optional<PersonEntity>> getByID(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(personService.findByID(id));
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<Void> deletePersonByID(@PathVariable(name = "id") Long id) {
        personService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/edit")
    private ResponseEntity<PersonEntity> edit(@RequestBody PersonEntity person) {
        PersonEntity temp = personService.create(person);
        try {
            return ResponseEntity.created(new URI("person/" + temp.getId_person())).body(temp);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
