package com.shopping.product.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.product.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
