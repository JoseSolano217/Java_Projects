package com.example.demo.rest;

import com.example.demo.model.PacientesEntity;
import com.example.demo.model.PagosEntity;
import com.example.demo.service.PacientesService;
import com.example.demo.service.PagosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/pagos/")
public class PagosRest {

    @Autowired
    private PagosService pagosService;

    @PostMapping("crear")
    private ResponseEntity<PagosEntity> guardar(@RequestBody PagosEntity pagos){
        PagosEntity temporal=pagosService.create(pagos);

        try{
            return ResponseEntity.created(new URI("api/paciente/"+temporal.getIdpago())).build();

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
    @PutMapping("editar")
    private ResponseEntity<PagosEntity> editar(@RequestBody PagosEntity pagos){
        PagosEntity temporal=pagosService.create(pagos);

        try{
            return ResponseEntity.created(new URI("api/pagos/"+temporal.getIdpago())).build();

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    @GetMapping("listar")
    private ResponseEntity<List<PagosEntity>> listar(){
        return ResponseEntity.ok(pagosService.getAll());
    }

    @GetMapping("listar/{id}")
    private ResponseEntity<Optional<PagosEntity>> findById(@PathVariable("id")Long id){
        return ResponseEntity.ok(pagosService.findById(id));
    }
    @DeleteMapping("eliminar")
    private ResponseEntity<PagosEntity> delete(@RequestBody PagosEntity pagos){
        pagosService.delete(pagos);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("eliminar/{id}")
    private ResponseEntity<PagosEntity> deleteById(@PathVariable ("id")Long id){
        pagosService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
