package com.hotelbooking.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JwtResponse {
	
	private String userName; 
	private String roles;
	private Boolean isValid; 
	
}
