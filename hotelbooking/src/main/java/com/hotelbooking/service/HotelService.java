package com.hotelbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelbooking.entity.Hotel;
import com.hotelbooking.repository.HotelRepository;

@Service
public class HotelService {
	
	@Autowired
	private HotelRepository hotelRepository;
	
	
	public List<Hotel> getAllhotel() {
		return this.hotelRepository.findAll(); 
	}
	
	public Hotel addHotel(Hotel hotel) {
		return this.hotelRepository.save(hotel); 
	}
	
	
	
}
