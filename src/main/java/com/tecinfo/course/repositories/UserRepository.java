package com.tecinfo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecinfo.course.entities.User;

//essa interface já tem várias implementações padrão
public interface UserRepository extends JpaRepository<User, Long> {
}
