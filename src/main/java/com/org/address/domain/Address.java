package com.org.address.domain;

import java.io.Serializable;

public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1772727578224763785L;
	
	private int addressId;
	private String line1;
	private String line2;
	private String city;
	private String state;
	private String zip;
	private int empId;
	
	public Address() {}

	public Address(int addressId, String line1, String line2, String city, String state, String zip, int empId) {
		super();
		this.addressId = addressId;
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.empId = empId;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	

}
