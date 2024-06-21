package com.example.Store.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ShopResopnse {
	
	static enum Status
	{
		success,error
	}
	
	private Status status;
	private Object data;
	private String error;
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public ShopResopnse(Status status, Object data, String error) {
		super();
		this.status = status;
		this.data = data;
		this.error = error;
	}
	
	public static ShopResopnse success(Object data)
	{
		ShopResopnse res = new ShopResopnse(Status.success, data, null);
		return res;
	}
	
	public static ShopResopnse error(String error)
	{
		ShopResopnse res = new ShopResopnse(Status.error, null, error);
		return res;
	}
	

}
