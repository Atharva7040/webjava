package com.example.Store.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int a_id;
	private String name;
	private String email;
	private String password;
	
	private String phone;
	
	
	public Admin() {
		super();
	}


	public Admin(int a_id, String name, String email, String password,  String phone) {
		super();
		this.a_id = a_id;
		this.name = name;
		this.email = email;
		this.password = password;
		
		this.phone = phone;
	}


	public int getA_id() {
		return a_id;
	}


	public void setA_id(int a_id) {
		this.a_id = a_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "Admin [a_id=" + a_id + ", name=" + name + ", email=" + email + ", password=" + password + ", phone="
				+ phone + "]";
	}


	
	
	
}
