package com.shopping.order.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.shopping.order.entity.Order;
import com.shopping.order.repository.OrderRepository;
import com.shopping.order.responseentity.Product;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Order addOrder(Order order) {
		Product product= restTemplate.getForObject("http://PRODUCT-SERVICE/products/"+order.getProduct_id(),Product.class);
		double total=order.getOrder_quantity()*product.getPrice();
		order.setTotal_price(total);
		order.setOrder_date(new Date());
		order.setStatus("Payed");
		int remain= product.getQuantity()-order.getOrder_quantity();
		product.setQuantity(remain);
		restTemplate.put("http://PRODUCT-SERVICE/products/"+product.getProduct_id(), product);
		return orderRepository.save(order);
	}

}
