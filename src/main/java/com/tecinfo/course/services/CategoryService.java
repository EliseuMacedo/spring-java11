package com.tecinfo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecinfo.course.entities.Category;
import com.tecinfo.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		//Desde o java 8 essa op retorna Optional
		Optional<Category> obj = repository.findById(id);
		return obj.get(); //get returna o obj que estiver dentro do Optional user
	}
	

}
