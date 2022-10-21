package usta.project1.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import usta.project1.model.ProfessorEntity;
import usta.project1.service.ProfessorService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/professors")
public class ProfessorRest {
    @Autowired
    private ProfessorService professorService;

    @GetMapping("/list-all")
    private ResponseEntity<List<ProfessorEntity>> listEveryProfessor() {
        return ResponseEntity.ok(professorService.getAllProfessors());
    }

    @GetMapping("/list-one/{id}")
    private ResponseEntity<Optional<ProfessorEntity>> listProById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(professorService.getById(id));
    }

    @GetMapping("/list-any")
    private ResponseEntity<Optional<ProfessorEntity>> any() {
        int amount = professorService.countAllProfessors();
        return ResponseEntity.ok(professorService.getById(1L + (long)(Math.random() * (amount - 1L))));
    }

    @GetMapping("/count-any")
    private ResponseEntity<String> countEvery() {
        return ResponseEntity.ok(listEveryProfessor().toString());
    }

    @GetMapping("/list-singular/{name}")
    private ResponseEntity<Optional<ProfessorEntity>> singular(@PathVariable("name")String name) {
        return ResponseEntity.ok(professorService.getByName(name));
    }
}
