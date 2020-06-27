package com.tecinfo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecinfo.course.entities.Product;
import com.tecinfo.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		//Desde o java 8 essa op retorna Optional
		Optional<Product> obj = repository.findById(id);
		return obj.get(); //get returna o obj que estiver dentro do Optional Product
	}
	

}
