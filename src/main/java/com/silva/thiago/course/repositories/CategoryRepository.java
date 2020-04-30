package com.silva.thiago.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.silva.thiago.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}
