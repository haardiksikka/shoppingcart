package com.viva.shoppingcart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viva.shoppingcart.entity.Cart;

public interface ICartRepository extends JpaRepository<Cart,Double> {

}
