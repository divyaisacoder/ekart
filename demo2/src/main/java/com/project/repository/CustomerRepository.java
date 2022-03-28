package com.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.entity.Customer;


public interface CustomerRepository extends CrudRepository<Customer,Integer> {
}
