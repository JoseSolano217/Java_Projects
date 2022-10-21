package com.example.proj2.rest;

import com.example.proj2.entities.AssignatureEntity;
import com.example.proj2.service.AssignatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/assignatures")
public class AssignatureRest {
    @Autowired
    private AssignatureService assignatureService;

    @GetMapping("/list-singular/{name}")
    private ResponseEntity<List<AssignatureEntity>> singular(@PathVariable("name")String name) {
        return ResponseEntity.ok(assignatureService.getByName(name));
    }
}

