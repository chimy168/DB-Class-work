package co.istad.jdbc.dao;

import co.istad.jdbc.model.Product;

import java.util.List;

public interface ProDao {

//    1. Read all records from DB
//    * Expected return value

        List<Product> findAll();
        Product findById(Integer id);
        void save(Product product);
        void delete(Integer id);
    }


