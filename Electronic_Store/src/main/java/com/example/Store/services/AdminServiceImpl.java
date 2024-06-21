package com.example.Store.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Store.daos.AdminDao;

import com.example.Store.entities.Admin;


@Transactional
@Service
public class AdminServiceImpl {
	
	@Autowired
	private AdminDao adminDao;
	
	public Admin findByEmail(Admin adm)
	{
		Admin admin = adminDao.findByEmail(adm.getEmail());
		if(admin != null && admin.getPassword().equals(adm.getPassword()))
		return admin;
		else
		return null;
		
	}


}
