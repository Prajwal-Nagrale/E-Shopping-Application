package com.shopping.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.shopping.order.entity.Order;
import com.shopping.order.responseentity.Product;
import com.shopping.order.service.OrderService;

@RestController
@RequestMapping("orders")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/save")
	public ResponseEntity<Order> addOrder(@RequestBody Order order){
		return new ResponseEntity<Order>(orderService.addOrder(order), HttpStatus.OK);
	}
}
