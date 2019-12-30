package com.viva.shoppingcart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viva.shoppingcart.dao.IUserDao;

@Service
public class UserService {
	@Autowired
	private IUserDao iUserDao;
}
