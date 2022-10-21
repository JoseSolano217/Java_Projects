package com.example.demo.rest;

import com.example.demo.model.CitasPacientesEntity;
import com.example.demo.service.CitasPacientesService;
import org.hibernate.annotations.OnDelete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/citaspacientes/")
public class CitasPacientesRest {

    @Autowired
    private CitasPacientesService citasPacientesService;

    @PostMapping("crear")
    private ResponseEntity<CitasPacientesEntity> guardar(@RequestBody CitasPacientesEntity citasPacientes) {
        CitasPacientesEntity temporal = citasPacientesService.create(citasPacientes);

        try {
            return ResponseEntity.created(new URI("api/citaspacientes/" + temporal.getIdcitasPacientes())).build();

        } catch (Exception e) {
           return  ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @GetMapping("listar")
    private ResponseEntity<List<CitasPacientesEntity>> listar(){
        return ResponseEntity.ok(citasPacientesService.getAll());
    }

    @PutMapping("editar")
    private ResponseEntity<CitasPacientesEntity> editar(@RequestBody CitasPacientesEntity citasPacientes) {
        CitasPacientesEntity temporal = citasPacientesService.create(citasPacientes);

        try {
            return ResponseEntity.created(new URI("api/citaspacientes/" + temporal.getIdcitasPacientes())).build();

        } catch (Exception e) {
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @GetMapping("listar/{id}")
    private ResponseEntity<Optional<CitasPacientesEntity>> findById(@PathVariable ("id") Long id){
        return ResponseEntity.ok(citasPacientesService.findById(id));
    }
    @DeleteMapping("eliminar")
    private ResponseEntity<Void> delete(@RequestBody CitasPacientesEntity citasPacientes){
        citasPacientesService.delete(citasPacientes);
       return ResponseEntity.ok().build();
    }
    @DeleteMapping("eliminar/{id}")
    private ResponseEntity<Void> deleteById(@PathVariable ("id") Long id){
        citasPacientesService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}