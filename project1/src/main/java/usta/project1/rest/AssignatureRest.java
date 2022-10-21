package usta.project1.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import usta.project1.model.AssignatureEntity;
import usta.project1.model.ProfessorEntity;
import usta.project1.service.AssignatureService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/assignatures")
public class AssignatureRest {
    @Autowired
    private AssignatureService assignatureService;

    @GetMapping("/list-all")
    private ResponseEntity<List<AssignatureEntity>> listEveryAssignature() {
        return ResponseEntity.ok(assignatureService.getAllAssignatures());
    }

    @GetMapping("/list-one/{id}")
    private ResponseEntity<Optional<AssignatureEntity>> listAssById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(assignatureService.getById(id));
    }

    @GetMapping("/list-any")
    private ResponseEntity<Optional<AssignatureEntity>> any() {
        int amount = assignatureService.countAllAssignatures();
        return ResponseEntity.ok(assignatureService.getById(1L + (long)(Math.random() * (amount - 1L))));
    }

    @GetMapping("/count-any")
    private ResponseEntity<String> countEvery() {
        return ResponseEntity.ok(String.valueOf(assignatureService.countAllAssignatures()));
    }

    @GetMapping("/list-singular/{name}")
    private ResponseEntity<List<AssignatureEntity>> singular(@PathVariable("name")String name) {
        return ResponseEntity.ok(assignatureService.getByName(name));
    }
}
