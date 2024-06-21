package com.example.Store.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Store.entities.Category;




public interface CategoryDao extends JpaRepository<Category, Integer> {

	public List<Category> findAll();
}
