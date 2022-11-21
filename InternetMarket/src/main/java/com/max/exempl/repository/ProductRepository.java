package com.max.exempl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.max.exempl.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	List<Product> findByTitle(String title);
}
