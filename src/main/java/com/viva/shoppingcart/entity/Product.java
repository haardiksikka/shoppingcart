package com.viva.shoppingcart.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private double id;
	private String name;
	private String price;
	public static long quantity;
	private String category;
	private double vendorId;
	private int count;
	
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public static long getQuantity() {
		return quantity;
	}
	public static void setQuantity(long quantity) {
		Product.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getVendorId() {
		return vendorId;
	}
	public void setVendorId(double vendorId) {
		this.vendorId = vendorId;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + ", vendorId="
				+ vendorId + ", count=" + count + "]";
	}
	
}
