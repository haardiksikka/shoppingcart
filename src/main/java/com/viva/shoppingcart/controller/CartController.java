package com.viva.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viva.shoppingcart.entity.Cart;
import com.viva.shoppingcart.entity.CartHelper;
import com.viva.shoppingcart.entity.Product;
import com.viva.shoppingcart.service.CartService;
import com.viva.shoppingcart.service.ProductService;

@RestController
@CrossOrigin
public class CartController {
	
	@Autowired
	public CartService cartService;
	
	@RequestMapping("/addtocart")
	public Cart addToCart(@RequestBody CartHelper cart) {
			//Product product = productService.getProductById(cart.getProductId());
			return cartService.addToCart(cart);			
	}
}
