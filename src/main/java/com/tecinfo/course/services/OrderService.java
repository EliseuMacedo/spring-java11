package com.tecinfo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecinfo.course.entities.Order;
import com.tecinfo.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		//Desde o java 8 essa op retorna Optional
		Optional<Order> obj = repository.findById(id);
		return obj.get(); //get returna o obj que estiver dentro do Optional Order
	}
	

}
