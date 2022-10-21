package com.example.deeprecorderrebirth.models.services;

import com.example.deeprecorderrebirth.entity.Bill;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public interface IBillService {
    List<Bill> findAll();
    void save(Bill bill);

    @Transactional
    void remove(Long id);
}
