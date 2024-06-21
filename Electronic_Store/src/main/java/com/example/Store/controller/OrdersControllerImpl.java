package com.example.Store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Store.daos.CategoryDao;
import com.example.Store.daos.OrdersDao;
import com.example.Store.entities.Cart;
import com.example.Store.entities.Category;
import com.example.Store.entities.Orders;
import com.example.Store.entities.ShopResopnse;
import com.example.Store.services.CategoryServiceImpl;
import com.example.Store.services.OrdersServiceImpl;

@CrossOrigin
@RestController
public class OrdersControllerImpl {
	
	@Autowired
	private OrdersDao ordersdao;
	
	
	@Autowired
	private OrdersServiceImpl ordersServiceImpl;
	
	@GetMapping("/getAllOrders")
	public ShopResopnse findAll()
	{
		
		return ShopResopnse.success(ordersdao.findAll());
		
	}
	
//	@GetMapping("/getAllCartProducts/{custId}")
//	public List<Orders> findAll(@PathVariable ("custId") int custId)
//	{
//		
//		List<Orders> orderproducts = ordersServiceImpl.findAllCartProductsBycustId(custId);
//		
//		
//		return orderproducts;
//		
//	}
	
	
	
	
	

}
