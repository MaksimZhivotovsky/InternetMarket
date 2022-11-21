package com.max.exempl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
	@Column(name = "title")
    private String title;
	@Column(name = "description", columnDefinition = "text")
    private String description;
	@Column(name = "price")
    private int price;
	@Column(name = "city")
    private String city;
	@Column(name = "author")
    private String author;
}
