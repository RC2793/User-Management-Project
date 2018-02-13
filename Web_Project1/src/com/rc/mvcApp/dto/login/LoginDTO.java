package com.rc.mvcApp.dto.login;

public class LoginDTO {
	
	private String name;
	private String password;
	
	public LoginDTO() {
		System.out.println(this.getClass().getSimpleName()+"created...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
