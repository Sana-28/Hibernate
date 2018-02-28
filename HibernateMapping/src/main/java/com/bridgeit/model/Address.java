package com.bridgeit.model;

public class Address {
	private int employeeId;
	private String addressLine1, city;
	private Employee employee;

	public Address() {
	}

	public Address(String addressLine1, String city, Employee employee) {
		this.addressLine1 = addressLine1;
		this.city = city;
		this.employee = employee;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
