package com.example.deeprecorderrebirth.models.services;

import com.example.deeprecorderrebirth.entity.Bill;
import com.example.deeprecorderrebirth.models.dao.BillDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class BillServiceImp implements  IBillService{

    @Autowired
    private BillDao billDao;

    @Override
    @Transactional(readOnly = true)
    public List<Bill> findAll() {
        return (List<Bill>) billDao.findAll();
    }

    @Override
    public void save(Bill bill) {
        billDao.save(bill);
    }

    @Override
    @Transactional
    public void remove(Long id) {
        billDao.deleteById(id);
    }
}
