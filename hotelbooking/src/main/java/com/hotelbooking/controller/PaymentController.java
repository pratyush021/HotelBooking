package com.hotelbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotelbooking.entity.Payment;
import com.hotelbooking.service.PaymentService;

@RestController
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	@GetMapping("/payment")
	@ResponseBody
	public List<Payment> getAllPayment() {
		return this.paymentService.getAll(); 
	}
	
	@PostMapping("/addPayment")
	public Payment addPayment(@RequestBody Payment p) {
		return this.paymentService.addPayment(p); 
	}
	

}
