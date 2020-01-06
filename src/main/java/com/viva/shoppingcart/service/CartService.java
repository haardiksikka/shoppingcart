package com.viva.shoppingcart.service;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viva.shoppingcart.dao.ICartRepository;
import com.viva.shoppingcart.entity.Cart;
import com.viva.shoppingcart.entity.CartHelper;
import com.viva.shoppingcart.entity.Product;

@Service
public class CartService {
	@Autowired
	public ProductService productService;
	
	@Autowired
	ICartRepository cartRepo;
	
	public Cart addToCart(CartHelper cart) {
		Cart cartItem = new Cart();
		Product product = productService.getProductById(cart.getProductId());
		Timestamp timestamp= new Timestamp(System.currentTimeMillis());
		cartItem.setId(timestamp.getTime());
		cartItem.setUserId(cart.getUserId());
		cartItem.setProductsInCart(product);
		return cartRepo.save(cartItem);
	}
}
