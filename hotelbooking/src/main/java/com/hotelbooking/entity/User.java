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
public class User {
	@Id
	private int userid; 
	private String firstName; 
	private String lastName; 
	private String emailId; 
	private String phoneNumber; 
	private String location; 
	
}
