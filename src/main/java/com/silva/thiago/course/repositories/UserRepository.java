package com.silva.thiago.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.silva.thiago.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
