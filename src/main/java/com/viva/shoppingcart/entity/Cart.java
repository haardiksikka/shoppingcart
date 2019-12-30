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
	private long id;
	@ManyToOne
	private Product productsInCart;
	private long userId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Product getProductsInCart() {
		return productsInCart;
	}
	public void setProductsInCart(Product productsInCart) {
		this.productsInCart = productsInCart;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
}
