package com.hotelbooking.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.hotelbooking.HotelbookingApplication;
import com.hotelbooking.entity.User;
import com.hotelbooking.feign.AuthFeign;
import com.hotelbooking.service.UserService;

import ch.qos.logback.classic.Logger;

@RestController
@CrossOrigin("*")
public class UserController {

	
	@Autowired
	private UserService userService;
	
	
	@Autowired
	private AuthFeign auth; 
	
	private static final Logger log = (Logger) LoggerFactory.getLogger(HotelbookingApplication.class); 
	
	@GetMapping("/health")
	public String healthCheck(@RequestHeader(name = "Authorization", required=true) String token ) throws Exception  {
		
		return token;
	}
	
	
	@GetMapping("/user")
	public ResponseEntity<List<User>> getAllUser() throws Exception {
		List<User> userList = null; 
		try {
			userList =  this.userService.getAllUser();
		} catch(Exception e) {
			e.printStackTrace(); 
		}
		
		return ResponseEntity.ok(userList); 
	}
	
	@PostMapping("/addUser")
	public ResponseEntity<String> addUser(@RequestBody User user) throws Exception {
		
		if(user == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("user can not be null"); 
		}
		
		try {
			this.userService.addUser(user); 
		} catch(Exception e) {
			throw new Exception("Invalid user details");  
		}
		
		return ResponseEntity.ok("user added"); 
				
		
	}
}
