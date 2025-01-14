package com.example.Store.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Store.daos.ProductsDao;
import com.example.Store.entities.Customer;
import com.example.Store.entities.Products;
import com.example.Store.entities.Services;

@Transactional
@Service
public class ProductServiceImpl {
	
	@Autowired
	private ProductsDao productsDao;
	
	 public List<Products> findAll(){
		  
		 
			return productsDao.findAll();
			  
		  }
	 
	 public List<Products> findAllBytype(String type)
	 {
		return productsDao.findAllBytype(type); 
		 
	 }
	 
	 public Optional<Products> findById(int p_id){
		  
		 
			return productsDao.findById(p_id);
			  
		  }
	 
	 public Products save(Products product)
		{
			return productsDao.save(product);
			
		}
	 
	 public void deleteById(int p_id) {
			productsDao.deleteById(p_id);
		}
	 
//	 public int updateProducts(int p_id) {
//			Optional<Products> op=productsDao.findById(p_id);
//			if(op.isPresent()) {
//				Products product=op.get();
//				product.setName(op.get().getName());
//				product.setDescription(op.get().getDescription());
//				product.setPrice(op.get().getPrice());
//				product.setType(op.get().getType());
//				product.setImage(op.get().getImage());
//				product.setT_id(op.get().getT_id());
//				
//				
//				productsDao.save(product);
//				return 1;
//			}
//			return 0 ;
//			
//	 }

	 
	 
	  public int updateProducts(Products product) {
			Optional<Products> op=productsDao.findById(product.getProductId());
			if(op.isPresent()) {
				Products p = op.get();
				p.setProductId(product.getProductId());
				p.setName(product.getName());
				p.setDescription(product.getDescription());
				p.setPrice(product.getPrice());
				p.setImage(product.getImage());
				p.setType(product.getType());
				p.setT_id(product.getT_id());
				productsDao.save(p);
				return 1;
			}
			return 0;
		}
	 

}
