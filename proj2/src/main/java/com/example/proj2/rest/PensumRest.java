package com.example.proj2.rest;

import com.example.proj2.entities.PensumEntity;
import com.example.proj2.service.PensumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/pensums")
public class PensumRest {
    @Autowired
    private PensumService pensumService;

    @GetMapping("/list-by-id/{id}")
    private ResponseEntity<Optional<String>> listByID(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(pensumService.getPensumAndProgramName(id));
    }
}
