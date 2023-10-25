package com.shopping.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.payment.entity.Payment;
import com.shopping.payment.service.PaymentService;

@RestController
@RequestMapping("payments")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	@GetMapping("/{id}")
	public Payment getPaymentById(@PathVariable int id) {
		return paymentService.getPaymentById(id);
	}
	
	@PostMapping("/")
	public void addPaymentDetails(@RequestBody Payment payment) {
		paymentService.addPaymentDetails(payment);
	}
	
	@PutMapping("/{id}")
	public void updatePaymentDetails(@RequestBody Payment payment) {
		paymentService.updatePaymentDetails(payment);
	}

}
