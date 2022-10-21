package com.example.deeprecorderrebirth.models.services;

import com.example.deeprecorderrebirth.entity.Client;
import com.example.deeprecorderrebirth.models.dao.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ClientServiceImp implements IClientService{

    @Autowired
    private ClientDao clientDao;

    @Override
    @Transactional(readOnly = true)
    public List<Client> findAll() {
        return (List<Client>) clientDao.findAll();
    }

    @Override
    public void save(Client client) {
        clientDao.save(client);
    }
}
