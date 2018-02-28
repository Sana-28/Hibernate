package com.bridgeit.model;

/**
 * Purpose: This class Employee contain a setter and getter methods to set and
 * get values from DataBase
 * 
 * @author SANA SHAikh
 *
 */
public class Employee {

	private int employeeId;
	private String name;

	private Address address;

	
	public Employee(int employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	
}
