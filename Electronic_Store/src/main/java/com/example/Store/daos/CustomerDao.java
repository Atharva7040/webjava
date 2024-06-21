package com.example.Store.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Store.entities.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer> 
{

	Customer findByEmail(String email);
	
	Customer save(Customer cust);
	
	
	
	

}
