package com.example.proj2.rest;

import com.example.proj2.entities.ProgramEntity;
import com.example.proj2.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/programs")
public class ProgramRest {
    @Autowired
    private ProgramService programService;

    @GetMapping("/list-all")
    private ResponseEntity<List<ProgramEntity>> getAll() {
        return ResponseEntity.ok(programService.getAllPrograms());
    }
}
