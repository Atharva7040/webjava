package com.example.Store.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Store.daos.ServiceDao;
import com.example.Store.entities.Products;
import com.example.Store.entities.Services;

@Transactional
@Service
public class ServicesDetailsImpl {
	
  @Autowired
  private ServiceDao serviceDao;
  

  public List<Services> findAll(){
	  
	 
	return serviceDao.findAll();
	  
  }
	
  public Services save(Services serv)
	{
		return serviceDao.save(serv);
		
	}
  
  public void deleteById(int sd_id) {
		serviceDao.deleteById(sd_id);
	}
	  
  
  
//  public int updateService(int sd_id) {
//		Optional<Services> op=serviceDao.findById(sd_id);
//		if(op.isPresent()) {
//			Services service =op.get();
//			service.setSd_id(op.get().getSd_id());
//			service.setName(op.get().getName());
//			service.setAddress(op.get().getAddress());
//			service.setPhone(op.get().getPhone());
//			serviceDao.save(service);
//			return 1;
//		}
//		return 0 ;
//		
//}
  
  
  public int updateService(Services service) {
		Optional<Services> op=serviceDao.findById(service.getSd_id());
		if(op.isPresent()) {
			Services p=op.get();
			p.setSd_id(service.getSd_id());
			p.setName(service.getName());
			p.setAddress(service.getAddress());
			p.setPhone(service.getPhone());
			serviceDao.save(p);
			return 1;
		}
		return 0;
	}
  
  
}
