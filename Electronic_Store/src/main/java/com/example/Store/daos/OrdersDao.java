package com.example.Store.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Store.entities.Cart;
import com.example.Store.entities.Orders;

public interface OrdersDao extends JpaRepository<Orders, Integer>{
	
	public List<Orders> findAll();
	
//	public List<Orders> findByCustomerId(int custId);

}
