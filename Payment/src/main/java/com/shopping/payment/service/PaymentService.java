package com.shopping.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.payment.entity.Payment;
import com.shopping.payment.repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	public Payment getPaymentById( int id) {
		return paymentRepository.findById(id).orElse(null);
	}
	
	public void addPaymentDetails(Payment payment) {
		paymentRepository.save(payment);
	}
	
	public void updatePaymentDetails(Payment payment) {
		paymentRepository.save(payment);
	}
}
