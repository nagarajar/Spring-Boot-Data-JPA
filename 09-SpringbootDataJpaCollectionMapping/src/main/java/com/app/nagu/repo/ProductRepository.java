package com.app.nagu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.nagu.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>
{

}
