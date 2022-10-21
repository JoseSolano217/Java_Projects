package com.example.proj2.rest;

import com.example.proj2.entities.SemesterEntity;
import com.example.proj2.service.SemesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/semesters")
public class SemesterRest {
    @Autowired
    private SemesterService semesterService;

    @GetMapping("/list-by-name/{name}")
    private ResponseEntity<List<SemesterEntity>> getByName(@PathVariable(name = "name") String name) {
        return ResponseEntity.ok(semesterService.getAllByName(name));
    }
}
