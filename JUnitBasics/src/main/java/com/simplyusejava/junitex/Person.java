package com.simplyusejava.junitex;

public class Person {
	
	private int id;
	
	private String name;
	
	private double salary;
	
	private Address address;

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getAddressLineWithPersonId(Person p) {
		Address address = p.getAddress();
		return address.getAddressLine1()+String.valueOf(p.getId());
	}
	
	


}
