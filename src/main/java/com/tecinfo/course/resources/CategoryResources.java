package com.tecinfo.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecinfo.course.entities.Category;
import com.tecinfo.course.services.CategoryService;

@RestController
@RequestMapping(value="/categories")
public class CategoryResources {

	//Instanciar o service por injeção de dependência
	@Autowired
	private CategoryService service;
	
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		
		List<Category> CategoryList = service.findAll();
		return ResponseEntity.ok().body(CategoryList);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		
		Category Category = service.findById(id);
		return ResponseEntity.ok().body(Category);
		
	}
	
	
	
	

}
