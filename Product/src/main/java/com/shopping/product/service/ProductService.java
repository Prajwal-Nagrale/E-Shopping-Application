package com.shopping.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.shopping.product.entity.Product;
import com.shopping.product.respository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product addProduct(Product product) {
		
		return productRepository.save(product);
	}
	
	public Product getProductById( int id) {
		return productRepository.findById(id).orElse(null);
	}
	
	public void updateProduct( Product product) {
		productRepository.save(product);
	}

}
