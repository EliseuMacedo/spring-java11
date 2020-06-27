package com.tecinfo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecinfo.course.entities.Order;

//essa interface já tem várias implementações padrão
public interface OrderRepository extends JpaRepository<Order, Long> {
}
