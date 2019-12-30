package com.viva.shoppingcart.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class WishList {
	@Id
	private long id;
//	@OneToMany(targetEntity=Product.class, mappedBy="WishList", fetch=FetchType.EAGER)
	@ManyToOne
	private Product productsInWishList;
	private long userId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Product getProductsInWishList() {
		return productsInWishList;
	}
	public void setProductsInWishList(Product productsInWishList) {
		this.productsInWishList = productsInWishList;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
}
