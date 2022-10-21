package com.example.deeprecorder.models.service;

import com.example.deeprecorder.entity.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IClientService {
    List<Client> findAll();
    void save(Client client);
}
