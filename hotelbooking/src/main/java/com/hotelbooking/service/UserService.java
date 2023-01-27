package com.hotelbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelbooking.entity.User;
import com.hotelbooking.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public List<User> getAllUser() {
		return this.userRepository.findAll(); 
	}
	
	public User addUser(User user) {
		return this.userRepository.save(user); 
	}


}
