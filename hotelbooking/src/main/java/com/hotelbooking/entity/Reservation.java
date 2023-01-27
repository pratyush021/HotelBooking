package com.hotelbooking.entity;

import java.sql.Timestamp;

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
public class Reservation {

	@Id
	private int reservationId; 
	private int hotelId; 
	private int userId; 
	private int roomId; 
	
	private String guestList; 
	private Timestamp checkId; 
	private Timestamp checkOut; 
	private double amount; 
}
