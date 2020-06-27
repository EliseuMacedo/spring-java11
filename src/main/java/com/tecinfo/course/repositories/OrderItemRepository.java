package com.tecinfo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecinfo.course.entities.OrderItem;

//essa interface já tem várias implementações padrão
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
