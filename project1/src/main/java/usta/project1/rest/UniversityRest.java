package usta.project1.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import usta.project1.model.UniversityEntity;
import usta.project1.service.UniversityService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/universities")
public class UniversityRest {

    @Autowired
    private UniversityService universityService;

    @GetMapping("/list-all")
    private ResponseEntity<List<UniversityEntity>> listEveryUniversity() {
        return ResponseEntity.ok(universityService.getAllUniversities());
    }

    @GetMapping("/list-one/{id}")
    private ResponseEntity<Optional<UniversityEntity>> listUniById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(universityService.getById(id));
    }

    @GetMapping("/list-any")
    private ResponseEntity<Optional<UniversityEntity>> any() {
        int amount = universityService.countAllUniversities();
        return ResponseEntity.ok(universityService.getById(1L + (long)(Math.random() * (amount - 1L))));
    }

    @GetMapping("/count-any")
    private ResponseEntity<String> countEvery() {
        return ResponseEntity.ok(listEveryUniversity().toString());
    }
}
