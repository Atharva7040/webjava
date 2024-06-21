package com.example.Store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Store.daos.CartDao;

import com.example.Store.entities.Cart;
import com.example.Store.entities.Products;
import com.example.Store.services.CartServiceImpl;


@RestController
public class CartControllerImpl {

	//@Autowired
	//private CartDao cartDao;

	@Autowired
	private CartServiceImpl cartServiceImpl;
	
	@GetMapping("/getAllCartProducts/{custId}")
	public List<Cart> findAll(@PathVariable ("custId") int custId)
	{
		
		List<Cart> cartproducts = cartServiceImpl.findAllCartProductsBycustId(custId);
		
		
		return cartproducts;
		
	}
	
	
	@PostMapping("/addCart")
	public String addCart(@RequestBody Cart cart)
	{
		cartServiceImpl.save(cart);
		return "New Product is Added Succesfull";
	}
	
	
	@DeleteMapping("/deleteCart/{s_id}/{customerId}")
	public ResponseEntity<String> deleteBycustomerIdAndAddedprodid(@PathVariable ("s_id") int addedprodid,@PathVariable ("customerId") int  customerId) {
		cartServiceImpl.deleteBycustomerIdAndAddedprodid(addedprodid,customerId);
		return new ResponseEntity("Data deleted successfully-->"+ addedprodid,HttpStatus.OK);
		
	}
	
	
}
