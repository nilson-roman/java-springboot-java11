package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

// Não preciso (é opcional) usar o @Repository por já estar
// herdando do "JpaRepository"

public interface UserRepository extends JpaRepository<User, Long>{
	
}
