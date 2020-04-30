package com.silva.thiago.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.silva.thiago.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	

}
