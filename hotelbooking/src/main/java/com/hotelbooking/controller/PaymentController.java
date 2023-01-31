package com.hotelbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<List<Payment>> getAllPayment() throws Exception{
		List<Payment> paymentList = null; 
		try {
			 paymentList = this.paymentService.getAll(); 
		} catch(Exception e) {
			e.printStackTrace(); 
		}
		
		return ResponseEntity.ok(paymentList); 
		
		
	}
	
	@PostMapping("/addPayment")
	public ResponseEntity<String> addPayment(@RequestBody Payment p) throws Exception {
		Payment res = new Payment();
		
		try {
			res =  this.paymentService.addPayment(p); 
		} catch(Exception e) {
			e.printStackTrace();
		}
		if(res != null) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Unable to process the payment"); 			
		} else {
			return ResponseEntity.ok("Payment successful"); 
		}
		
		
	}
	

}
