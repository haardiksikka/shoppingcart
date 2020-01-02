package com.viva.shoppingcart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viva.shoppingcart.entity.User;


@Repository
public interface IUserDao extends JpaRepository<User, Double> {
	public User getUserByEmail(User user);	
}
