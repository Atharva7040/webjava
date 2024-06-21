package com.example.Store.Credentials;

public class credentials {

	private String email;
	private String password;
	
	public credentials() {
		// TODO Auto-generated constructor stub
	}

	public credentials(String email, String password) {
		super();
		this.email = email;
		this.password = password;
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

	@Override
	public String toString() {
		return "credentials [email=" + email + ", password=" + password + "]";
	}
	
}
