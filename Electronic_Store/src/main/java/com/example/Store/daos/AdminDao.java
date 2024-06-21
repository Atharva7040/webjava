package com.example.Store.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Store.entities.Admin;
import com.example.Store.entities.Customer;

public interface AdminDao extends JpaRepository<Admin, Integer> 
{

	Admin findByEmail(String email);
	
	
	
	
	
	

}
