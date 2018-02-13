package com.rc.mvcApp.dto.register;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "register_table")
public class RegisterDTO implements Serializable {

	@Id
	@GenericGenerator(name = "myId", strategy = "increment")
	@GeneratedValue(generator = "myId")
	@Column(name = "r_id")
	private int id;
	@Column(name = "r_name")
	private String name;
	@Column(name = "r_email")
	private String email;
	@Column(name = "r_address")
	private String address;
	@Column(name = "r_phNo")
	private String phNo;
	@Column(name = "r_password")
	private String password;

	public RegisterDTO() {
		System.out.println(this.getClass().getSimpleName() + "created...");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
