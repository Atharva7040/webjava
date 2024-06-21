package com.example.Store.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int t_id;
	private String name;
	
	public Category() {
		super();
	}

	public Category(int t_id, String name) {
		super();
		this.t_id = t_id;
		this.name = name;
	}

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Category [t_id=" + t_id + ", name=" + name + "]";
	}

	
}
