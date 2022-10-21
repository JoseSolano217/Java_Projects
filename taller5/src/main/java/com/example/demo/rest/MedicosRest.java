package com.example.demo.rest;

import com.example.demo.model.MedicosEntity;
import com.example.demo.service.MedicosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/medicos/")
public class MedicosRest {

    @Autowired
    private MedicosService medicosService;

    @PostMapping("crear")
    private ResponseEntity<MedicosEntity> guardar(@RequestBody MedicosEntity medicos){
        MedicosEntity temporal=medicosService.create(medicos);

        try{
            return ResponseEntity.created(new URI("api/medicos/"+temporal.getIdmedico())).build();

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
    @PutMapping("editar")
    private ResponseEntity<MedicosEntity> editar(@RequestBody MedicosEntity medicos){
        MedicosEntity temporal=medicosService.create(medicos);

        try{
            return ResponseEntity.created(new URI("api/medicos/"+temporal.getIdmedico())).build();

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    @GetMapping("listar")
    private ResponseEntity<List<MedicosEntity>> listar(){
        return ResponseEntity.ok(medicosService.getAll());
    }

    @GetMapping("listar/{id}")
    private ResponseEntity<Optional<MedicosEntity>> findById(@PathVariable("id")Long id){
        return ResponseEntity.ok(medicosService.findById(id));
    }
    @DeleteMapping("eliminar")
    private ResponseEntity<MedicosEntity> delete(@RequestBody MedicosEntity medicos){
        medicosService.delete(medicos);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("eliminar/{id}")
    private ResponseEntity<MedicosEntity> deleteById(@PathVariable ("id")Long id){
        medicosService.deleteById(id);
        return ResponseEntity.ok().build();
    }
    @GetMapping("query1/{nombre}-{telefono}")
    private ResponseEntity<List<String>> query1(@PathVariable("nombre") String nombre, @PathVariable("telefono")String telefono){
        return ResponseEntity.ok(medicosService.query1(nombre,telefono));
    }
    @GetMapping("query4/{nombre}")
    private ResponseEntity<List<MedicosEntity>> query4(@PathVariable("nombre") String nombre){
        return ResponseEntity.ok(medicosService.query4(nombre));
    }
}
