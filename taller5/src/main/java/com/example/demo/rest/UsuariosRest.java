package com.example.demo.rest;

import com.example.demo.model.PacientesEntity;
import com.example.demo.model.UsuariosEntity;
import com.example.demo.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/usuarios/")
public class UsuariosRest {

    @Autowired
    private UsuariosService usuariosService;

    @PostMapping("crear")
    private ResponseEntity<UsuariosEntity> guardar(@RequestBody UsuariosEntity usuarios) {
        UsuariosEntity temporal = usuariosService.create(usuarios);

        try {
            return ResponseEntity.created(new URI("api/usuarios"+temporal.getIdusuario())).build();
        }catch (Exception e){
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PutMapping("editar")
    private ResponseEntity<UsuariosEntity> editar(@RequestBody UsuariosEntity usuarios) {
        UsuariosEntity temporal = usuariosService.create(usuarios);

        try {
            return ResponseEntity.created(new URI("api/usuarios"+temporal.getIdusuario())).build();
        }catch (Exception e){
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @GetMapping("listar")
    private ResponseEntity<List<UsuariosEntity>> listar(){
        return ResponseEntity.ok(usuariosService.getAll());
    }
    @GetMapping("listar/{id}")
    private ResponseEntity<Optional<UsuariosEntity>> findById(@PathVariable("id")Long id){
        return ResponseEntity.ok(usuariosService.findById(id));
    }
    @DeleteMapping("eliminar")
    private ResponseEntity<Void> delete(@RequestBody UsuariosEntity usuarios){
        usuariosService.delete(usuarios);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("eliminar/{id}")
    private ResponseEntity<Void> deleteById(@PathVariable("id")Long id){
        usuariosService.deleteById(id);
        return ResponseEntity.ok().build();
    }
    @GetMapping("query3/{usuario}-{password}")
    private ResponseEntity<List<PacientesEntity>> query3(@PathVariable("usuario")String usuario, @PathVariable("password")String password){
        return ResponseEntity.ok(usuariosService.query3(usuario,password));
    }

}
