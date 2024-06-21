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

import com.example.Store.daos.ServiceDao;
import com.example.Store.entities.Products;
import com.example.Store.entities.Services;
import com.example.Store.entities.ShopResopnse;
import com.example.Store.services.ServicesDetailsImpl;

@RestController
@CrossOrigin
public class ServiceControllerImpl {
	
@Autowired
private ServiceDao serviceDao;

@Autowired
private ServicesDetailsImpl servicesDetailsimpl;

@GetMapping("/getAllServices")
public ShopResopnse findAll()
{
	
	return ShopResopnse.success( serviceDao.findAll());
	
}

	@PostMapping("/addServices")
	public String addServices(@RequestBody Services serv)
	{
		servicesDetailsimpl.save(serv);
		return "New Service is Added Succesfully";
	}
	
	@DeleteMapping("/deleteService/{sd_id}")
	public ResponseEntity<String> deleteService(@PathVariable int sd_id) {
		servicesDetailsimpl.deleteById(sd_id);
		return new ResponseEntity("Data deleted successfully-->"+ sd_id,HttpStatus.OK);
		
	}
	

//	@PutMapping("/updateService/{sd_id}")
//	public ResponseEntity<String> updateService(@PathVariable int sd_id) {
//		int n= servicesDetailsimpl.updateService(sd_id);
//		if(n==1)
//			 return new ResponseEntity("Data added successfully"+sd_id,HttpStatus.CREATED);
//		else
//		   return new ResponseEntity(HttpStatus.BAD_REQUEST);
//
//
//	}
	
	@PutMapping("/updateService/{sd_id}")
	 	public ResponseEntity<String> updateService(@RequestBody Services s) {
 		int n= servicesDetailsimpl.updateService(s);
	 		if(n==1)
	 			 return new ResponseEntity("Data added successfully"+s,HttpStatus.CREATED);
	 		else
	 		   return new ResponseEntity(HttpStatus.BAD_REQUEST);
	 
	 	}
	
	
	
	
	
	



}
