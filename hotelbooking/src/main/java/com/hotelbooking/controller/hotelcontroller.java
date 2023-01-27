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
public class hotelcontroller {
	
	@Autowired
	private HotelService hotelService; 
	
	@GetMapping("/getAllHotels")
	@ResponseBody
	public List<Hotel> getAllHotels() {
		List<Hotel> res = this.hotelService.getAllhotel();
		res.forEach(t ->{
			System.out.println(t.toString());
		}); 
		return res; 
	}
	
	@PostMapping("/addHotel")
	public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel) {
		Hotel res = this.hotelService.addHotel(hotel); 
		System.out.println(hotel.toString());
		return ResponseEntity.status(HttpStatus.OK).body(res);  
	}
}
