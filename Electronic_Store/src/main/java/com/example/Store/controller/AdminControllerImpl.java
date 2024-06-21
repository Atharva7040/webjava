package com.example.Store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Store.daos.AdminDao;

import com.example.Store.entities.Admin;

import com.example.Store.entities.ShopResopnse;
import com.example.Store.services.AdminServiceImpl;


@RestController
public class AdminControllerImpl {
	
	@Autowired
	private AdminServiceImpl adminServiceImpl;

	@Autowired
	private AdminDao adminDao;
	
	@PostMapping("/admin")
	public ShopResopnse login(@RequestBody Admin adm)
	{
		Admin admin = adminDao.findByEmail(adm.getEmail());
		System.out.println(admin);
		
		if(admin != null && admin.getPassword().equals(adm.getPassword()) )
				
			return ShopResopnse.success(admin);
		
		return ShopResopnse.error("Invalid email or password");
		
		
		
	}

}
