package com.viva.shoppingcart.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cart {
	@Id
	private double id;
	@ManyToOne
	private Product productsInCart;
	private double userId;
	
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public Product getProductsInCart() {
		return productsInCart;
	}
	public void setProductsInCart(Product productsInCart) {
		//this.productsInCart = new Prosuct
		this.productsInCart = productsInCart;
	}
	public double getUserId() {
		return userId;
	}
	public void setUserId(double userId) {
		this.userId = userId;
	}
	
}
