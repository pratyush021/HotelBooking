package com.hotelbooking.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Configuration;
//import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.hotelbooking.entity.JwtResponse;

@FeignClient(url = "http://localhost:8080", name = "Authorization")
public interface AuthFeign {

	@GetMapping("/validate")
	public JwtResponse getValidity(@RequestHeader("Authorization") final String token);
}