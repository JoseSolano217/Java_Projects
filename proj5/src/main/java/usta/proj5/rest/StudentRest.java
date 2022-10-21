package usta.proj5.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import usta.proj5.entity.StudentEntity;
import usta.proj5.service.StudentService;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentRest {
    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    private ResponseEntity<StudentEntity> save(@RequestBody StudentEntity student) {
        StudentEntity temp = studentService.create(student);
        try {
            return ResponseEntity.created(new URI("student/" + temp.getId_student())).body(temp);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/list-all")
    private ResponseEntity<List<StudentEntity>> listAll() {
        return ResponseEntity.ok(studentService.listAll());
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Void> deletestudent(@RequestBody StudentEntity student) {
        studentService.delete(student);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get-by-id/{id}")
    private ResponseEntity<Optional<StudentEntity>> getByID(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(studentService.findByID(id));
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<Void> deletestudentByID(@PathVariable(name = "id") Long id) {
        studentService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/edit")
    private ResponseEntity<StudentEntity> edit(@RequestBody StudentEntity student) {
        StudentEntity temp = studentService.create(student);
        try {
            return ResponseEntity.created(new URI("student/" + temp.getId_student())).body(temp);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
