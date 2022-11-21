package com.max.exempl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.max.exempl.model.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
