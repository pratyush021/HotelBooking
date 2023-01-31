package com.hotelbooking.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotelbooking.entity.Reservation;
import com.hotelbooking.repository.ReservationRepository;
import com.hotelbooking.service.ReservationService;

@RestController
public class ReservationController {
	
	@Autowired
	private ReservationService service;
	
	
	@GetMapping("/getAllReservation")
	public ResponseEntity<List<Reservation>> getAll() throws Exception {
		List<Reservation> res = null; 
		try {
			res = this.service.getAll();
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		return ResponseEntity.ok(res); 
	}
	
	@PostMapping("/addReservation")
	public ResponseEntity<String> create(@RequestBody Reservation newReservation) throws Exception {
		
		try {
			this.service.addReservation(newReservation);
		} catch(Exception e) {
			e.printStackTrace(); 
		}
		return ResponseEntity.ok("Reservation successful"); 
		
	}

	
	
	@GetMapping("/getByUserId/{userId}")
	@ResponseBody
	public ResponseEntity<List<Reservation>> getByUser(@PathVariable int userId) throws Exception {
		List<Reservation> reservationList = null; 
		try {
			reservationList =  this.service.getByUserId(userId);
		} catch(Exception e) {
			e.printStackTrace(); 
		}
		return ResponseEntity.ok(reservationList); 
		
		
	}
}
