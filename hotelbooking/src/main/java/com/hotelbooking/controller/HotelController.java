package com.hotelbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotelbooking.entity.Hotel;
import com.hotelbooking.service.HotelService;

@RestController
public class HotelController {
	
	@Autowired
	private HotelService hotelService; 
	
	@GetMapping("/getAllHotels")
	@ResponseBody
	public ResponseEntity<List<Hotel>> getAllHotels() throws Exception{
		List<Hotel> res = null; 
		try {
			 res = this.hotelService.getAllhotel();
		} catch(Exception e) {
			e.printStackTrace(); 
		}
		return ResponseEntity.ok(res); 
	}
	
	@PostMapping("/addHotel")
	public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel) throws Exception {
		Hotel res = new Hotel(); 
		try {
			res = this.hotelService.addHotel(hotel); 
		} catch(Exception e) {
			e.printStackTrace(); 
		}
		return ResponseEntity.status(HttpStatus.OK).body(res);  
	}
}
