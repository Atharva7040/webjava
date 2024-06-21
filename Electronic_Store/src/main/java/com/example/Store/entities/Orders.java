package com.example.Store.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "orders")
public class Orders {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int o_id;
	private int quantity;
	
	@Column(name="c_id")
	private int customerId;
	@Column(name = "p_id")
	private int addedprodid;
	
//	@ManyToOne
//	@JoinColumn(name = "p_id",updatable = false,insertable = false)
//	private Products product;

	
	public Orders() {
		// TODO Auto-generated constructor stub
	}




	public Orders(int o_id, int quantity, int customerId, int addedprodid, Products product) {
		super();
		this.o_id = o_id;
		this.quantity = quantity;
		this.customerId = customerId;
		this.addedprodid = addedprodid;
//		this.product = product;
	}




	public int getO_id() {
		return o_id;
	}




	public void setO_id(int o_id) {
		this.o_id = o_id;
	}




	public int getQuantity() {
		return quantity;
	}




	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}




	public int getCustomerId() {
		return customerId;
	}




	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}




	public int getAddedprodid() {
		return addedprodid;
	}




	public void setAddedprodid(int addedprodid) {
		this.addedprodid = addedprodid;
	}




//	public Products getProduct() {
//		return product;
//	}
//
//
//
//
//	public void setProduct(Products product) {
//		this.product = product;
//	}




	
	
}
