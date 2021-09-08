package com.sree.productservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sree.productservice.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
