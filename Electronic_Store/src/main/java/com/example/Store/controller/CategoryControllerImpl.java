package com.example.Store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Store.daos.CategoryDao;
import com.example.Store.entities.Category;
import com.example.Store.entities.ShopResopnse;
import com.example.Store.services.CategoryServiceImpl;

@CrossOrigin
@RestController
public class CategoryControllerImpl {
	
	@Autowired
	private CategoryDao categoryDao;

	@Autowired
	private CategoryServiceImpl categoryServiceImpl;
	
	@GetMapping("/getAllCategory")
	public ShopResopnse findAll()
	{
		
		return ShopResopnse.success( categoryDao.findAll());
		
	}

}
