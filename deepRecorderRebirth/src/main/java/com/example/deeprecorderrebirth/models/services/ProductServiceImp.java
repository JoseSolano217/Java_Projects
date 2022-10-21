package com.example.deeprecorderrebirth.models.services;

import com.example.deeprecorderrebirth.entity.Product;
import com.example.deeprecorderrebirth.models.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ProductServiceImp  implements IProductService{
    @Autowired
    private ProductDao productDao;

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
       return  (List<Product>) productDao.findAll();
    }

    @Override
    public void save(Product product) {
        productDao.save(product);
    }
}
