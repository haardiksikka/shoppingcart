package com.viva.shoppingcart.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductCount {

		@Id
		public double id;
		public double productId;
		public long quantity;
		
		public double getId() {
			return id;
		}
		public void setId(double id) {
			this.id = id;
		}
		public double getProductId() {
			return productId;
		}
		public void setProductId(double productId) {
			this.productId = productId;
		}
		public long getQuantity() {
			return quantity;
		}
		public void setQuantity(long quantity) {
			this.quantity = quantity;
		}
		
}
