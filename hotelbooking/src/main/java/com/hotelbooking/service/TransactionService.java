package com.hotelbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelbooking.entity.Transaction;
import com.hotelbooking.repository.TransactionRepository;

@Service
public class TransactionService {
	
	@Autowired
	private TransactionRepository transactionRepository; 
	
	public List<Transaction> getAll() {
		return this.transactionRepository.findAll(); 
	}
	
	public Transaction addTransaction(Transaction t) {
		return this.transactionRepository.save(t); 
	}

}
