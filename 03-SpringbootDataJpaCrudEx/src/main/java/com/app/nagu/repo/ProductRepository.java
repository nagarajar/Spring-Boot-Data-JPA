package com.app.nagu.repo;

import org.springframework.data.repository.CrudRepository;

import com.app.nagu.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> 
{

}
