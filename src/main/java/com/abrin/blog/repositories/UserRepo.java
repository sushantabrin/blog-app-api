package com.abrin.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abrin.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
}
