package com.hotelbooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Room {

	@Id
	private int roomId; 
	private int hotelId; 
	
	private int capacity; 
	private double price; 
	private String facilities;
	private boolean isBooked; //update it to true when a room is booked. 
}	
