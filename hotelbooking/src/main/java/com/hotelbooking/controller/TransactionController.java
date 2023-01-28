package com.hotelbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public List<Transaction> getAllTransaction() {
		return this.service.getAll();
	}
	
	
	@PostMapping("/addTransaction")
	public Transaction addTransaction(@RequestBody Transaction t) {
		System.out.println(t.toString());
		return this.service.addTransaction(t); 
	}
}
