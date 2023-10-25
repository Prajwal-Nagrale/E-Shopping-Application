package com.shopping.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.payment.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer>{
	
}