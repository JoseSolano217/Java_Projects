package com.example.deeprecorder.models.dao;

import com.example.deeprecorder.entity.Bill;
import org.springframework.data.repository.CrudRepository;

public interface BillDao extends CrudRepository<Bill, Long> {
}
