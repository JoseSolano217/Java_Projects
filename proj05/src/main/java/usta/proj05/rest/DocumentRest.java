package usta.proj05.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import usta.proj05.models.DocumentEntity;
import usta.proj05.service.DocumentService;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/documents")
public class DocumentRest {
    @Autowired
    private DocumentService documentService;
    
    @PostMapping("/create")
    private ResponseEntity<DocumentEntity> save(@RequestBody DocumentEntity document) {
        DocumentEntity temp = documentService.  create(document);
        try {
            return ResponseEntity.created(new URI("document/" + temp.getId_document())).body(temp);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/list-all")
    private ResponseEntity<List<DocumentEntity>> listAll() {
        return ResponseEntity.ok(documentService.listAll());
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Void> deletedocument(@RequestBody DocumentEntity document) {
        documentService.delete(document);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get-by-id/{id}")
    private ResponseEntity<Optional<DocumentEntity>> getByID(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(documentService.findByID(id));
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<Void> deleteDocumentByID(@PathVariable(name = "id") Long id) {
        documentService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/edit")
    private ResponseEntity<DocumentEntity> edit(@RequestBody DocumentEntity document) {
        DocumentEntity temp = documentService.create(document);
        try {
            return ResponseEntity.created(new URI("document/" + temp.getId_document())).body(temp);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
