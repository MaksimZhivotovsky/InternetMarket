package com.max.exempl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.max.exempl.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
