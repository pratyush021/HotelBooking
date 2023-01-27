package com.hotelbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelbooking.entity.Reservation;
import com.hotelbooking.repository.ReservationRepository;

@Service
public class ReservationService {
	
	@Autowired
	private ReservationRepository repository;
	
	public List<Reservation> getAll() {
		return this.repository.findAll(); 
	}
	
	public Reservation addReservation( Reservation newReservation) {
		return this.repository.save(newReservation); 
	}
	
}
