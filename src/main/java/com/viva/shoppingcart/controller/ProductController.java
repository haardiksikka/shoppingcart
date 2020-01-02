package com.viva.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viva.shoppingcart.entity.Product;
import com.viva.shoppingcart.service.ProductService;


@RestController
@CrossOrigin
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/addproduct")
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
}
