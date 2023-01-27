package com.hotelbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotelbooking.entity.User;
import com.hotelbooking.service.UserService;

@RestController
public class UserController {

	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/user")
	public List<User> getAllUser(){
		return this.userService.getAllUser(); 
	}
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return this.userService.addUser(user); 
	}
}
