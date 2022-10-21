package com.example.deeprecorderrebirth.models.dao;

import com.example.deeprecorderrebirth.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientDao extends CrudRepository<Client, Long> {
}
