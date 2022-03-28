package com.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.entity.Products;

public interface ProductRepository extends CrudRepository<Products,Integer> {
	}

