package com.viva.shoppingcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping("/cart/{id}")
	public List<Cart> productsInCart(@PathVariable("id") double id ){
		return cartService.productsInCart(id);
	}
	
	@RequestMapping("/removefromcart")
	public Cart removeFromCart(@RequestBody CartHelper cart) {
		return cartService.removeFromCart(cart);
	}
}
