package com.hotelbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelbooking.entity.Payment;
import com.hotelbooking.repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository paymentRepository; 
	
	
	public List<Payment> getAll() {
		return this.paymentRepository.findAll(); 
	}
	
	public Payment addPayment(Payment p ) {
		return this.paymentRepository.save(p); 
	}
}
