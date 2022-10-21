package com.example.deeprecorderrebirth.models.services;

import com.example.deeprecorderrebirth.entity.Enterprise;
import com.example.deeprecorderrebirth.models.dao.EnterpriseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class EnterpriseServiceImp implements IEnterpriseService{

    @Autowired
    private EnterpriseDao enterpriseDao;

    @Override
    @Transactional(readOnly = true)
    public List<Enterprise> findAll() {
        return (List<Enterprise>) enterpriseDao.findAll();
    }

}
