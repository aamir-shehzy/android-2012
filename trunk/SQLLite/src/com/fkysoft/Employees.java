package com.fkysoft;

public class Employees {
	private int id;
	private String name;
	private String phone;
	
	public Employees(){}
	
	public Employees(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	public Employees(int id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
