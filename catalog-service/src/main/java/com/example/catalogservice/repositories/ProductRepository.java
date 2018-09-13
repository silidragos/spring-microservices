package com.example.catalogservice.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.catalogservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	Optional<Product> findByCode(String code);
}
