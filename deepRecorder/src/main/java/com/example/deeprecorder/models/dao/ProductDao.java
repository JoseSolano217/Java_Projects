package com.example.deeprecorder.models.dao;

import com.example.deeprecorder.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Long> {
}
