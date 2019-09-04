package com.pratian.entity;

public class Employee {

	private int id;
	private String name;

	private Address address;

	public Employee() {
		System.out.println("Employee Object Created");
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAdrs() {
		return address;
	}

	public void setAdrs(Address adrs) {
		System.out.println("Address setter method in Employee class");
		this.address = adrs;
	}

}
