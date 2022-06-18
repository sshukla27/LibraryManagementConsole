package com.sudha;

import java.time.LocalDate;

public class User {
	
	private int userId;
	 private String address;
	private long contactNumber;
	private LocalDate regDate;
	private String readerName;
	private int roleId;
	private String email;
	private String pwd;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public LocalDate getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
	public String getReaderName() {
		return readerName;
	}
	public void setReaderName(String readerName) {
		this.readerName = readerName;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	

	public User() {
	
		this.userId = 0;
		this.address = "";
		this.contactNumber = 0;
		//this.regDate = regDate;
		this.readerName = "";
		this.roleId = 0;
		this.email = "";
		this.pwd = "";
	}
	
	public User(int userId, String address, long contactNumber, String readerName, String email, String pwd) {
		super();
		this.userId = userId;
		this.address = address;
		this.contactNumber = contactNumber;
		this.regDate = LocalDate.now();
		this.readerName = readerName;
		this.email = email;
		this.roleId = 2;
		this.pwd = pwd;
	}
}
