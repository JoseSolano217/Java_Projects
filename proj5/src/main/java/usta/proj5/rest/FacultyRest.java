package usta.proj5.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import usta.proj5.entity.FacultyEntity;
import usta.proj5.entity.FacultyEntity;
import usta.proj5.service.FacultyService;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/faculties")
public class FacultyRest {
    @Autowired
    private FacultyService facultyService;

    @PostMapping("/create")
    private ResponseEntity<FacultyEntity> save(@RequestBody FacultyEntity faculty) {
        FacultyEntity temp = facultyService.create(faculty);
        try {
            return ResponseEntity.created(new URI("faculty/" + temp.getId_faculty())).body(temp);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/list-all")
    private ResponseEntity<List<FacultyEntity>> listAll() {
        return ResponseEntity.ok(facultyService.listAll());
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Void> deletefaculty(@RequestBody FacultyEntity faculty) {
        facultyService.delete(faculty);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get-by-id/{id}")
    private ResponseEntity<Optional<FacultyEntity>> getByID(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(facultyService.findByID(id));
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<Void> deletefacultyByID(@PathVariable(name = "id") Long id) {
        facultyService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/edit")
    private ResponseEntity<FacultyEntity> edit(@RequestBody FacultyEntity faculty) {
        FacultyEntity temp = facultyService.create(faculty);
        try {
            return ResponseEntity.created(new URI("faculty/" + temp.getId_faculty())).body(temp);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
