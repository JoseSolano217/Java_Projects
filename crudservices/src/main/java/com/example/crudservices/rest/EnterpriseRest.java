package com.example.crudservices.rest;

import com.example.crudservices.model.EnterpriseEntity;
import com.example.crudservices.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/enterprise")
public class EnterpriseRest {

    @Autowired
    private EnterpriseService enterpriseService;

    @GetMapping
    private ResponseEntity<List<EnterpriseEntity>> listEveryEnteprise() {
        return ResponseEntity.ok(enterpriseService.getAllEnterprises());
    }
}
