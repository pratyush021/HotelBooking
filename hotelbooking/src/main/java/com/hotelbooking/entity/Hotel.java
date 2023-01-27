package com.hotelbooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Hotel {
	
	@Id
	private int hotelId; 
	private String hotelName; 
	private String hotelLocation; 
	
	

}
