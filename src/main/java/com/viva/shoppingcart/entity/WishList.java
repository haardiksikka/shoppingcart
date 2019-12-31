package com.viva.shoppingcart.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class WishList {
	@Id
	private double id;
//	@OneToMany(targetEntity=Product.class, mappedBy="WishList", fetch=FetchType.EAGER)
	@ManyToOne
	private Product productsInWishList;
	private double userId;
	
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public Product getProductsInWishList() {
		return productsInWishList;
	}
	public void setProductsInWishList(Product productsInWishList) {
		this.productsInWishList = productsInWishList;
	}
	public double getUserId() {
		return userId;
	}
	public void setUserId(double userId) {
		this.userId = userId;
	}
	
}
