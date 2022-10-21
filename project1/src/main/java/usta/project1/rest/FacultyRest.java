package usta.project1.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import usta.project1.model.FacultyEntity;
import usta.project1.model.SectionalEntity;
import usta.project1.service.FacultyService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/faculties")
public class FacultyRest {
    @Autowired
    private FacultyService facultyService;

    @GetMapping("/list-all")
    private ResponseEntity<List<FacultyEntity>> listEveryFaculty() {
        return ResponseEntity.ok(facultyService.getAllFaculties());
    }

    @GetMapping("/list-one/{id}")
    private ResponseEntity<Optional<FacultyEntity>> listFacById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(facultyService.getById(id));
    }

    @GetMapping("/list-any")
    private ResponseEntity<Optional<FacultyEntity>> any() {
        int amount = facultyService.countAllFaculties();
        return ResponseEntity.ok(facultyService.getById(1L + (long)(Math.random() * (amount - 1L))));
    }

    @GetMapping("/count-any")
    private ResponseEntity<String> countEvery() {
        return ResponseEntity.ok(listEveryFaculty().toString());
    }
}
