package com.example.deeprecorderrebirth.models.services;

import com.example.deeprecorderrebirth.entity.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IClientService {
    List<Client> findAll();
    void save(Client client);
}
