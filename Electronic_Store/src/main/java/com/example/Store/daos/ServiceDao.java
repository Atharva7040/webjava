package com.example.Store.daos;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.Store.entities.Services;

public interface ServiceDao extends JpaRepository<Services, Integer>{
	
	public List<Services> findAll();
	
	

	Services save(Services serv);
	
}
