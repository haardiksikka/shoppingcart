package com.viva.shoppingcart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viva.shoppingcart.entity.ProductCount;

public interface IProductCount extends JpaRepository<ProductCount, Double> {

}
