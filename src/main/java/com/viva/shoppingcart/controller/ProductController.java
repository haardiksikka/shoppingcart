package com.viva.shoppingcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
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
		System.out.println(product);
		return productService.addProduct(product);
	}
	@RequestMapping("/getproduct/{id}")
	public List<Product> getProductsByVendorId(@PathVariable("id") double id){
		return productService.getProductByVendorId(id);
	}
	
	@RequestMapping("/getallproducts")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@RequestMapping("/product/{id}")
	public Product getProduct(@PathVariable("id") double id) {
		System.out.println(id);
		return productService.getProductById(id);
	}
	
}
