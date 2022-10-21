package com.example.deeprecorderrebirth.models.dao;

import com.example.deeprecorderrebirth.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao  extends CrudRepository<Product, Long> {
}
