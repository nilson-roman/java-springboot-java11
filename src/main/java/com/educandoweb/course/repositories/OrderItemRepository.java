package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;

// Não preciso (é opcional) usar o @Repository por já estar
// herdando do "JpaRepository"

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
