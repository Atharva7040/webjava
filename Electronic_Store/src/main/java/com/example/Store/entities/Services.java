package com.example.Store.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="services")
public class Services {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int sd_id;
	private String name;
	private String address;
	private String phone;
	public Services() {
		super();
	}
	public Services(int sd_id, String name, String address, String phone) {
		super();
		this.sd_id = sd_id;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public int getSd_id() {
		return sd_id;
	}
	public void setSd_id(int sd_id) {
		this.sd_id = sd_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Service [sd_id=" + sd_id + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
	

}
