package com.viva.shoppingcart.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserType {
		@Id
		private double id;
		private String type;
		public double getId() {
			return id;
		}
		public void setId(double id) {
			this.id = id;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		
}
