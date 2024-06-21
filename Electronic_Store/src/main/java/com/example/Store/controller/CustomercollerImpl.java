package com.example.Store.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties.Credential;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Store.daos.CustomerDao;
import com.example.Store.entities.Customer;
import com.example.Store.entities.ShopResopnse;
import com.example.Store.services.CustomerServiceImpl;

@CrossOrigin
@RestController
public class CustomercollerImpl {
	
	@Autowired
	private CustomerServiceImpl customerService;

	@Autowired
	private CustomerDao customerDao;
	
	@PostMapping("/login")
	public ShopResopnse login(@RequestBody Customer cust)
	{
		Customer customer = customerDao.findByEmail(cust.getEmail());
		System.out.println(customer);
		
		if(customer != null && customer.getPassword().equals(cust.getPassword()) )
			return ShopResopnse.success(customer);
		
		return ShopResopnse.error("Invalid email or password");
		
		
	}
	

	@PostMapping("/register")
	public String registerCustomer(@RequestBody Customer cust)
	{
		customerService.save(cust);
		return "New Register is Succesfull";
	}
	
	

}
