package com.hotelbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotelbooking.entity.Transaction;
import com.hotelbooking.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	private TransactionService service; 
	
	
	@GetMapping("/transaction")
	public ResponseEntity<List<Transaction>> getAllTransaction() throws Exception {
		List<Transaction> transactionList = null; 
		try {
			transactionList = this.service.getAll(); 
		} catch(Exception e) {
			e.printStackTrace(); 
		}
		
		return ResponseEntity.ok(transactionList); 
		
	}
	
	
	@PostMapping("/addTransaction")
	public ResponseEntity<String> addTransaction(@RequestBody Transaction t) {
		Transaction res = new Transaction(); 
		try {
			res = this.service.addTransaction(t); 
		} catch(Exception e) {
			e.printStackTrace(); 
		}
		
		return ResponseEntity.ok("Transaction details added"); 
	}
}
