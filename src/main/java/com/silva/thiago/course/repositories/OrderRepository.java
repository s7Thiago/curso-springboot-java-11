package com.silva.thiago.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.silva.thiago.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
