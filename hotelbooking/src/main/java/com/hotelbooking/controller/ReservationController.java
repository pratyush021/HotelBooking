package com.hotelbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotelbooking.entity.Reservation;
import com.hotelbooking.repository.ReservationRepository;
import com.hotelbooking.service.ReservationService;

@RestController
public class ReservationController {
	
	@Autowired
	private ReservationService service;
	
	
	@GetMapping("/getAllReservation")
	public List<Reservation> getAll() {
		List<Reservation> res = this.service.getAll();
		res.forEach(t -> {
			System.out.println(t.toString());
		});
		return res; 
	}
	
	@PostMapping("/addReservation")
	public Reservation create(@RequestBody Reservation newReservation) {
		System.out.println(newReservation.toString());
		return this.service.addReservation(newReservation); 
	}
}
