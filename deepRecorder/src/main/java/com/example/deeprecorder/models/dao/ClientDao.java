package com.example.deeprecorder.models.dao;

import com.example.deeprecorder.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientDao extends CrudRepository<Client, Long> {
}
