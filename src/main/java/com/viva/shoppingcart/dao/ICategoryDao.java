package com.viva.shoppingcart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viva.shoppingcart.entity.Category;
import com.viva.shoppingcart.entity.User;

public interface ICategoryDao extends JpaRepository<Category, Integer> {

}
