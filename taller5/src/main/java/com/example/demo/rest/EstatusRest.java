package com.example.demo.rest;

import com.example.demo.model.EstatusEntity;
import com.example.demo.service.EstatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/estatus/")
public class EstatusRest {

    @Autowired
    private EstatusService estatusService;

    @PostMapping("crear")
    private ResponseEntity<EstatusEntity> guardar(@RequestBody EstatusEntity estatus) {
        EstatusEntity temporal = estatusService.create(estatus);

        try {
           return  ResponseEntity.created(new URI("api/estatus/"+temporal.getIdestatus())).build();

        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    @PutMapping("editar")
    private ResponseEntity<EstatusEntity> editar(@RequestBody EstatusEntity estatus) {
        EstatusEntity temporal = estatusService.create(estatus);

        try {
            return  ResponseEntity.created(new URI("api/estatus/"+temporal.getIdestatus())).build();

        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    @GetMapping("listar")
    private ResponseEntity<List<EstatusEntity>> listar(){
        return ResponseEntity.ok(estatusService.getAll());
    }
    @GetMapping("listar/{id}")
    private ResponseEntity<Optional<EstatusEntity>> findById(@PathVariable("id")Long id){
        return ResponseEntity.ok(estatusService.findById(id));
    }

    @DeleteMapping("eliminar")
    private ResponseEntity<Void> delete(@RequestBody EstatusEntity estatus){
        estatusService.delete(estatus);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("eliminar/{id}")
    private ResponseEntity<Void> deleteById(@PathVariable("id")Long id){
        estatusService.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
