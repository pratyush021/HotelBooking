package com.hotelbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotelbooking.entity.Room;
import com.hotelbooking.service.RoomService;

@RestController
public class RoomController {

	
	@Autowired
	private RoomService roomService;
	
	
	@GetMapping("/getAllRoom")
	@ResponseBody
	public List<Room> getAllRoom() {
		return this.roomService.getAllRooms(); 
	}
	
	@PostMapping("/addRoom") 
	public Room addRoom(@RequestBody Room room) {
		return this.roomService.addRoom(room); 
	}
	
	@GetMapping("/getByHotelID/{hotelId}") 
	@ResponseBody
	public List<Room> getByHotelID(@PathVariable int hotelId) {
		return this.roomService.getByHotelId(hotelId); 
	}
}
