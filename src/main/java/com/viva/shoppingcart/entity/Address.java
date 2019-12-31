package com.viva.shoppingcart.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id
	private double id;
	private String flatno;
	private String street;
	private String city;
	private String state;
	private String country;
	private String postalCode;
	private double userId;
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public String getFlatno() {
		return flatno;
	}
	public void setFlatno(String flatno) {
		this.flatno = flatno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public double getUserId() {
		return userId;
	}
	public void setUserId(double userId) {
		this.userId = userId;
	}
	
}
