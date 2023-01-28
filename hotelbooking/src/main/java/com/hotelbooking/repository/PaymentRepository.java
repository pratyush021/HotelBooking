package com.hotelbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelbooking.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
