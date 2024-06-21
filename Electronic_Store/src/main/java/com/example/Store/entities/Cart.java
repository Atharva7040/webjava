package com.example.Store.entities;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;


@Entity
@Table(name= "cart")
public class Cart {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int s_id;
	private int quantity;
	@Column(name="c_id")
	private int customerId;
	@Column(name = "p_id")
	private int addedprodid;
	
	@ManyToOne
	@JoinColumn(name = "p_id",updatable = false,insertable = false)
	private Products product;

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
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

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}

	


}
