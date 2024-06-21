package com.example.Store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Store.daos.ProductsDao;
import com.example.Store.entities.Customer;
import com.example.Store.entities.Products;
import com.example.Store.entities.Services;
import com.example.Store.entities.ShopResopnse;
import com.example.Store.services.ProductServiceImpl;
@CrossOrigin
@RestController
public class ProductControllerImpl {
	
	@Autowired
	private ProductsDao productsDao;
	
	@Autowired
	private ProductServiceImpl productServiceImpl;
	
	@GetMapping("/getAllProducts")
	public List<Products> findAll()
	{
		
		return productsDao.findAll();
		
	}
	
	@GetMapping("/getAllProducts/{type}")
	public List<Products> findAllBytype(@PathVariable("type") String type)
	{
		return productsDao.findAllBytype(type);
	}

	@GetMapping("/getProducts/{t_id}")
	public ShopResopnse getProducts(@PathVariable("t_id") int t_id)
	{
		List<Products> list =  productsDao.getProducts(t_id);
		
		return ShopResopnse.success(list);
	}
	
	
	@GetMapping("/getProductsDetails/{p_id}")
	public ShopResopnse getProductsDetails(@PathVariable("p_id") int p_id)
	{
		List<Products> plist =  productsDao.getPorductsDetails(p_id);
		
		return ShopResopnse.success(plist);
	}
	
	
	@PostMapping("/addProducts")
	public String addProducts(@RequestBody Products product)
	{
		productServiceImpl.save(product);
		return "New Product is Added Succesfull";
	}
	

	@DeleteMapping("/deleteProduct/{p_id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int p_id) {
		productServiceImpl.deleteById(p_id);
		return new ResponseEntity("Data deleted successfully-->"+ p_id,HttpStatus.OK);
		
	}
	
	
	
	
	@PutMapping("/updateProducts/{p_id}")
	public ResponseEntity<String> updateProducts(@RequestBody Products p) {
		int n= productServiceImpl.updateProducts(p);
		if(n==1)
			 return new ResponseEntity("Data added successfully"+p,HttpStatus.CREATED);
		else
		   return new ResponseEntity(HttpStatus.BAD_REQUEST);


	}
	
	
	

	
	
	

}
