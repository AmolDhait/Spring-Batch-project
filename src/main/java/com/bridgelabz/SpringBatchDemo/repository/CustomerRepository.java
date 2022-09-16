package com.bridgelabz.SpringBatchDemo.repository;

import com.bridgelabz.SpringBatchDemo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
