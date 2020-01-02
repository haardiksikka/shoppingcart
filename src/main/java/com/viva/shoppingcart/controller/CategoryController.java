package com.viva.shoppingcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viva.shoppingcart.entity.Category;
import com.viva.shoppingcart.entity.Product;
import com.viva.shoppingcart.service.CategoryService;

@CrossOrigin
@RestController
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("/getcategories")
	public List<Category> getCategories(){
		return categoryService.getCategories();
	}
	
	
	
}
