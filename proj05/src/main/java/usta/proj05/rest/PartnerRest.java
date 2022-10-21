package usta.proj05.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import usta.proj05.models.PartnerEntity;
import usta.proj05.service.PartnerService;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/partners")
public class PartnerRest {
    @Autowired
    private PartnerService studentService;

    @PostMapping("/create")
    private ResponseEntity<PartnerEntity> save(@RequestBody PartnerEntity partner) {
        PartnerEntity temp = studentService.create(partner);
        try {
            return ResponseEntity.created(new URI("partner/" + temp.getId_partner())).body(temp);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/list-all")
    private ResponseEntity<List<PartnerEntity>> listAll() {
        return ResponseEntity.ok(studentService.listAll());
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Void> deletePartner(@RequestBody PartnerEntity student) {
        studentService.delete(student);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get-by-id/{id}")
    private ResponseEntity<Optional<PartnerEntity>> getByID(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(studentService.findByID(id));
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<Void> deletePartnerByID(@PathVariable(name = "id") Long id) {
        studentService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/edit")
    private ResponseEntity<PartnerEntity> edit(@RequestBody PartnerEntity partner) {
        PartnerEntity temp = studentService.create(partner);
        try {
            return ResponseEntity.created(new URI("partner/" + temp.getId_partner())).body(temp);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
