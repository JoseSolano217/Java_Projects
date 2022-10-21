package usta.project1.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import usta.project1.model.SectionalEntity;
import usta.project1.model.UniversityEntity;
import usta.project1.service.SectionalService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sectionals")
public class SectionalRest {

    @Autowired
    private SectionalService sectionalService;

    @GetMapping("/list-all")
    private ResponseEntity<List<SectionalEntity>> listEverySectional() {
        return ResponseEntity.ok(sectionalService.getAllSectionals());
    }

    @GetMapping("/list-one/{id}")
    private ResponseEntity<Optional<SectionalEntity>> listSecById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(sectionalService.getById(id));
    }

    @GetMapping("/list-any")
    private ResponseEntity<Optional<SectionalEntity>> any() {
        int amount = sectionalService.countAllUniversities();
        return ResponseEntity.ok(sectionalService.getById(1L + (long)(Math.random() * (amount - 1L))));
    }

    @GetMapping("/count-any")
    private ResponseEntity<String> countEvery() {
        return ResponseEntity.ok(listEverySectional().toString());
    }
}
