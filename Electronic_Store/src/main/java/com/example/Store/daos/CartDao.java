package com.example.Store.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.Store.entities.Cart;
import com.example.Store.entities.Products;


public interface CartDao extends JpaRepository<Cart, Integer>{
	
	public List<Cart> findAll();
	
	Cart save(Cart cart);

	public List<Cart> findByCustomerId(int custId);
//
//	@Query(value = "delete from cart where s_id = ? and c_id = ?", nativeQuery = true)
//	public void deleteBycustomerIdAndAddedprodid( int addedprodid, int customerId);
	
	@Modifying
	@Query(value = "delete from cart where s_id = ? and c_id = ?", nativeQuery = true)
	public void deleteBycustomerIdAndAddedprodid(int addedprodid, int customerId);


}
