package com.example.deeprecorderrebirth.models.services;

import com.example.deeprecorderrebirth.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProductService {
    List<Product> findAll();
    void save(Product product);
}
