package com.shopping.product.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.product.entity.Product;
import com.shopping.product.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/save")
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {
		
		
		return new ResponseEntity<Product>(productService.addProduct(product), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable int id) {
		
		return productService.getProductById(id);
	}
	
	@PutMapping("/{id}")
	public void updateProduct(@RequestBody Product product) {
		productService.updateProduct(product);
	}
	
}
