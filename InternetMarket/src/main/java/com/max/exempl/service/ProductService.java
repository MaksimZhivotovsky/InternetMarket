package com.max.exempl.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.max.exempl.model.Product;
import com.max.exempl.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductService {
	
    private final ProductRepository productRepository;

    public List<Product> listProducts(String title) {
    	if (title != null) { 
    		return productRepository.findByTitle(title);
    	}
    	log.info("List product {} ", productRepository.findAll());
    	return productRepository.findAll();
    }
    
    public Product saveProduct(Product product) {
    	log.info("Saveing new {} ", product);
    	return productRepository.save(product);
    }
    
    public Product findById(Long id) {
    	log.info("Product findById {} ", id);
    	return productRepository.findById(id).get();
    }
    
    public Product updateProduct(Product product) {
    	Product productData = productRepository.findById(product.getId()).get();
    	if(productData != null) {
    		productData.setAuthor(product.getAuthor());
    		productData.setCity(product.getCity());
    		productData.setDescription(product.getDescription());
    		productData.setPrice(product.getPrice());
    		productData.setTitle(product.getTitle());
    		productRepository.save(productData);
    	}
    	log.info("updateProduct {} ", productData);
    	return productData;
    }
    
    public void deleteProductById(Long id) {
    	log.info("delete Product By Id {} ", id);
    	productRepository.deleteById(id);
    }
 }
