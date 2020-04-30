package com.silva.thiago.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.silva.thiago.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
