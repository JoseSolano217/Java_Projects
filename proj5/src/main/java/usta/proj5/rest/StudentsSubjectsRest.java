package usta.proj5.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import usta.proj5.entity.StudentsSubjectsEntity;
import usta.proj5.service.StudentsSubjectsService;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/breaking-table")
public class StudentsSubjectsRest {
    @Autowired
    private StudentsSubjectsService studentsSubjectsService;

    @PostMapping("/create")
    private ResponseEntity<StudentsSubjectsEntity> save(@RequestBody StudentsSubjectsEntity studentsSubjects) {
        StudentsSubjectsEntity temp = studentsSubjectsService.create(studentsSubjects);
        try {
            return ResponseEntity.created(new URI("breaking-table/" + temp.getId_students_subjects())).body(temp);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/list-all")
    private ResponseEntity<List<StudentsSubjectsEntity>> listAll() {
        return ResponseEntity.ok(studentsSubjectsService.listAll());
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Void> deletestudent(@RequestBody StudentsSubjectsEntity student) {
        studentsSubjectsService.delete(student);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get-by-id/{id}")
    private ResponseEntity<Optional<StudentsSubjectsEntity>> getByID(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(studentsSubjectsService.findByID(id));
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<Void> deletestudentByID(@PathVariable(name = "id") Long id) {
        studentsSubjectsService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/edit")
    private ResponseEntity<StudentsSubjectsEntity> edit(@RequestBody StudentsSubjectsEntity student) {
        StudentsSubjectsEntity temp = studentsSubjectsService.create(student);
        try {
            return ResponseEntity.created(new URI("breaking-table/" + temp.getId_students_subjects())).body(temp);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
