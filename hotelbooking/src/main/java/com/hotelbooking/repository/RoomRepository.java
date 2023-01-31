package com.hotelbooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelbooking.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer>{	
	public List<Room> getByHotelId(int hotelId); 
}
