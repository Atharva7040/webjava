package com.example.Store.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Store.daos.CategoryDao;
import com.example.Store.entities.Category;

@Transactional
@Service
public class CategoryServiceImpl {
	
	@Autowired
	private CategoryDao categoryDao;
	
	  public List<Category> findAll(){
		  
			 
			return categoryDao.findAll();
			  
		  }

}
