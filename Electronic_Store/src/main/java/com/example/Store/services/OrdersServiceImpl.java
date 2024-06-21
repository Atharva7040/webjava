package com.example.Store.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Store.daos.OrdersDao;
import com.example.Store.entities.Cart;
import com.example.Store.entities.Orders;

@Transactional
@Service
public class OrdersServiceImpl {
	
	@Autowired
	private OrdersDao orderDao;
	
	 public List<Orders> findAll(){
		  
		 
			return orderDao.findAll();
			  
		  }
	 
//	 public List<Orders> findAllCartProductsBycustId(int custId) {
//			
//			List <Orders> productsInCart = orderDao.findByCustomerId(custId);
//			
//			return productsInCart;
//		}
	 
	 
	 

}
