package com.viva.shoppingcart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viva.shoppingcart.dao.ICategoryDao;
import com.viva.shoppingcart.entity.Category;

@Service
public class CategoryService {
	
	@Autowired
	ICategoryDao iCategoryDao;
	
	public List<Category> getCategories(){
		return iCategoryDao.findAll();
	}

}
