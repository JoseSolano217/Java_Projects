package usta.proj5.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import usta.proj5.entity.SubjectEntity;
import usta.proj5.service.SubjectService;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/subjects")
public class SubjectRest {
    @Autowired
    private SubjectService subjectService;

    @PostMapping("/create")
    private ResponseEntity<SubjectEntity> save(@RequestBody SubjectEntity faculty) {
        SubjectEntity temp = subjectService.create(faculty);
        try {
            return ResponseEntity.created(new URI("faculty/" + temp.getId_subject())).body(temp);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/list-all")
    private ResponseEntity<List<SubjectEntity>> listAll() {
        return ResponseEntity.ok(subjectService.listAll());
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Void> deletefaculty(@RequestBody SubjectEntity faculty) {
        subjectService.delete(faculty);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get-by-id/{id}")
    private ResponseEntity<Optional<SubjectEntity>> getByID(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(subjectService.findByID(id));
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<Void> deletefacultyByID(@PathVariable(name = "id") Long id) {
        subjectService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/edit")
    private ResponseEntity<SubjectEntity> edit(@RequestBody SubjectEntity faculty) {
        SubjectEntity temp = subjectService.create(faculty);
        try {
            return ResponseEntity.created(new URI("faculty/" + temp.getId_subject())).body(temp);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
