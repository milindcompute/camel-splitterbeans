package com.example.JavaFileCopier;

public class Department {
	 private int id;
	 private String address;
	 private String zip;
	 private String country;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Department(int id, String address, String zip, String country) {
		super();
		this.id = id;
		this.address = address;
		this.zip = zip;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", address=" + address + ", zip=" + zip + ", country=" + country + "]";
	}
	
	
	
	 
	}
