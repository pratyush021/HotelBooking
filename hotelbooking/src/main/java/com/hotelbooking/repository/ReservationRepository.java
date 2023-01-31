package com.hotelbooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelbooking.entity.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer>{
	
	public List<Reservation> getByUserId(int userId); 

}
