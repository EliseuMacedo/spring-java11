package com.tecinfo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecinfo.course.entities.Category;

//essa interface já tem várias implementações padrão
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
