package com.example.demo.rest;

import com.example.demo.model.MedicosEntity;
import com.example.demo.model.PacientesEntity;
import com.example.demo.service.MedicosService;
import com.example.demo.service.PacientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/paciente/")
public class PacienteRest {

    @Autowired
    private PacientesService pacientesService;

    @PostMapping("crear")
    private ResponseEntity<PacientesEntity> guardar(@RequestBody PacientesEntity paciente){
        PacientesEntity temporal=pacientesService.create(paciente);

        try{
            return ResponseEntity.created(new URI("api/paciente/"+temporal.getIdpaciente())).build();

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
    @PutMapping("editar")
    private ResponseEntity<PacientesEntity> editar(@RequestBody PacientesEntity paciente){
        PacientesEntity temporal=pacientesService.create(paciente);

        try{
            return ResponseEntity.created(new URI("api/paciente/"+temporal.getIdpaciente())).build();

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    @GetMapping("listar")
    private ResponseEntity<List<PacientesEntity>> listar(){
        return ResponseEntity.ok(pacientesService.getAll());
    }

    @GetMapping("listar/{id}")
    private ResponseEntity<Optional<PacientesEntity>> findById(@PathVariable("id")Long id){
        return ResponseEntity.ok(pacientesService.findById(id));
    }
    @DeleteMapping("eliminar")
    private ResponseEntity<PacientesEntity> delete(@RequestBody PacientesEntity paciente){
        pacientesService.delete(paciente);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("eliminar/{id}")
    private ResponseEntity<PacientesEntity> deleteById(@PathVariable ("id")Long id){
        pacientesService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("query2/{nombre}-{documento}")
    private ResponseEntity<List<String>> query2(@PathVariable ("nombre") String nombre, @PathVariable("documento")String documento){
        return ResponseEntity.ok(pacientesService.query2(nombre,documento));
    }
}
