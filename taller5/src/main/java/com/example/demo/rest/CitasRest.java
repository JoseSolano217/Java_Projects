package com.example.demo.rest;

import com.example.demo.model.CitasEntity;
import com.example.demo.service.CitasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/citas/")
public class CitasRest {

    @Autowired
    private CitasService citasService;

    @PostMapping("crear")
    private ResponseEntity<CitasEntity> guardar(@RequestBody CitasEntity citas){
        CitasEntity temporal=citasService.create(citas);

        try{
            return ResponseEntity.created(new URI("api/citas/"+temporal.getIdcita())).build();

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PutMapping("editar")
    private ResponseEntity<CitasEntity> editar(@RequestBody CitasEntity citas){
        CitasEntity temporal=citasService.create(citas);

        try{
            return ResponseEntity.created(new URI("api/citas/"+temporal.getIdcita())).build();

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("listar")
    private ResponseEntity<List<CitasEntity>> listar(){
        return ResponseEntity.ok(citasService.getAll());
    }
    @GetMapping("listar/{id}")
    private ResponseEntity<Optional<CitasEntity>> findById(@PathVariable("id")Long id){
        return ResponseEntity.ok(citasService.findById(id));
    }

    @DeleteMapping("eliminar")
    private ResponseEntity<Void>  delete(@RequestBody CitasEntity citas){
        citasService.delete(citas);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("eliminar/{id}")
    private ResponseEntity<Void>  delete(@PathVariable("id") Long id){
        citasService.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
