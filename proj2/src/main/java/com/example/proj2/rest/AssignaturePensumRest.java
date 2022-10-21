package com.example.proj2.rest;

import com.example.proj2.entities.AssignatureEntity;
import com.example.proj2.entities.AssignaturePensumEntity;
import com.example.proj2.service.AssignaturePensumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/breaking-table")
public class AssignaturePensumRest {
    @Autowired
    private AssignaturePensumService assignaturePensumService;

    @GetMapping("/list-reference-name")
    private ResponseEntity<List<String>> getReferenceAndName() {
        return ResponseEntity.ok(assignaturePensumService.getFirstExercise());
    }

    @GetMapping("/list-reference-name-name")
    private ResponseEntity<List<String>> getReferenceAndNameAndName() {
        return ResponseEntity.ok(assignaturePensumService.getSecondExercise());
    }

    @GetMapping("/list-all")
    private ResponseEntity<List<AssignaturePensumEntity>> getAll() {
        return ResponseEntity.ok(assignaturePensumService.getAll());
    }

    @GetMapping("/list-name-name-by-id/{id}")
    private ResponseEntity<Optional<String>> getBothNames(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(assignaturePensumService.getNamesByID(id));
    }
}
