package com.ijse.pr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.pr.entity.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{

    
} 