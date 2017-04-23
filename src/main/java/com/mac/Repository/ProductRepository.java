package com.mac.Repository;

import com.mac.Entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;


@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    Product findById(int id);

    Collection<Product> findAll();

    Product save(Product product);
}