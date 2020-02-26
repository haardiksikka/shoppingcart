package com.viva.shoppingcart.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viva.shoppingcart.dao.CartDaoImp;
import com.viva.shoppingcart.dao.ICartRepository;
import com.viva.shoppingcart.entity.Cart;
import com.viva.shoppingcart.entity.CartHelper;
import com.viva.shoppingcart.entity.Product;

@Service
public class CartService {
	@Autowired
	public ProductService productService;
	
	@Autowired
	public ICartRepository cartRepo;
	
	@Autowired
	public CartDaoImp cartImp;
	
	public Cart addToCart(CartHelper cart) {
		Cart cartItem = new Cart();
		Cart existingCart = cartImp.productInCart(cart.getProductId());
		if(existingCart == null) {
			Product product = productService.getProductById(cart.getProductId());
			product.setCount(1);
			Timestamp timestamp= new Timestamp(System.currentTimeMillis());
			cartItem.setId(timestamp.getTime());
			cartItem.setUserId(cart.getUserId());			
			cartItem.setProductsInCart(product);
			return cartRepo.save(cartItem);
		}		
		else {
			Product product = existingCart.getProductsInCart();
			int count = product.getCount();
			product.setCount(count+1);			
			return cartRepo.save(existingCart);
		}		
	}
	
	public List<Cart> productsInCart(double id){
		return cartImp.productsInCart(id);
	}
	
	public Cart removeFromCart(CartHelper cart) {
		Cart existingCart = cartImp.productInCart(cart.getProductId());
		Product product = existingCart.getProductsInCart();
		int count = product.getCount();
		product.setCount(count-1);			
		return cartRepo.save(existingCart);
	}
}
