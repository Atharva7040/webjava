package com.example.Store.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Store.daos.CartDao;

import com.example.Store.entities.Cart;
import com.example.Store.entities.Products;


@Transactional
@Service
public class CartServiceImpl {
	
	@Autowired
	private CartDao cartDao;
	
	 public List<Cart> findAll(){
		  
		 
			return cartDao.findAll();
			  
		  }
	 
	 
	 public Cart save(Cart cart)
		{
			return cartDao.save(cart);
			
		}


	public List<Cart> findAllCartProductsBycustId(int custId) {
	
		List <Cart> productsInCart = cartDao.findByCustomerId(custId);
		
		return productsInCart;
	}
	
	
	 public void deleteBycustomerIdAndAddedprodid(int addedprodid ,int customerId) {
			cartDao.deleteBycustomerIdAndAddedprodid(addedprodid, customerId);
		}


	

}
