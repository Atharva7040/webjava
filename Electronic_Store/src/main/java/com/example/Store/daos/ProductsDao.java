package com.example.Store.daos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Store.entities.Customer;
import com.example.Store.entities.Products;



public interface ProductsDao extends JpaRepository<Products, Integer> {
	
	
	
	@Query(value = "SELECT * FROM practiceforproject2.products where p_id = ?;",nativeQuery = true)
	 List<Products> getPorductsDetails(int id);
	
	public List<Products> findAll();
	
	
	public List<Products> findAllBytype(String type);

	@Query(value = "SELECT * FROM practiceforproject2.products where t_id = ?;",nativeQuery = true)
	 List<Products> getProducts(int id);
	
	
	Products save(Products product);
	
	 


	
	
	
}
