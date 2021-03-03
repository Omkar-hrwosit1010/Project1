package com.mindbrowser.assignment.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int empid;
	private String firstname;
	private String lastname;
	private String email;
	private String address;
	private String mobile;
	private String city;
	
	public Employee() {}
	
	public Employee( String firstname, String lastname, String email, String address, String mobile,
			String city) {
		super();
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.address = address;
		this.mobile = mobile;
		this.city = city;
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
