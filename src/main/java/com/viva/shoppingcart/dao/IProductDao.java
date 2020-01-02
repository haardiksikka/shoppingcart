package com.viva.shoppingcart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viva.shoppingcart.entity.Product;


public interface IProductDao extends JpaRepository<Product, Double> {
	
}
