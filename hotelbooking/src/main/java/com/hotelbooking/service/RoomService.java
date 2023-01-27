package com.hotelbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelbooking.entity.Room;
import com.hotelbooking.repository.RoomRepository;

@Service
public class RoomService {
	
	@Autowired
	private RoomRepository repository; 
	
	
	public List<Room> getAllRooms() {
		return this.repository.findAll(); 
	}
	
	public Room addRoom(Room room) { 
		return this.repository.save(room); 
	}
	
	
	
}
