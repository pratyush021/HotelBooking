package com.hotelbooking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hotelcontroller {
	
	@GetMapping("/check")
	public String helth() {
		return "live 21" ; 
	}
}
