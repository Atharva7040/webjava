package com.example.Store.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Store.daos.CustomerDao;
import com.example.Store.entities.Customer;

@Transactional
@Service
public class CustomerServiceImpl {

	@Autowired
	private CustomerDao customerDao;
	
	public Customer findByEmail(Customer cust)
	{
		Customer customer = customerDao.findByEmail(cust.getEmail());
		if(customer != null && customer.getPassword().equals(cust.getPassword()))
		return customer;
		else
		return null;
		
	}

	public Customer save(Customer cust)
	{
		return customerDao.save(cust);
		
	}


//	@Autowired
//	private RegisterDao registerDao;
//
//	public Register findByEmail(String email) {
//		Register register = new Register();
//		register = registerDao.findByEmail(email);
//		if (register != null)
//			return register;
//		else
//			return null;
//	}
//
//	public List<Register> findAll()
//	{
//		List<Register> list = registerDao.findAll();
//		return list;
//	}
//
//	public Register registerUser(Register player) {
//		Register reg = registerDao.save(player);
//		System.out.println("PIDDDDDDDDDDDD "+reg);
//		return reg;
//	}
	

	
	
}
